package com.dfbz;

import com.dfbz.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringCloudZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulServiceApplication.class, args);
    }



}
