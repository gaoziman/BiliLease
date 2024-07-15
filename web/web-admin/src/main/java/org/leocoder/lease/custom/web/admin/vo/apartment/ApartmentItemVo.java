package org.leocoder.lease.custom.web.admin.vo.apartment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.ApartmentInfo;


@Data
@Schema(description = "后台管理系统公寓列表实体")
public class ApartmentItemVo extends ApartmentInfo {

    @Schema(description = "房间总数")
    private Long totalRoomCount;

    @Schema(description = "空闲房间数")
    private Long freeRoomCount;

}
