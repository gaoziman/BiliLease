package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.model.domain.FacilityInfo;
import org.leocoder.lease.custom.web.admin.mapper.FacilityInfoMapper;
import org.leocoder.lease.custom.web.admin.service.FacilityInfoService;
/**
 * @author : Leo
 * @date  2024-07-14 21:47
 * @version 1.0
 * @description :
 */

@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo> implements FacilityInfoService{

}
