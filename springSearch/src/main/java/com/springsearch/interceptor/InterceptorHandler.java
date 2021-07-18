package com.springsearch.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptorHandler extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("THis is the preHnadler method");
        String s=request.getParameter("searchBox");
        if(s.startsWith("m")) {
        	response.setContentType("text/html");
        	response.getWriter().println("This is the right page");
        	return false;
        }
		return true;
	}

}
