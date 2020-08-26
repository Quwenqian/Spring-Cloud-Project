package com.dfbz.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${content}")
    private String content;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String home(){
        return "hello this is provider "+port+",content is "+content;
    }
}
