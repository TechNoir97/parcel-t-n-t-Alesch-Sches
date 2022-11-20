package at.fhtw.swen3.services.impl;

import at.fhtw.swen3.persistence.entities.HopArrivalEntity;
import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.persistence.repositories.ParcelRepository;
import at.fhtw.swen3.persistence.repositories.RecipientRepository;
import at.fhtw.swen3.services.ParcelService;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;
import at.fhtw.swen3.services.mapper.ParcelMapper;
import at.fhtw.swen3.services.validation.Validator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
@Slf4j
public class ParcelServiceImpl implements ParcelService {
    private final ParcelRepository parcelRepo;
    private final RecipientRepository recipientRepo;
    private final Validator validator;

    @Override
    public void submitNewParcel(ParcelEntity newParcel){
        log.info("ParcelServiceImpl: submitNewParcel(): " + newParcel);
        validator.validate(newParcel);
        parcelRepo.save(newParcel);
        recipientRepo.save(newParcel.getRecipient());
        recipientRepo.save(newParcel.getSender());
    }
    @Override
    public List<Parcel> getParcels(){
       List<ParcelEntity> parcelEntities = parcelRepo.findAll();
       List<Parcel> parcels = new ArrayList<>();
        for (ParcelEntity parcelEntity: parcelEntities) {
           parcels.add(ParcelMapper.INSTANCE.entityToDto(parcelEntity));
        }
        log.info("ParcelServiceImpl: getParcels(): " + parcels);
        return parcels;
    }
    @Override
    public void deleteParcelById(int id){
        log.info("ParcelServiceImpl: deleteParcelById(): " + id + "was deleted");
        parcelRepo.deleteById(id);
    }
    @Override
    public void updateParcelInfo(int id, ParcelEntity parcelEntity){
        log.info("ParcelServiceImpl: updateParcelInfo(): " + id + "was updated");
        validator.validate(parcelEntity);
        parcelRepo.save(parcelEntity);
        recipientRepo.save(parcelEntity.getRecipient());
        recipientRepo.save(parcelEntity.getSender());
    }
    @Override
    public void reportParcelDelivery(String trackingId){
        ParcelEntity parcel = parcelRepo.findByTrackingId(trackingId);
        parcel.setState(ParcelEntity.StateEnum.DELIVERED);
        parcelRepo.save(parcel);
    }
    @Override
    public void reportParcelHop(String trackingId, String code){
        /* TODO hier müssen wir noch schauen wie wir das machen sollen
        ParcelEntity parcel = parcelRepo.findByTrackingId(trackingId);
        List<HopArrivalEntity> visitedHops = parcel.getVisitedHops();
        List<HopArrivalEntity> futurreHops = parcel.getFutureHops();
        */
    }
    @Override
    public TrackingInformation trackParcel(String trackingId){
        ParcelEntity parcel = parcelRepo.findByTrackingId(trackingId);
        TrackingInformation information = ParcelMapper.INSTANCE.getModelFromEntity(parcel);
        return information;
    }
    @Override
    public NewParcelInfo transitionParcel(String trackingId, Parcel parcel){
        //TODO noch keine Ahnung was diese Funktion genau machen soll
        return null;
    }


}
