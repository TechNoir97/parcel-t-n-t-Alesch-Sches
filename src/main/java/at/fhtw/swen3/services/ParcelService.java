package at.fhtw.swen3.services;

import at.fhtw.swen3.persistence.entities.ParcelEntity;
import at.fhtw.swen3.services.dto.NewParcelInfo;
import at.fhtw.swen3.services.dto.Parcel;
import at.fhtw.swen3.services.dto.TrackingInformation;

import java.util.List;


public interface ParcelService {


    public NewParcelInfo submitNewParcel(ParcelEntity newParcel) throws BLException;
    public List<Parcel> getParcels();
    public void deleteParcelById(int id);
    public void updateParcelInfo(int id, ParcelEntity parcelEntity) throws BLException;
    public void reportParcelDelivery(String trackingId) throws BLException;
    public void reportParcelHop(String trackingId, String code);
    public TrackingInformation trackParcel(String trackingId);
    public NewParcelInfo transitionParcel(String trackingId, Parcel parcel) throws BLException;


}
