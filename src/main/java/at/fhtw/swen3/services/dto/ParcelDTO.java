package at.fhtw.swen3.services.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parcel
 */
@Validated
@javax.annotation.Generated(value = "at.fhtw.swen3.codegen.v3.generators.java.SpringCodegen", date = "2022-09-18T11:41:55.463Z[GMT]")


public class ParcelDTO {
  @JsonProperty("weight")
  private Float weight = null;

  @JsonProperty("recipient")
  private RecipientDTO recipient = null;

  @JsonProperty("sender")
  private RecipientDTO sender = null;

  public ParcelDTO weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public ParcelDTO recipient(RecipientDTO recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RecipientDTO getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientDTO recipient) {
    this.recipient = recipient;
  }

  public ParcelDTO sender(RecipientDTO sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public RecipientDTO getSender() {
    return sender;
  }

  public void setSender(RecipientDTO sender) {
    this.sender = sender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelDTO parcel = (ParcelDTO) o;
    return Objects.equals(this.weight, parcel.weight) &&
        Objects.equals(this.recipient, parcel.recipient) &&
        Objects.equals(this.sender, parcel.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, recipient, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parcel {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
