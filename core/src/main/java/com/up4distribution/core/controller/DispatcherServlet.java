package com.up4distribution.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.up4distribution.core.context.AppContext;

public class DispatcherServlet extends org.springframework.web.servlet.DispatcherServlet {
    private static final long serialVersionUID = 1L;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.web.servlet.DispatcherServlet#doService(javax.servlet.
     * http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AppContext.init(request, response);
        super.doService(request, response);
    }
}