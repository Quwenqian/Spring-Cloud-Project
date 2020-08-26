package com.dfbz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvider02Application.class, args);
    }

}
