package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @date  2024-07-14 21:47
 * @version 1.0
 * @description : 杂项费用值表
 */

@Schema(description="杂项费用值表")
@Data
@TableName(value = "fee_value")
public class FeeValue extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description="费用value")
    private String name;


    @TableField(value = "unit")
    @Schema(description="收费单位")
    private String unit;


    @TableField(value = "fee_key_id")
    @Schema(description="费用所对的fee_key")
    private Long feeKeyId;


}