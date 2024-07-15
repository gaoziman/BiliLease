package org.leocoder.lease.custom.web.admin.vo.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.enums.BaseStatus;

@Schema(description = "用户信息查询实体")
@Data
public class UserInfoQueryVo {

    @Schema(description = "用户手机号码")
    private String phone;


    @Schema(description = "用户账号状态")
    private BaseStatus status;
}
