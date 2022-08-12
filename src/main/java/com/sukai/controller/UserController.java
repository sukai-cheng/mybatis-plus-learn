package com.sukai.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.sukai.entity.User;
import com.sukai.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-07-12 22:24
 */
@RequestMapping("/user")
@RestController //代码 return 的值作为 HTTP 请求的内容返回客户端
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/select")
    @DS("slave")
    public List<User> select() {
        return userMapper.list();
    }

    @GetMapping("/insert")
    @DS("master")
    public void insert() {

        User user = User.builder().id(26L).age(26).email("1710290860@qq.com").name("承苏凯").build();

        userMapper.insert(user);
    }
}
