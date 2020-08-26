package com.dfbz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEruekaProvider03Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEruekaProvider03Application.class, args);
    }

}
