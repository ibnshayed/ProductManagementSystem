package com.ibnshayed.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductHomePageController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
}
