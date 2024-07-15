package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 省份信息
 */

@Schema
@Data
@TableName(value = "province_info")
public class ProvinceInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "省份名称")
    private String name;

}