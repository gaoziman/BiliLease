package org.leocoder.lease.custom.web.admin.vo.fee;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.FeeValue;

@Schema(description = "杂费值")
@Data
public class FeeValueVo extends FeeValue {

    @Schema(description = "费用所对的fee_key名称")
    private String feeKeyName;
}
