package com.yuqiyu;

import com.jadyer.demo.DataMybitsBootStarp;
import com.jadyer.demo.entity.User;
import com.jadyer.demo.entity.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataMybitsBootStarp.class)
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByParam() throws Exception {
        userMapper.insert("lulu9", 37);
    }

    @Test
    @Rollback
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "CCC");
        map.put("age", 40);
        userMapper.insertByMap(map);
    }

    @Test
    @Rollback
    public void insertByObject() throws Exception {
        User user = new User();
        user.setName("hah");
        user.setAge(3);
        user.setAddress("address_haha");
        userMapper.insertByUser(user);
    }


    @Test
    @Rollback
    public void test() throws Exception {
        Integer user = 20;
        Assert.assertEquals(20, user.intValue());
    }
}
