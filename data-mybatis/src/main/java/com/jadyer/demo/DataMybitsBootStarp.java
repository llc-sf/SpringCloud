package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DataMybitsBootStarp {
    public static void main(String[] args) {
        SpringApplication.run(DataMybitsBootStarp.class, args);
    }
}