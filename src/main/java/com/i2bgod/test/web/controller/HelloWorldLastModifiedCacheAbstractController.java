package com.i2bgod.test.web.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther: Lyn
 * @data: 2018/9/25
 */
public class HelloWorldLastModifiedCacheAbstractController extends AbstractController implements LastModified {
    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().write("<a href=''>this</a>");
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest) {
        if (0L == lastModified) {
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
