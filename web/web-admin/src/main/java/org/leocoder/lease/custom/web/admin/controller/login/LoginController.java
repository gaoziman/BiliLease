package org.leocoder.lease.custom.web.admin.controller.login;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.result.Result;
import org.leocoder.lease.custom.web.admin.vo.login.CaptchaVo;
import org.leocoder.lease.custom.web.admin.vo.login.LoginVo;
import org.leocoder.lease.custom.web.admin.vo.system.user.SystemUserInfoVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-15 10:36
 * @description : 登录管理
 */
@Tag(name = "后台管理系统登录管理")
@RestController
@RequestMapping("/admin")
public class LoginController {

    @Operation(summary = "获取图形验证码")
    @GetMapping("login/captcha")
    public Result<CaptchaVo> getCaptcha() {
        return Result.success();
    }

    @Operation(summary = "登录")
    @PostMapping("login")
    public Result<String> login(@RequestBody LoginVo loginVo) {
        return Result.success();
    }

    @Operation(summary = "获取登陆用户个人信息")
    @GetMapping("info")
    public Result<SystemUserInfoVo> info() {
        return Result.success();
    }
}
