package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:49
 * @description : 员工信息表
 */

@Schema(description = "员工信息表")
@Data
@TableName(value = "`system_user`")
public class SystemUser extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "username")
    @Schema(description = "用户名")
    private String username;


    @TableField(value = "`password`")
    @Schema(description = "密码")
    private String password;


    @TableField(value = "`name`")
    @Schema(description = "姓名")
    private String name;


    @TableField(value = "`type`")
    @Schema(description = "用户类型")
    private Byte type;


    @TableField(value = "phone")
    @Schema(description = "手机号码")
    private String phone;


    @TableField(value = "avatar_url")
    @Schema(description = "头像地址")
    private String avatarUrl;


    @TableField(value = "additional_info")
    @Schema(description = "备注信息")
    private String additionalInfo;


    @TableField(value = "post_id")
    @Schema(description = "岗位id")
    private Long postId;


    @TableField(value = "`status`")
    @Schema(description = "账号状态")
    private Byte status;
}