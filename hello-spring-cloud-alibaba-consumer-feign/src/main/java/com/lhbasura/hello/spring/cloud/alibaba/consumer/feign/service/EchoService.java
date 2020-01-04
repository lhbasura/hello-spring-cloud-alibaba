package com.lhbasura.hello.spring.cloud.alibaba.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable("message") String message);

}
