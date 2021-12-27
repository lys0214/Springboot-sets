package com.lys;

import com.lys.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    DemoService demoService;

    @Test
    void contextLoads() {
        demoService.demo();
    }

}
