package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 标签信息表
 */

@Schema(description = "标签信息表")
@Data
@TableName(value = "label_info")
public class LabelInfo extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`type`")
    @Schema(description = "类型（1:公寓标签,2:房间标签）")
    private Byte type;


    @TableField(value = "`name`")
    @Schema(description = "标签名称")
    private String name;

}