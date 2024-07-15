package org.leocoder.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-15 09:46
 * @description :  系统用户类型枚举
 */

public enum SystemUserType implements BaseEnum {

    ADMIN(0, "管理员"),
    COMMON(1, "普通用户");

    @EnumValue
    @JsonValue
    private Integer code;

    private String name;


    SystemUserType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
