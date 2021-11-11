package com.example.nacoscloudconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gyingfei
 * @date 2021/11/11
 */
@FeignClient(value = "nacos-cloud-provide")
public interface FeignNacosCloud {
    /**
     * get
     * @return
     */
    @GetMapping(value = "/service")
    public String get();
}
