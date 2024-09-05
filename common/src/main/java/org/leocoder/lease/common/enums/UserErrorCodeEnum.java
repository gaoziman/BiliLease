package org.leocoder.lease.common.enums;


import org.leocoder.lease.common.convention.errorcode.IErrorCode;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-23 11:37
 * @description :
 */
public enum UserErrorCodeEnum implements IErrorCode {
    USER_TOKEN_ERROR("A000200", "用户Token验证失败"),

    USER_NOT_EXIST("B000200", "用户记录不存在"),


    USER_NAME__EXIST("B000201", "用户名已存在"),

    USER_EXIST("B000202", "用户记录已存在"),

    USER_SAVE_ERROR("B000203", "用户新增失败"),

    USER_UPDATE_ERROR("B000204", "用户更新失败"),

    USER_DELETE_ERROR("B000205", "用户删除失败"),

    USER_LOGIN_ERROR("B000206", "用户名或密码错误");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

}
