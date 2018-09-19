package com.llcoding.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.llcoding.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.hi(name);
    }

}
