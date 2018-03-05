package com.jadyer.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulingServiceImp {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println("现在时间：" + simpleDateFormat.format(new Date()));
    }

}
