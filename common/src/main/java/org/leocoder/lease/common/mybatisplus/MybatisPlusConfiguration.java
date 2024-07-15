package org.leocoder.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 20:35
 * @description :
 */
@Configuration
@MapperScan("org.leocoder.lease.web.*.mapper")
public class MybatisPlusConfiguration {
}
