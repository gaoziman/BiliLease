package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 房间&标签关联表
 */

@Schema(description = "房间&标签关联表")
@Data
@TableName(value = "room_label")
public class RoomLabel extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;


    @TableField(value = "label_id")
    @Schema(description = "标签id")
    private Long labelId;
}