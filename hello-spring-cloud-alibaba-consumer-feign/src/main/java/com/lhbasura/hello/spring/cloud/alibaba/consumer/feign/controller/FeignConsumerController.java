package com.lhbasura.hello.spring.cloud.alibaba.consumer.feign.controller;

import com.lhbasura.hello.spring.cloud.alibaba.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(String message) {
        return echoService.echo("hello feign");
    }

}
