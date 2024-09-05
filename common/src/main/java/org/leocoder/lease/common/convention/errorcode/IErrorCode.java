package org.leocoder.lease.common.convention.errorcode;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-08-23 11:18
 * @description : 平台错误码接口
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
