package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 通过 @EnableEurekaClient 注解，为服务提供方赋予注册和发现服务的能力
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceProviderBootStarp1 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderBootStarp1.class, args);
    }
}