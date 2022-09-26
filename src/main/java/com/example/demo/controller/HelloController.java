package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/sofiia")
    public String test1(){
        return "sofiia";
	}
    @GetMapping("/karina")
    public String test2(){
        return "karina";
	}
    @GetMapping("/anna")
    public String test3(){
        return "anna";
	}
    @GetMapping("/bohdan")
    public String test4(){
        return "bohdan";
	}
    
}