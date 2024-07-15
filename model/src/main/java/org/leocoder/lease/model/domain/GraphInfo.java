package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 图片信息表
 */

@Schema(description = "图片信息表")
@Data
@TableName(value = "graph_info")
public class GraphInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "图片名称")
    private String name;


    @TableField(value = "item_type")
    @Schema(description = "图片所属对象类型（1:apartment,2:room）")
    private Byte itemType;


    @TableField(value = "item_id")
    @Schema(description = "图片所有对象id")
    private Long itemId;


    @TableField(value = "url")
    @Schema(description = "图片地址")
    private String url;
}