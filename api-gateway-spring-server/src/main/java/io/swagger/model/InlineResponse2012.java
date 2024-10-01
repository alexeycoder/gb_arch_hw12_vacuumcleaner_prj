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
 * InlineResponse2012
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class InlineResponse2012   {
  @JsonProperty("scheduleNum")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object scheduleNum = null;


  public InlineResponse2012 scheduleNum(Object scheduleNum) { 

    this.scheduleNum = scheduleNum;
    return this;
  }

  /**
   * Номер графика в разрезе устройства
   * @return scheduleNum
   **/
  
  @Schema(description = "Номер графика в разрезе устройства")
  
  public Object getScheduleNum() {  
    return scheduleNum;
  }



  public void setScheduleNum(Object scheduleNum) { 
    this.scheduleNum = scheduleNum;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2012 inlineResponse2012 = (InlineResponse2012) o;
    return Objects.equals(this.scheduleNum, inlineResponse2012.scheduleNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012 {\n");
    
    sb.append("    scheduleNum: ").append(toIndentedString(scheduleNum)).append("\n");
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
