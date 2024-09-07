package org.leocoder.lease.custom.web.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.leocoder.lease.model.domain.PaymentType;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description :
 */

public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

    @Select("select * from payment_type where name = #{name}")
    PaymentType selectPayTypeByName(@Param("name") String name);
}