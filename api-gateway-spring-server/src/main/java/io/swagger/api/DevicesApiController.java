package io.swagger.api;

import io.swagger.model.Device;
import io.swagger.model.DeviceState;
import io.swagger.model.InlineResponse2012;
import io.swagger.model.Schedule;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-01T15:58:00.855480115Z[GMT]")
@RestController
public class DevicesApiController implements DevicesApi {

    private static final Logger log = LoggerFactory.getLogger(DevicesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DevicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2012> addSchedule(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
,@Parameter(in = ParameterIn.DEFAULT, description = "Данные графика работ", required=true, schema=@Schema()) @Valid @RequestBody Schedule body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2012>(objectMapper.readValue("{\n  \"scheduleNum\" : \"\"\n}", InlineResponse2012.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2012>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2012>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDevice(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> findSchedules(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Device> getDevice(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Device>(objectMapper.readValue("{\n  \"deviceUuid\" : \"\",\n  \"serialNum\" : \"\",\n  \"modelId\" : \"\",\n  \"name\" : \"\",\n  \"connectionId\" : \"\",\n  \"typeId\" : \"\",\n  \"firmwareVersion\" : \"\"\n}", Device.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Device>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Device>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DeviceState> getDeviceState(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DeviceState>(objectMapper.readValue("{\n  \"deviceUuid\" : \"\",\n  \"chargeLevel\" : \"\",\n  \"connectionUrl\" : \"\",\n  \"isCharging\" : \"\",\n  \"batteryHealth\" : \"\",\n  \"currentService\" : \"\"\n}", DeviceState.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DeviceState>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DeviceState>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Schedule> getSchedule(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
,@Parameter(in = ParameterIn.PATH, description = "Номер графика работ", required=true, schema=@Schema()) @PathVariable("scheduleNum") Object scheduleNum
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Schedule>(objectMapper.readValue("{\n  \"deviceUuid\" : \"\",\n  \"dayOfWeek\" : \"\",\n  \"service\" : \"\",\n  \"timeOfDay\" : \"\"\n}", Schedule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Schedule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Schedule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDevice(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
,@Parameter(in = ParameterIn.DEFAULT, description = "Данные устройства для обновления", required=true, schema=@Schema()) @Valid @RequestBody Device body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateSchedule(@Parameter(in = ParameterIn.PATH, description = "Уникальный идентификатор устройства", required=true, schema=@Schema()) @PathVariable("deviceUuid") Object deviceUuid
,@Parameter(in = ParameterIn.PATH, description = "Номер графика работ", required=true, schema=@Schema()) @PathVariable("scheduleNum") Object scheduleNum
,@Parameter(in = ParameterIn.DEFAULT, description = "Данные графика работ для обновления", required=true, schema=@Schema()) @Valid @RequestBody Schedule body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
