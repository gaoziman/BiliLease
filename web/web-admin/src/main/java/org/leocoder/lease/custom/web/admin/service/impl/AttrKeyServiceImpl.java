package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.custom.web.admin.mapper.AttrKeyMapper;
import org.leocoder.lease.model.domain.AttrKey;
import org.leocoder.lease.custom.web.admin.service.AttrKeyService;
/**
 * @author : Leo
 * @date  2024-07-14 21:47
 * @version 1.0
 * @description :
 */

@Service
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey> implements AttrKeyService{

}
