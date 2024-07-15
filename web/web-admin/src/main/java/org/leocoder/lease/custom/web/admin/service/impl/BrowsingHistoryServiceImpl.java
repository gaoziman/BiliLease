package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.custom.web.admin.mapper.BrowsingHistoryMapper;
import org.leocoder.lease.model.domain.BrowsingHistory;
import org.leocoder.lease.custom.web.admin.service.BrowsingHistoryService;
/**
 * @author : Leo
 * @date  2024-07-14 21:47
 * @version 1.0
 * @description :
 */

@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory> implements BrowsingHistoryService{

}
