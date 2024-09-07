package org.leocoder.lease.custom.web.admin.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.common.convention.exception.ServiceException;
import org.leocoder.lease.common.enums.LeaseErrorCodeEnum;
import org.leocoder.lease.custom.web.admin.mapper.PaymentTypeMapper;
import org.leocoder.lease.custom.web.admin.service.PaymentTypeService;
import org.leocoder.lease.model.domain.PaymentType;
import org.springframework.stereotype.Service;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description :
 */

@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType> implements PaymentTypeService {


    /**
     * 保存或更新支付方式
     *
     * @param paymentType 支付方式
     */
    @Override
    public void saveOrUpdatePaymentType(PaymentType paymentType) {
        Long id = paymentType.getId();
        if (ObjectUtil.isNull(id)) {
            // 新增
            // 判断付款方式是否已经存在
            PaymentType existPaymentType = baseMapper.selectPayTypeByName(paymentType.getName());
            if (ObjectUtil.isNotNull(existPaymentType)) {
                throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_EXIST);
            }
            int insert = baseMapper.insert(paymentType);
            if (insert != 1) {
                throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_SAVE_ERROR);
            }
        } else {
            // 更新
            // 判断付款方式是否存在
            if (isExistPaymentType(id)) {
                throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_NOT_EXIST);
            }
            int i = baseMapper.updateById(paymentType);
            if (i != 1) {
                throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_UPDATE_ERROR);
            }
        }
    }

    /**
     * 根据id删除支付方式
     *
     * @param id 支付方式id
     */
    @Override
    public void deleteById(Long id) {
        // 判断付款方式是否存在
        if (isExistPaymentType(id)) {
            throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_NOT_EXIST);
        }
        int i = baseMapper.deleteById(id);
        if (i != 1) {
            throw new ServiceException(LeaseErrorCodeEnum.PAYMENT_TYPE_DELETE_ERROR);
        }
    }


    /**
     * 判断付款方式是否存在
     *
     * @param id 支付方式id
     * return false: 存在; true: 不存在
     */
    public boolean isExistPaymentType(Long id) {
        return baseMapper.selectById(id) == null;
    }
}
