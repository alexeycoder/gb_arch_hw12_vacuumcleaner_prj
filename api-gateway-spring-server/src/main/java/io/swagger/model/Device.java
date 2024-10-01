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
 * Device
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class Device   {
  @JsonProperty("deviceUuid")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object deviceUuid = null;

  @JsonProperty("typeId")

  private Object typeId = null;

  @JsonProperty("name")

  private Object name = null;

  @JsonProperty("modelId")

  private Object modelId = null;

  @JsonProperty("serialNum")

  private Object serialNum = null;

  @JsonProperty("firmwareVersion")

  private Object firmwareVersion = null;

  @JsonProperty("connectionId")

  private Object connectionId = null;


  public Device deviceUuid(Object deviceUuid) { 

    this.deviceUuid = deviceUuid;
    return this;
  }

  /**
   * Get deviceUuid
   * @return deviceUuid
   **/
  
  @Schema(description = "")
  
  public Object getDeviceUuid() {  
    return deviceUuid;
  }



  public void setDeviceUuid(Object deviceUuid) { 
    this.deviceUuid = deviceUuid;
  }

  public Device typeId(Object typeId) { 

    this.typeId = typeId;
    return this;
  }

  /**
   * Код производителя типа устройства, например, 1 - робот-пылесос
   * @return typeId
   **/
  
  @Schema(required = true, description = "Код производителя типа устройства, например, 1 - робот-пылесос")
  
  @NotNull
  public Object getTypeId() {  
    return typeId;
  }



  public void setTypeId(Object typeId) { 

    this.typeId = typeId;
  }

  public Device name(Object name) { 

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getName() {  
    return name;
  }



  public void setName(Object name) { 

    this.name = name;
  }

  public Device modelId(Object modelId) { 

    this.modelId = modelId;
    return this;
  }

  /**
   * Get modelId
   * @return modelId
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getModelId() {  
    return modelId;
  }



  public void setModelId(Object modelId) { 

    this.modelId = modelId;
  }

  public Device serialNum(Object serialNum) { 

    this.serialNum = serialNum;
    return this;
  }

  /**
   * Get serialNum
   * @return serialNum
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getSerialNum() {  
    return serialNum;
  }



  public void setSerialNum(Object serialNum) { 

    this.serialNum = serialNum;
  }

  public Device firmwareVersion(Object firmwareVersion) { 

    this.firmwareVersion = firmwareVersion;
    return this;
  }

  /**
   * Get firmwareVersion
   * @return firmwareVersion
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getFirmwareVersion() {  
    return firmwareVersion;
  }



  public void setFirmwareVersion(Object firmwareVersion) { 

    this.firmwareVersion = firmwareVersion;
  }

  public Device connectionId(Object connectionId) { 

    this.connectionId = connectionId;
    return this;
  }

  /**
   * Get connectionId
   * @return connectionId
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getConnectionId() {  
    return connectionId;
  }



  public void setConnectionId(Object connectionId) { 

    this.connectionId = connectionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.deviceUuid, device.deviceUuid) &&
        Objects.equals(this.typeId, device.typeId) &&
        Objects.equals(this.name, device.name) &&
        Objects.equals(this.modelId, device.modelId) &&
        Objects.equals(this.serialNum, device.serialNum) &&
        Objects.equals(this.firmwareVersion, device.firmwareVersion) &&
        Objects.equals(this.connectionId, device.connectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid, typeId, name, modelId, serialNum, firmwareVersion, connectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
