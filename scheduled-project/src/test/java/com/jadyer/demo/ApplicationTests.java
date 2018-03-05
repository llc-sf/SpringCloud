package com.jadyer.demo;

import com.jadyer.demo.service.SchedulingServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootStarp.class)
public class ApplicationTests {

    @Autowired
    private SchedulingServiceImp service ;

    @Test
    public void contextLoads() {
        service.reportCurrentTime();
    }



}
