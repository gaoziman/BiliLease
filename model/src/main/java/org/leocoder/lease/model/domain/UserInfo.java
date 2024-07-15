package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:36
 * @description : 用户信息表
 */

@Schema(description = "用户信息表")
@Data
@TableName(value = "user_info")
public class UserInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "phone")
    @Schema(description = "手机号码（用做登录用户名）")
    private String phone;


    @TableField(value = "`password`")
    @Schema(description = "密码")
    private String password;


    @TableField(value = "avatar_url")
    @Schema(description = "头像url")
    private String avatarUrl;


    @TableField(value = "nickname")
    @Schema(description = "昵称")
    private String nickname;


    @TableField(value = "`status`")
    @Schema(description = "账号状态")
    private Byte status;
}