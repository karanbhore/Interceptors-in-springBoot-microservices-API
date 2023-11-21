package com.prowings.interceptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Enumeration;

import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	
    	         // Intercept and log the request body
        logRequestBody(request);
        return true; // Continue with the request handling.
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Logic to be executed after the request is handled but before the view is rendered.
        System.out.println("Post-handle logic");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Logic to be executed after the view has been rendered.
        System.out.println("After-completion logic");
    }
    private void logRequestBody(HttpServletRequest request) throws IOException {
        // Read the request body and log it
    	
    	
        String requestBody = StreamUtils.copyToString(request.getInputStream(), Charset.defaultCharset());
        System.out.println("Request Body: " + requestBody);
    }

}
