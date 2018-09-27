package com.i2bgod.test.web.controller.support.converter;

import com.i2bgod.test.web.model.PhoneNumberModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: Lyn
 * @data: 2018/9/27
 */
public class StringToPhoneNumberConverter implements Converter<String, PhoneNumberModel> {
    Pattern pattern = Pattern.compile("^(\\d{3,4})-(\\d{7,8})$");
    @Override
    public PhoneNumberModel convert(String source) {
        if (!StringUtils.hasLength(source)) {
            return null;
        }

        Matcher matcher = pattern.matcher(source);

        if (matcher.matches()) {
            PhoneNumberModel phoneNumberModel = new PhoneNumberModel();
            phoneNumberModel.setAreaCode(matcher.group(1));
            phoneNumberModel.setPhoneNumber(matcher.group(2));
            return phoneNumberModel;
        } else {
            throw new IllegalArgumentException("trans fail");
        }
    }
}
