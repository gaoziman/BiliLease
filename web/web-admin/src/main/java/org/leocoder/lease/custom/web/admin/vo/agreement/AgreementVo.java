package org.leocoder.lease.custom.web.admin.vo.agreement;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.*;

@Data
@Schema(description = "租约信息")
public class AgreementVo extends LeaseAgreement {

    @Schema(description = "签约公寓信息")
    private ApartmentInfo apartmentInfo;

    @Schema(description = "签约房间信息")
    private RoomInfo roomInfo;

    @Schema(description = "支付方式")
    private PaymentType paymentType;

    @Schema(description = "租期")
    private LeaseTerm leaseTerm;
}
