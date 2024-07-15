package org.leocoder.lease.custom.web.admin.vo.apartment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.custom.web.admin.vo.fee.FeeValueVo;
import org.leocoder.lease.custom.web.admin.vo.graph.GraphVo;
import org.leocoder.lease.model.domain.ApartmentInfo;
import org.leocoder.lease.model.domain.FacilityInfo;
import org.leocoder.lease.model.domain.LabelInfo;

import java.util.List;

@Schema(description = "公寓信息")
@Data
public class ApartmentDetailVo extends ApartmentInfo {

    @Schema(description = "图片列表")
    private List<GraphVo> graphVoList;

    @Schema(description = "标签列表")
    private List<LabelInfo> labelInfoList;

    @Schema(description = "配套列表")
    private List<FacilityInfo> facilityInfoList;

    @Schema(description = "杂费列表")
    private List<FeeValueVo> feeValueVoList;

}
