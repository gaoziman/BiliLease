package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 租约信息表
 */

@Schema(description = "租约信息表")
@Data
@TableName(value = "lease_agreement")
public class LeaseAgreement extends BaseDO {
    private static final long serialVersionUID = 1L;


    @TableField(value = "phone")
    @Schema(description = "承租人手机号码")
    private String phone;


    @TableField(value = "`name`")
    @Schema(description = "承租人姓名")
    private String name;


    @TableField(value = "identification_number")
    @Schema(description = "承租人身份证号码")
    private String identificationNumber;


    @TableField(value = "apartment_id")
    @Schema(description = "签约公寓id")
    private Long apartmentId;


    @TableField(value = "room_id")
    @Schema(description = "签约房间id")
    private Long roomId;


    @TableField(value = "lease_start_date")
    @Schema(description = "租约开始日期")
    private Date leaseStartDate;


    @TableField(value = "lease_end_date")
    @Schema(description = "租约结束日期")
    private Date leaseEndDate;


    @TableField(value = "lease_term_id")
    @Schema(description = "租期id")
    private Long leaseTermId;


    @TableField(value = "rent")
    @Schema(description = "租金（元/月）")
    private BigDecimal rent;


    @TableField(value = "deposit")
    @Schema(description = "押金（元）")
    private BigDecimal deposit;


    @TableField(value = "payment_type_id")
    @Schema(description = "支付类型id")
    private Long paymentTypeId;


    @TableField(value = "`status`")
    @Schema(description = "租约状态（1:签约待确认，2:已签约，3:已取消，4:已到期，5:退租待确认，6:已退租，7:续约待确认）")
    private Byte status;


    @TableField(value = "source_type")
    @Schema(description = "租约来源（1:新签，2:续约）")
    private Byte sourceType;


    @TableField(value = "additional_info")
    @Schema(description = "备注信息")
    private String additionalInfo;

}