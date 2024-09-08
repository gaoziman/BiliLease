package org.leocoder.lease.custom.web.admin.service;

import org.leocoder.lease.model.domain.LeaseTerm;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description :
 */

public interface LeaseTermService extends IService<LeaseTerm>{


        /**
         * 保存或更新LeaseTerm
         * @param leaseTerm LeaseTerm对象
         */
        void saveOrUpdateLeaseTerm(LeaseTerm leaseTerm);


        /**
         * 根据id删除LeaseTerm
         * @param id id
         */
        void deleteById(Long id);
    }
