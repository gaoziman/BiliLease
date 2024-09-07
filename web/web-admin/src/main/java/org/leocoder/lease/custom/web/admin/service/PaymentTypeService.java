package org.leocoder.lease.custom.web.admin.service;

import org.leocoder.lease.model.domain.PaymentType;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description :
 */

public interface PaymentTypeService extends IService<PaymentType>{


        /**
         * 保存或更新支付方式
         * @param paymentType 支付方式
         */
        void saveOrUpdatePaymentType(PaymentType paymentType);
    }
