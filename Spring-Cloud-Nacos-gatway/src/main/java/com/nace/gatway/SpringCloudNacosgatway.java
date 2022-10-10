package com.nace.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudNacosgatway {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosgatway.class, args);
    }

}
