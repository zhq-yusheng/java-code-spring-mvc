package com.yu.mvc.controller;

import com.yu.mvc.pojo.User;
import com.yu.mvc.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController 直接返回字符串 不走视图
@Controller
public class JsonController {

    @RequestMapping("/getJson")
    @ResponseBody//不走视图直接返回到页面上 一般配合controller注解使用
 public String getJson(){

     return JsonUtils.getJson(new User("张三",19,11.7));
 }
}
