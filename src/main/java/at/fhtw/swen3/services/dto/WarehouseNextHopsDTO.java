package at.fhtw.swen3.services.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WarehouseNextHops
 */
@Validated
@javax.annotation.Generated(value = "at.fhtw.swen3.codegen.v3.generators.java.SpringCodegen", date = "2022-09-18T11:41:55.463Z[GMT]")


public class WarehouseNextHopsDTO {
  @JsonProperty("traveltimeMins")
  private Integer traveltimeMins = null;

  @JsonProperty("hop")
  private HopDTO hop = null;

  public WarehouseNextHopsDTO traveltimeMins(Integer traveltimeMins) {
    this.traveltimeMins = traveltimeMins;
    return this;
  }

  /**
   * Get traveltimeMins
   * @return traveltimeMins
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getTraveltimeMins() {
    return traveltimeMins;
  }

  public void setTraveltimeMins(Integer traveltimeMins) {
    this.traveltimeMins = traveltimeMins;
  }

  public WarehouseNextHopsDTO hop(HopDTO hop) {
    this.hop = hop;
    return this;
  }

  /**
   * Get hop
   * @return hop
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public HopDTO getHop() {
    return hop;
  }

  public void setHop(HopDTO hop) {
    this.hop = hop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseNextHopsDTO warehouseNextHopsDTO = (WarehouseNextHopsDTO) o;
    return Objects.equals(this.traveltimeMins, warehouseNextHopsDTO.traveltimeMins) &&
        Objects.equals(this.hop, warehouseNextHopsDTO.hop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traveltimeMins, hop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseNextHops {\n");
    
    sb.append("    traveltimeMins: ").append(toIndentedString(traveltimeMins)).append("\n");
    sb.append("    hop: ").append(toIndentedString(hop)).append("\n");
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
