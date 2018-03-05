package com.jadyer.demo.service.impl;

import com.jadyer.demo.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImp implements AsyncService {


    @Async
    @Override
    public void send1() {
        System.out.println("send A");
        Long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }

    @Async
    @Override
    public void send2() {
        System.out.println("send B");
        Long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }
}
