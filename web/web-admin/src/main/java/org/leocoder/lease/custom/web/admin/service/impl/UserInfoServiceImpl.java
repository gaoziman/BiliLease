package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.model.domain.UserInfo;
import org.leocoder.lease.custom.web.admin.mapper.UserInfoMapper;
import org.leocoder.lease.custom.web.admin.service.UserInfoService;
/**
 * @author : Leo
 * @date  2024-07-14 21:17
 * @version 1.0
 * @description : 用户信息service实现类
 */

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService{

}
