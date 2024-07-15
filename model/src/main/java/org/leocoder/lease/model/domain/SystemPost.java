package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @date 2024-07-14 21:49
 * @version 1.0
 * @description :
 */

/**
 * 岗位信息表
 */
@Schema(description = "岗位信息表")
@Data
@TableName(value = "system_post")
public class SystemPost extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "code")
    @Schema(description = "岗位编码")
    private String code;

    @TableField(value = "`name`")
    @Schema(description = "岗位名称")
    private String name;

    @TableField(value = "description")
    @Schema(description = "描述")
    private String description;


    @TableField(value = "`status`")
    @Schema(description = "状态（1正常 0停用）")
    private Boolean status;

}