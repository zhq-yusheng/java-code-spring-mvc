package com.yu.mvc.controller;

import com.yu.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFrom {
    /*
    表单提交时使用post方法请求就会出现中文乱码需要加入过滤器
     */
    @RequestMapping("/getFrom")
    public String getFrom(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user.toString());
        return "test";
    }
}
