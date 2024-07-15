package org.leocoder.lease.custom.web.admin.vo.appointment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.ApartmentInfo;
import org.leocoder.lease.model.domain.ViewAppointment;

@Data
@Schema(description = "预约看房信息")
public class AppointmentVo extends ViewAppointment {

    @Schema(description = "预约公寓信息")
    private ApartmentInfo apartmentInfo;

}
