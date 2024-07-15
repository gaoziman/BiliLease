package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.model.domain.ProvinceInfo;
import org.leocoder.lease.custom.web.admin.mapper.ProvinceInfoMapper;
import org.leocoder.lease.custom.web.admin.service.ProvinceInfoService;
/**
 * @author : Leo
 * @date  2024-07-14 21:48
 * @version 1.0
 * @description :
 */

@Service
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo> implements ProvinceInfoService{

}
