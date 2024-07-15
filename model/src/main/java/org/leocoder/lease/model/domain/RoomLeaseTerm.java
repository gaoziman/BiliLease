package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 房间租期管理表
 */

@Schema(description = "房间租期管理表")
@Data
@TableName(value = "room_lease_term")
public class RoomLeaseTerm extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;


    @TableField(value = "lease_term_id")
    @Schema(description = "租期id")
    private Long leaseTermId;
}