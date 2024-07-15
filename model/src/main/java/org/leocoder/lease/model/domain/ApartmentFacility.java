package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:46
 * @description : 公寓&配套关联表
 */

@Schema(description = "公寓&配套关联表")
@Data
@TableName(value = "apartment_facility")
public class ApartmentFacility extends BaseEntity {
    private static final long serialVersionUID = 1L;


    @TableField(value = "apartment_id")
    @Schema(description = "公寓id")
    private Long apartmentId;


    @TableField(value = "facility_id")
    @Schema(description = "设施id")
    private Long facilityId;
}