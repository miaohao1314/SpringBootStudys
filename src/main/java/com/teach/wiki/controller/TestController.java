package com.teach.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public  String hello(){
        return  "我用idea进行git代码多提交";
    }
}
