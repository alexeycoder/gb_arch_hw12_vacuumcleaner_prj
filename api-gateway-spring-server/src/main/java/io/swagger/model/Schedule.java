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
 * Schedule
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class Schedule   {
  @JsonProperty("deviceUuid")

  private Object deviceUuid = null;

  @JsonProperty("dayOfWeek")

  private Object dayOfWeek = null;

  @JsonProperty("timeOfDay")

  private Object timeOfDay = null;

  @JsonProperty("service")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object service = null;


  public Schedule deviceUuid(Object deviceUuid) { 

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

  public Schedule dayOfWeek(Object dayOfWeek) { 

    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getDayOfWeek() {  
    return dayOfWeek;
  }



  public void setDayOfWeek(Object dayOfWeek) { 

    this.dayOfWeek = dayOfWeek;
  }

  public Schedule timeOfDay(Object timeOfDay) { 

    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * Get timeOfDay
   * @return timeOfDay
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getTimeOfDay() {  
    return timeOfDay;
  }



  public void setTimeOfDay(Object timeOfDay) { 

    this.timeOfDay = timeOfDay;
  }

  public Schedule service(Object service) { 

    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  
  @Schema(description = "")
  
  public Object getService() {  
    return service;
  }



  public void setService(Object service) { 
    this.service = service;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.deviceUuid, schedule.deviceUuid) &&
        Objects.equals(this.dayOfWeek, schedule.dayOfWeek) &&
        Objects.equals(this.timeOfDay, schedule.timeOfDay) &&
        Objects.equals(this.service, schedule.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid, dayOfWeek, timeOfDay, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
