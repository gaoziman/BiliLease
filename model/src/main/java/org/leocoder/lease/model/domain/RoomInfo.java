package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 房间信息表
 */

@Schema(description = "房间信息表")
@Data
@TableName(value = "room_info")
public class RoomInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "room_number")
    @Schema(description = "房间号")
    private String roomNumber;

    @TableField(value = "rent")
    @Schema(description = "租金（元/月）")
    private BigDecimal rent;


    @TableField(value = "apartment_id")
    @Schema(description = "所属公寓id")
    private Long apartmentId;


    @TableField(value = "is_release")
    @Schema(description = "是否发布")
    private Byte isRelease;
}