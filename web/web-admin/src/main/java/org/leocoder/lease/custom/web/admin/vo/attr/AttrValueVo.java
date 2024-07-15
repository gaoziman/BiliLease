package org.leocoder.lease.custom.web.admin.vo.attr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.AttrValue;


@Schema(description = "属性值")
@Data
public class AttrValueVo extends AttrValue {

    @Schema(description = "对应的属性key_name")
    private String attrKeyName;
}
