package com.jadyer.demo.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
class CalculatorService {
    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceToFallback")
    int addService(int a, int b){
        String reqURL = "http://Server/add?a=" + a + "&b=" + b;
        return restTemplate.getForEntity(reqURL, Integer.class).getBody();
    }

    public int addServiceToFallback(int a, int b){
        return -1;
    }
}