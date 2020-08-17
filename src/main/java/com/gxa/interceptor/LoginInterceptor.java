package com.gxa.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor  implements HandlerInterceptor {
    /**
     * 重点掌握拦截前方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //拦截器的逻辑代码
         System.out.printf("拦截到了！");
         //通过判断session会话中保存的数据，来确定是否登录
        //1.先获取session对象
        HttpSession session= httpServletRequest.getSession();
        //2.获取登录成功的数据
        Object admin=session.getAttribute("admin");
        if (admin==null){
            //说明没有登录
            //重定向登录页面
            String contextPath=httpServletRequest.getContextPath();
            httpServletResponse.sendRedirect(contextPath+"/login/page");
        }



        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
