package com.yj.shirospringboot;

import com.yj.shirospringboot.entity.User;
import com.yj.shirospringboot.mapper.UserMapper;
import com.yj.shirospringboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShiroSpringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    void test() {
        User user = userService.selectByUsername("111");
        System.out.println(user);
    }
}
