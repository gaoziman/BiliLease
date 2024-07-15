package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 房间&配套关联表
 */

@Schema(description = "房间&配套关联表")
@Data
@TableName(value = "room_facility")
public class RoomFacility extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;

    /**
     * 房间设施id
     */
    @TableField(value = "facility_id")
    @Schema(description = "房间设施id")
    private Long facilityId;
}