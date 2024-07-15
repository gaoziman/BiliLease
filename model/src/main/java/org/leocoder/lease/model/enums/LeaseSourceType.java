package org.leocoder.lease.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author : Leo
 * @date  2024-07-15 09:46
 * @version 1.0
 * @description : 租赁来源类型枚举
 */

public enum LeaseSourceType implements BaseEnum {

    NEW(1, "新签"),
    RENEW(2, "续约");

    @JsonValue
    @EnumValue
    private Integer code;

    private String name;

    LeaseSourceType(Integer code, String name) {
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
