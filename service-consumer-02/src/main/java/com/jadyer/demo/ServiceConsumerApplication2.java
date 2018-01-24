package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Spring Cloud Netflix 的微服务都是以 HTTP 接口的形式暴露的，
 * 可用 Apache 的 HttpClient 或 Spring 的 RestTemplate 调用
 * 而 Feign 是一个使用起來更加方便的 HTTP 客戶端，它用起來就好像调用本地方法一樣，完全感觉不到是调用的远程方法
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServiceConsumerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication2.class, args);
    }
}