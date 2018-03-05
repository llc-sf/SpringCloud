package com.jadyer.demo.service.impl;

import com.jadyer.demo.service.FutureService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
@Service
public class FutureServiceImp implements FutureService {


    @Async
    @Override
    public Future<String> send1() {
        System.out.println("send 1");
        Long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
        return new AsyncResult<String>("success");
    }

    @Async
    @Override
    public Future<String> send2() {
        System.out.println("send B");
        Long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
        return new AsyncResult<String>("success");
    }
}
