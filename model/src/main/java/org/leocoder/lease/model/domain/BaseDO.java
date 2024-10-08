package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 22:44
 * @description : 基础实体类
 */
@Data
public class BaseDO implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "主键id")
    private Long id;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @JsonIgnore
    @Schema(description = "创建时间")
    private Date createTime;


    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    @JsonIgnore
    @Schema(description = "更新时间")
    private Date updateTime;


    @TableField(value = "is_deleted",fill = FieldFill.INSERT)
    @Schema(description = "是否删除")
    @JsonIgnore
    @TableLogic
    private Integer isDeleted;
}
