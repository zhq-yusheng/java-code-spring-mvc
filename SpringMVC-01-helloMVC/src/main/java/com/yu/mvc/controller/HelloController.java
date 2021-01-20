package com.yu.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();
        //模拟业务逻辑层返回的结果
        String result="HelloMvc!";
        //将结果给ModelAndView对象给视图渲染
        mv.addObject("msg",result);
        //设置要跳转视图的名字
        mv.setViewName("test");

        return mv;
    }
}
