package com.dfbz.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 用于 调用服务提供者的'/'请求所对应的方法
 */
@RestController
public class CustmerController {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultStore")
    @RequestMapping("/")
    public String home(){
        return restTemplate.getForEntity("http://eureka-provider/",String.class).getBody();
    }


    public String defaultStore(){
        return "Robbin Hystrix 提供者服务挂了。";
    }

}
