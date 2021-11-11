package com.example.nacoscloudconsumer.controller;

import com.example.nacoscloudconsumer.client.FeignNacosCloud;
import com.example.nacoscloudprovide.client.FeignNacosCloudProvide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gyingfei
 * @date 2021/11/11
 */
@RestController
public class FeignNacosController {

    @Autowired
    private FeignNacosCloud feignNacosCloud;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/service")
    public String service(){
        return feignNacosCloud.get();
    }

    @GetMapping(value = "/test/{string}")
    public String get(@PathVariable String string){
        return restTemplate.getForObject("http://nacos-cloud-provide/login/get/"+string,String.class);
    }
}
