package com.jadyer.demo.controller;

import com.jadyer.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class UserController {


    @Autowired
    private RedisTemplate redisTemplate;

    public User getUserByIdFromRedis(int userId) {
        User user = new User();
        ValueOperations operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(userId);
        if (hasKey) {
            user = (User) operations.get(userId);
            if (user != null) {
                return user;
            }
        } else {
            user = getUserFromDB(userId);
            // 插入缓存
            operations.set(userId, user, 60 * 30, TimeUnit.SECONDS);
        }
        return user;
    }

    /**
     * 从数据中读取
     *
     * @param userId
     * @return
     */
    private User getUserFromDB(int userId) {
        return new User();
    }
}
