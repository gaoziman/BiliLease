package org.leocoder.lease.custom.web.admin.config;

import lombok.RequiredArgsConstructor;
import org.leocoder.lease.custom.web.admin.converter.StringToBaseEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-09-08 12:38
 * @description : 自定义WebMvcConfigurer
 */
@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final StringToBaseEnumConverterFactory stringToBaseEnumConverterFactory;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(stringToBaseEnumConverterFactory);
    }
}
