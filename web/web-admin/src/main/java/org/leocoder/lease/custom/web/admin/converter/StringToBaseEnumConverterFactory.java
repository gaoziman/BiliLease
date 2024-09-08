package org.leocoder.lease.custom.web.admin.converter;

import org.leocoder.lease.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-09-08 12:37
 * @description : 自定义转换器，用于将String类型转换为枚举类型
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String, BaseEnum<?>> {

    @Override
    public <T extends BaseEnum<?>> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToBaseEnumConverter<>(targetType);
    }

    private static class StringToBaseEnumConverter<T extends BaseEnum<?>> implements Converter<String, T> {

        private final Class<T> enumType;

        public StringToBaseEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        @Override
        public T convert(String source) {
            for (T enumConstant : enumType.getEnumConstants()) {
                // 使用 BaseEnum 的 getCode() 来进行匹配
                if (enumConstant.getCode().toString().equals(source)) {
                    return enumConstant;
                }
            }
            throw new IllegalArgumentException("Invalid value '" + source + "' for enum " + enumType.getSimpleName());
        }
    }
}
