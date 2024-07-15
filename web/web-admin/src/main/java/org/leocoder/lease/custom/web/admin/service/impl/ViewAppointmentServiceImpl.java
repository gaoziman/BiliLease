package org.leocoder.lease.custom.web.admin.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.leocoder.lease.custom.web.admin.mapper.ViewAppointmentMapper;
import org.leocoder.lease.model.domain.ViewAppointment;
import org.leocoder.lease.custom.web.admin.service.ViewAppointmentService;
/**
 * @author : Leo
 * @date  2024-07-14 21:46
 * @version 1.0
 * @description :
 */

@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment> implements ViewAppointmentService{

}
