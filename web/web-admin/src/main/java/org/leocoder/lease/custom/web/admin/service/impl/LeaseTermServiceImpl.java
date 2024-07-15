package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.custom.web.admin.mapper.LeaseTermMapper;
import org.leocoder.lease.model.domain.LeaseTerm;
import org.leocoder.lease.custom.web.admin.service.LeaseTermService;
/**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description :
 */

@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm> implements LeaseTermService{

}
