package com.meco.spinrgdemo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器是用于拦截应用程序的HTTP请求和响应的对象。通过使用过滤器，可以在两个实例上执行两个操作 -
 * 在将请求发送到控制器之前
 * 在向客户发送响应之前
 */
@Component
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Remote Host:"+request.getRemoteHost());
        System.out.println("Remote Address:"+request.getRemoteAddr());
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
