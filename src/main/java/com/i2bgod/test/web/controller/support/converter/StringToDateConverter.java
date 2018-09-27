package com.i2bgod.test.web.controller.support.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: Lyn
 * @data: 2018/9/27
 */
public class StringToDateConverter implements Converter<String, Date> {
    private String formatter;

    public StringToDateConverter(String formatter) {
        this.formatter = formatter;
    }

    @Override
    public Date convert(String source) {
        if (!StringUtils.hasLength(source)) {
            return null;
        }

        DateFormat dateFormat = new SimpleDateFormat(formatter);
        try {
            return dateFormat.parse(source);
        } catch (Exception e) {
            throw new IllegalArgumentException("trans date error");
        }


    }
}
