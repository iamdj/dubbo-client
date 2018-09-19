package com.llcoding.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.llcoding.dubbo.service")
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }
}
