package com.yu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcAnnotation {
    @RequestMapping("/hello")
    public String annotationMVC(Model model){
        model.addAttribute("msg","helloWord");
        return "hello";
    }
}
