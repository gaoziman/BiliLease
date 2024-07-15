package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description : 房间&基本属性值关联表
 */

@Schema(description="房间&基本属性值关联表")
@Data
@TableName(value = "room_attr_value")
public class RoomAttrValue extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description = "房间id")
    @TableField(value = "room_id")
    private Long roomId;

    @TableField(value = "attr_value_id")
    @Schema(description="属性值id")
    private Long attrValueId;
}