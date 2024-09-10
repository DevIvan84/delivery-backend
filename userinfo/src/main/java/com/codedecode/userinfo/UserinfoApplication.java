package com.codedecode.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserinfoApplication.class, args);
    }

}
