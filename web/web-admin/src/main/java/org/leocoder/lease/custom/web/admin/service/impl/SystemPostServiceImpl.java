package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.model.domain.SystemPost;
import org.leocoder.lease.custom.web.admin.mapper.SystemPostMapper;
import org.leocoder.lease.custom.web.admin.service.SystemPostService;
/**
 * @author : Leo
 * @date  2024-07-14 21:49
 * @version 1.0
 * @description :
 */

@Service
public class SystemPostServiceImpl extends ServiceImpl<SystemPostMapper, SystemPost> implements SystemPostService{

}
