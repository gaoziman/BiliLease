package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 支付方式表
 */

@Schema(description = "支付方式表")
@Data
@TableName(value = "payment_type")
public class PaymentType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "付款方式名称")
    private String name;

    @TableField(value = "pay_month_count")
    @Schema(description = "每次支付租期数")
    private Integer payMonthCount;

    @TableField(value = "additional_info")
    @Schema(description = "付费说明")
    private String additionalInfo;
}