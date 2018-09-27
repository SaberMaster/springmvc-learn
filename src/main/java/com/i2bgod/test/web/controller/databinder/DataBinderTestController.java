package com.i2bgod.test.web.controller.databinder;

import com.i2bgod.test.web.model.DataBinderTestModel;
import com.i2bgod.test.web.model.PhoneNumberModel;
import com.i2bgod.test.web.model.PhoneNumberModelErrorEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: Lyn
 * @data: 2018/9/27
 */
@Controller
public class DataBinderTestController {
    @RequestMapping(value = "/dataBind")
    public String test(DataBinderTestModel command, Model model) {
        System.out.println(command);
        model.addAttribute("command", model);
        return "user";
    }
//
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        // custom property binder
//        // date
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        CustomDateEditor customDateEditor = new CustomDateEditor(df, true);
//        binder.registerCustomEditor(Date.class, customDateEditor);
//        binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberModelErrorEditor());
//    }
}
