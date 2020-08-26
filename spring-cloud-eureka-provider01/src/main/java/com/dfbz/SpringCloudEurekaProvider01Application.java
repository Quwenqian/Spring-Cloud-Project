package com.dfbz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/**
 * 注册当前项目到服务注册中心服务器
 */
@EnableEurekaClient
public class SpringCloudEurekaProvider01Application {



    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider01Application.class, args);
    }

}
