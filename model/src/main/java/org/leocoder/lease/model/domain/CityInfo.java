package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 城市信息
 */

@Schema(description = "城市信息")
@Data
@TableName(value = "city_info")
public class CityInfo extends BaseDO {
    private static final long serialVersionUID = 1L;


    @TableField(value = "`name`")
    @Schema(description = "城市名称")
    private String name;


    @TableField(value = "province_id")
    @Schema(description = "所属省份id")
    private Integer provinceId;
}