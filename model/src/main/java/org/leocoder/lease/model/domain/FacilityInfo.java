package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 配套信息表
 */

@Schema(description = "配套信息表")
@Data
@TableName(value = "facility_info")
public class FacilityInfo  extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`type`")
    @Schema(description = "类型（1:公寓图片,2:房间图片）")
    private Byte type;


    @TableField(value = "`name`")
    @Schema(description = "名称")
    private String name;

    @TableField(value = "icon")
    @Schema(description = "")
    private String icon;


}