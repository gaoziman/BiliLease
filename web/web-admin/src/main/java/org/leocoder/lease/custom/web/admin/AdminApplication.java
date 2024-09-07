package org.leocoder.lease.custom.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-15 10:45
 * @description :
 */
@SpringBootApplication
@ComponentScan(basePackages = {"org.leocoder.lease.custom.web.admin", "org.leocoder.lease.common"})
public class AdminApplication {
    public static void main(String[] args) {
            ConfigurableApplicationContext context = SpringApplication.run(AdminApplication.class, args);
            Environment environment = context.getBean(Environment.class);

            System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
            System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功 ლ(´ڡ`ლ)ﾞ \n");
        }
}
