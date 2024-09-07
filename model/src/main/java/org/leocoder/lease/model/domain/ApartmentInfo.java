package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 公寓信息表
 */

@Schema(description = "公寓信息表")
@Data
@TableName(value = "apartment_info")
public class ApartmentInfo  extends BaseDO {
    private static final long serialVersionUID = 1L;


    @TableField(value = "`name`")
    @Schema(description = "公寓名称")
    private String name;

    @TableField(value = "introduction")
    @Schema(description = "公寓介绍")
    private String introduction;


    @TableField(value = "district_id")
    @Schema(description = "所处区域id")
    private Long districtId;


    @TableField(value = "district_name")
    @Schema(description = "区域名称")
    private String districtName;


    @TableField(value = "city_id")
    @Schema(description = "所处城市id")
    private Long cityId;


    @TableField(value = "city_name")
    @Schema(description = "城市名称")
    private String cityName;


    @TableField(value = "province_id")
    @Schema(description = "所处省份id")
    private Long provinceId;


    @TableField(value = "province_name")
    @Schema(description = "省份名称")
    private String provinceName;


    @TableField(value = "address_detail")
    @Schema(description = "详细地址")
    private String addressDetail;


    @TableField(value = "latitude")
    @Schema(description = "经度")
    private String latitude;


    @TableField(value = "longitude")
    @Schema(description = "纬度")
    private String longitude;

    @TableField(value = "phone")
    @Schema(description = "公寓前台电话")
    private String phone;


    @TableField(value = "is_release")
    @Schema(description = "是否发布（1:发布，0:未发布）")
    private Byte isRelease;

}