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
 * Данные для подключения устройства к беспроводной сети пользователя. Не хранятся в базе сервиса, а только локально на устройстве и в приложении пользователя. В базе сервиса хранится только идентификатор подключения в локальном хранилище.  По сути не является компонентом API шлюза, описание добавлено для справки. 
 */
@Schema(description = "Данные для подключения устройства к беспроводной сети пользователя. Не хранятся в базе сервиса, а только локально на устройстве и в приложении пользователя. В базе сервиса хранится только идентификатор подключения в локальном хранилище.  По сути не является компонентом API шлюза, описание добавлено для справки. ")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")


public class Connection   {
  @JsonProperty("connectionId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object connectionId = null;

  @JsonProperty("ssid")

  private Object ssid = null;

  @JsonProperty("passphrase")

  private Object passphrase = null;


  public Connection connectionId(Object connectionId) { 

    this.connectionId = connectionId;
    return this;
  }

  /**
   * Get connectionId
   * @return connectionId
   **/
  
  @Schema(description = "")
  
  public Object getConnectionId() {  
    return connectionId;
  }



  public void setConnectionId(Object connectionId) { 
    this.connectionId = connectionId;
  }

  public Connection ssid(Object ssid) { 

    this.ssid = ssid;
    return this;
  }

  /**
   * Get ssid
   * @return ssid
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getSsid() {  
    return ssid;
  }



  public void setSsid(Object ssid) { 

    this.ssid = ssid;
  }

  public Connection passphrase(Object passphrase) { 

    this.passphrase = passphrase;
    return this;
  }

  /**
   * Get passphrase
   * @return passphrase
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getPassphrase() {  
    return passphrase;
  }



  public void setPassphrase(Object passphrase) { 

    this.passphrase = passphrase;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.connectionId, connection.connectionId) &&
        Objects.equals(this.ssid, connection.ssid) &&
        Objects.equals(this.passphrase, connection.passphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, ssid, passphrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
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
