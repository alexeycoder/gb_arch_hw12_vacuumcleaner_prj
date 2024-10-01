package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2011
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class InlineResponse2011   {
  @JsonProperty("deviceUuid")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object deviceUuid = null;


  public InlineResponse2011 deviceUuid(Object deviceUuid) { 

    this.deviceUuid = deviceUuid;
    return this;
  }

  /**
   * Уникальный идентификатор добавленного устройства
   * @return deviceUuid
   **/
  
  @Schema(description = "Уникальный идентификатор добавленного устройства")
  
  public Object getDeviceUuid() {  
    return deviceUuid;
  }



  public void setDeviceUuid(Object deviceUuid) { 
    this.deviceUuid = deviceUuid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.deviceUuid, inlineResponse2011.deviceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
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
