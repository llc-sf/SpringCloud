package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderBootStarp2 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderBootStarp2.class, args);
    }
}