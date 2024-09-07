package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 房间基本属性值表
 */

@Schema(description = "房间基本属性值表")
@Data
@TableName(value = "attr_value")
public class AttrValue  extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "属性value")
    private String name;

    @TableField(value = "attr_key_id")
    @Schema(description = "对应的属性key_id")
    private Long attrKeyId;

}