package org.leocoder.lease.model.enums;

/**
 * @author : Leo
 * @date  2024-07-15 09:46
 * @version 1.0
 * @description : 基础枚举接口
 */

public interface BaseEnum<T> {

    Integer getCode();

    String getName();
}
