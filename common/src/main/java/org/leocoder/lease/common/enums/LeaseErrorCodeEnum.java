package org.leocoder.lease.common.enums;


import org.leocoder.lease.common.convention.errorcode.IErrorCode;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-23 11:37
 * @description :
 */
public enum LeaseErrorCodeEnum implements IErrorCode {

    // 付款方式相关错误码
    PAYMENT_TYPE_NAME_EXIST("B000201", "付款方式名称已存在"),

    PAYMENT_TYPE_EXIST("B000202", "付款方式名称已存在"),

    PAYMENT_TYPE_SAVE_ERROR("B000203", "付款方式新增失败"),

    PAYMENT_TYPE_UPDATE_ERROR("B000204", "付款方式更新失败"),

    PAYMENT_TYPE_DELETE_ERROR("B000205", "付款方式删除失败"),

    PAYMENT_TYPE_NOT_EXIST("B000206", "付款方式不存在"),



    // 租赁期限相关错误码
    LEASE_TERM_SAVE_ERROR("B000301", "租赁期限新增失败"),

    LEASE_TERM_UPDATE_ERROR("B000302", "租赁期限更新失败"),

    LEASE_TERM_DELETE_ERROR("B000303", "租赁期限删除失败");

    private final String code;

    private final String message;

    LeaseErrorCodeEnum(String code, String message) {
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
