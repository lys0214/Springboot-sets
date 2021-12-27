package com.lys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    RedisTemplate redisTemplate;

    public void demo(){
        ValueOperations ops=redisTemplate.opsForValue();
        ops.set("age", "100");
        Object age = ops.get("age");
        System.out.println(age);
    }

}
