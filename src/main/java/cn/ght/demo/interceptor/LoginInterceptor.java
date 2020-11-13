package cn.ght.demo.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 *
 * @Author ght
 * @Date 2020/11/12 21:14
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 执行controller方法之前拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("URI:"+request.getRequestURI());
        System.out.println("request.getContextPath() = " + request.getContextPath());
        System.out.println("request.getServletPath() = " + request.getServletPath());
        System.out.println("LoginInterceptor.preHandle");
        return true;
    }
}
