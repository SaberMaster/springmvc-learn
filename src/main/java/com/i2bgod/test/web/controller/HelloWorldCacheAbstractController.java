package com.i2bgod.test.web.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther: Lyn
 * @data: 2018/9/25
 */
public class HelloWorldCacheAbstractController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().write("<a href=''>this</a>");
        return null;
    }
}
