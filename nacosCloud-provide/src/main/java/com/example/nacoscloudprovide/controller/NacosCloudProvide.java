package com.example.nacoscloudprovide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyingfei
 * @date 2021/11/11
 */
@RestController
@RequestMapping(value = "/login")
public class NacosCloudProvide {

    @GetMapping(value = "/get/{string}")
    public String get(@PathVariable String string){
        System.out.println("hello nacos.");
        return "hello nacos."+string;
    }
}
