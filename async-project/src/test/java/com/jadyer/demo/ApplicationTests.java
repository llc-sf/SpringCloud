package com.jadyer.demo;

import com.jadyer.demo.service.AsyncService;
import com.jadyer.demo.service.FutureService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootStarp.class)
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private AsyncService asyncService;
    @Autowired
    private FutureService futureService;

    @Test
    public void test() throws Exception {
        asyncService.send1();
        asyncService.send2();
    }


    @Test
    public void justtest()  {
        Integer user = 20;
        Assert.assertEquals(20, user.intValue());
    }

    @Test
    public void testFuture() throws Exception {
        long startTime = System.currentTimeMillis();

        Future<String> task1 = futureService.send1();
        Future<String> task2 = futureService.send2();

        while (true) {
            if (task1.isDone() && task2.isDone()) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - startTime));
    }


}
