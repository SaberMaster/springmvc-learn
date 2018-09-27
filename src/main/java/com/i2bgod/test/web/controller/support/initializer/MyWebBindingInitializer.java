package com.i2bgod.test.web.controller.support.initializer;

import com.i2bgod.test.web.model.PhoneNumberModel;
import com.i2bgod.test.web.model.PhoneNumberModelErrorEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: Lyn
 * @data: 2018/9/27
 */
public class MyWebBindingInitializer implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest) {
        // custom property binder
        // date
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor customDateEditor = new CustomDateEditor(df, true);
        webDataBinder.registerCustomEditor(Date.class, customDateEditor);
        webDataBinder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberModelErrorEditor());
    }
}
