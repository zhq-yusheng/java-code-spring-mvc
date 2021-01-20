package com.yu.mvc.controller;

import com.yu.mvc.pojo.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControllerDemo {

    /*
    前端传的参数和形式参数名字一样时可以直接用
     */
    @GetMapping("/t1")
    public String test1(String name,Model model){
        model.addAttribute("msg",name);
        return "test";//返回的就是一个转发的jsp文件名字
    }


    /*
    前端传的参数和形式参数不一样时使用注解@RequestParam进行绑定
     */
    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        return "test";//返回的就是一个转发的jsp文件名字
    }


    /**
     *
     * @param user 参数是一个对象时候 就会自动进行封装一个实体类
     * @param model
     * @return
     */
    @GetMapping(value = "/getUser")
    public String test(User user,Model model){

        model.addAttribute("msg",user);
        System.out.println(user);
        return "test";
    }


    /*
    RestFul风格传参
    传统传参是:http://localhost:8080/getRestFul?a=10&b=15
    RestFul风格穿参:http://localhost:8080/getRestFul/10/15
    他会把地址后的参数用/分割 保证了安全 也简洁
     */
    @GetMapping("/getRestFul/{a}/{b}")
    public  String RestFul(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","两个数的和是："+res);
        return "test";
    }

    @GetMapping("/servlet")
    public  String servlet(HttpServletRequest request, HttpServletResponse resource){
        // mvc也可以使用servlet的两个对象的
        return "test";
    }
}
