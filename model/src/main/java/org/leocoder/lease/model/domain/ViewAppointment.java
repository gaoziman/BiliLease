package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author : Leo
 * @date  2024-07-14 21:46
 * @version 1.0
 * @description : 预约看房信息表
 */

@Schema(description="预约看房信息表")
@Data
@TableName(value = "view_appointment")
public class ViewAppointment extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "user_id")
    @Schema(description="用户id")
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(value = "`name`")
    @Schema(description="用户姓名")
    private String name;


    @TableField(value = "phone")
    @Schema(description="用户手机号码")
    private String phone;


    @TableField(value = "apartment_id")
    @Schema(description="公寓id")
    private Integer apartmentId;

    @TableField(value = "appointment_time")
    @Schema(description="预约时间")
    private Date appointmentTime;


    @TableField(value = "additional_info")
    @Schema(description="备注信息")
    private String additionalInfo;


    @TableField(value = "appointment_status")
    @Schema(description="预约状态（1:待看房，2:已取消，3已看房）")
    private Byte appointmentStatus;

}