package at.fhtw.swen3.persistence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * NewParcelInfo
 */
@Validated
@javax.annotation.Generated(value = "at.fhtw.swen3.codegen.v3.generators.java.SpringCodegen", date = "2022-09-18T11:41:55.463Z[GMT]")


public class NewParcelInfo   {
  @JsonProperty("trackingId")
  private String trackingId = null;

  public NewParcelInfo trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * The tracking ID of the parcel. 
   * @return trackingId
   **/
  @Schema(example = "PYJRB4HZ6", description = "The tracking ID of the parcel. ")
  
  @Pattern(regexp="^[A-Z0-9]{9}$")   public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewParcelInfo newParcelInfo = (NewParcelInfo) o;
    return Objects.equals(this.trackingId, newParcelInfo.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewParcelInfo {\n");
    
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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