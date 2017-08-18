package com.up4distribution.core.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppContext {

    private static final ThreadLocal<AppContext> threadLocal = new ThreadLocal<AppContext>();
    private HttpServletRequest                   request;
    private HttpServletResponse                  response;

    public AppContext(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public static AppContext get() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }

    public static void init(HttpServletRequest request, HttpServletResponse response) {
        threadLocal.set(new AppContext(request, response));
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
}
