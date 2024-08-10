package com.test02javaeeoucr.test02javaeeoucr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String Home() {
        return "index";
    }
    
}
