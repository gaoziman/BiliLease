package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 区域信息
 */

@Schema(description = "区域信息")
@Data
@TableName(value = "district_info")
public class DistrictInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "区域名称")
    private String name;

    @TableField(value = "city_id")
    @Schema(description = "所属城市id")
    private Integer cityId;


}