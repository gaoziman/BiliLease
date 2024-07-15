package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:49
 * @description : 房间&支付方式关联表
 */

@Schema(description = "房间&支付方式关联表")
@Data
@TableName(value = "room_payment_type")
public class RoomPaymentType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "room_id")
    @Schema(description = "房间id")
    private Long roomId;


    @TableField(value = "payment_type_id")
    @Schema(description = "支付类型id")
    private Long paymentTypeId;
}