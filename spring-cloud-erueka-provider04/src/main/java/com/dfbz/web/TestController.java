package com.dfbz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/showAll")
    public String orders(){
        return "this is all order message.";
    }

    @RequestMapping("/get")
    public Object get(){

        String url = String.format("httP://%s/","eureka-provider");
        String result =restTemplate.getForObject(url,String.class);

        return result;
    }


}
