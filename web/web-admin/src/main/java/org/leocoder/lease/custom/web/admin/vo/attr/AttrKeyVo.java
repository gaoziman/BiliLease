package org.leocoder.lease.custom.web.admin.vo.attr;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.AttrKey;
import org.leocoder.lease.model.domain.AttrValue;

import java.util.List;


@Data
public class AttrKeyVo extends AttrKey {

    @Schema(description = "属性value列表")
    private List<AttrValue> attrValueList;
}
