package org.leocoder.lease.custom.web.admin.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.common.convention.exception.ServiceException;
import org.leocoder.lease.common.enums.LeaseErrorCodeEnum;
import org.leocoder.lease.custom.web.admin.mapper.LeaseTermMapper;
import org.leocoder.lease.custom.web.admin.service.LeaseTermService;
import org.leocoder.lease.model.domain.LeaseTerm;
import org.springframework.stereotype.Service;
/**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description :
 */

@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm> implements LeaseTermService{


    /**
     * 保存或更新LeaseTerm
     * @param leaseTerm LeaseTerm对象
     */
    @Override
    public void saveOrUpdateLeaseTerm(LeaseTerm leaseTerm) {
        Long id = leaseTerm.getId();
        if (ObjectUtil.isNull(id)) {
            // 新增
            int insert = baseMapper.insert(leaseTerm);
            if (insert != 1) {
                throw new ServiceException(LeaseErrorCodeEnum.LEASE_TERM_SAVE_ERROR);
            }
        } else {
            // 更新
            int i = baseMapper.updateById(leaseTerm);
            if (i != 1) {
                throw new ServiceException(LeaseErrorCodeEnum.LEASE_TERM_UPDATE_ERROR);
            }
        }
    }


    /**
     * 根据id删除LeaseTerm
     * @param id id
     */
    @Override
    public void deleteById(Long id) {
        int i = baseMapper.deleteById(id);
        if (i != 1) {
            throw new ServiceException(LeaseErrorCodeEnum.LEASE_TERM_DELETE_ERROR);
        }
    }
}
