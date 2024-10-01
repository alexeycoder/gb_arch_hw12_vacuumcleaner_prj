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
 * Основные показатели состояния устройства. API сервиса позволяет получить состояние устройства удалённо, когда устройство и клиентское приложение находятся в разных сегментах (разных сетях). В обычном случае, когда устройство и клиентское приложение находяся в одной локальной сети, получение данных о состоянии устройства должно осуществляться приложением напрямую в обход API сервиса. 
 */
@Schema(description = "Основные показатели состояния устройства. API сервиса позволяет получить состояние устройства удалённо, когда устройство и клиентское приложение находятся в разных сегментах (разных сетях). В обычном случае, когда устройство и клиентское приложение находяся в одной локальной сети, получение данных о состоянии устройства должно осуществляться приложением напрямую в обход API сервиса. ")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class DeviceState   {
  @JsonProperty("deviceUuid")

  private Object deviceUuid = null;

  @JsonProperty("chargeLevel")

  private Object chargeLevel = null;

  @JsonProperty("isCharging")

  private Object isCharging = null;

  @JsonProperty("batteryHealth")

  private Object batteryHealth = null;

  @JsonProperty("currentService")

  private Object currentService = null;

  @JsonProperty("connectionUrl")

  private Object connectionUrl = null;


  public DeviceState deviceUuid(Object deviceUuid) { 

    this.deviceUuid = deviceUuid;
    return this;
  }

  /**
   * Get deviceUuid
   * @return deviceUuid
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getDeviceUuid() {  
    return deviceUuid;
  }



  public void setDeviceUuid(Object deviceUuid) { 

    this.deviceUuid = deviceUuid;
  }

  public DeviceState chargeLevel(Object chargeLevel) { 

    this.chargeLevel = chargeLevel;
    return this;
  }

  /**
   * Get chargeLevel
   * @return chargeLevel
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getChargeLevel() {  
    return chargeLevel;
  }



  public void setChargeLevel(Object chargeLevel) { 

    this.chargeLevel = chargeLevel;
  }

  public DeviceState isCharging(Object isCharging) { 

    this.isCharging = isCharging;
    return this;
  }

  /**
   * Get isCharging
   * @return isCharging
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getIsCharging() {  
    return isCharging;
  }



  public void setIsCharging(Object isCharging) { 

    this.isCharging = isCharging;
  }

  public DeviceState batteryHealth(Object batteryHealth) { 

    this.batteryHealth = batteryHealth;
    return this;
  }

  /**
   * Get batteryHealth
   * @return batteryHealth
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getBatteryHealth() {  
    return batteryHealth;
  }



  public void setBatteryHealth(Object batteryHealth) { 

    this.batteryHealth = batteryHealth;
  }

  public DeviceState currentService(Object currentService) { 

    this.currentService = currentService;
    return this;
  }

  /**
   * Get currentService
   * @return currentService
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getCurrentService() {  
    return currentService;
  }



  public void setCurrentService(Object currentService) { 

    this.currentService = currentService;
  }

  public DeviceState connectionUrl(Object connectionUrl) { 

    this.connectionUrl = connectionUrl;
    return this;
  }

  /**
   * Get connectionUrl
   * @return connectionUrl
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getConnectionUrl() {  
    return connectionUrl;
  }



  public void setConnectionUrl(Object connectionUrl) { 

    this.connectionUrl = connectionUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceState deviceState = (DeviceState) o;
    return Objects.equals(this.deviceUuid, deviceState.deviceUuid) &&
        Objects.equals(this.chargeLevel, deviceState.chargeLevel) &&
        Objects.equals(this.isCharging, deviceState.isCharging) &&
        Objects.equals(this.batteryHealth, deviceState.batteryHealth) &&
        Objects.equals(this.currentService, deviceState.currentService) &&
        Objects.equals(this.connectionUrl, deviceState.connectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid, chargeLevel, isCharging, batteryHealth, currentService, connectionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceState {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
    sb.append("    chargeLevel: ").append(toIndentedString(chargeLevel)).append("\n");
    sb.append("    isCharging: ").append(toIndentedString(isCharging)).append("\n");
    sb.append("    batteryHealth: ").append(toIndentedString(batteryHealth)).append("\n");
    sb.append("    currentService: ").append(toIndentedString(currentService)).append("\n");
    sb.append("    connectionUrl: ").append(toIndentedString(connectionUrl)).append("\n");
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
