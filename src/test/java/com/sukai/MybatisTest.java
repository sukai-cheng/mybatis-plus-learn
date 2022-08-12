//package com.sukai;
//
//import com.alibaba.druid.support.json.JSONUtils;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.sukai.entity.User;
//import com.sukai.mapper.UserMapper;
//import org.json.JSONObject;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//
//@SpringBootTest
//public class MybatisTest {
//    @Resource
//    private UserMapper userMapper;
//
//    public void testSelect() {
//        System.out.println("----- selectAll method test ------");
//        List<User> userList = userMapper.selectList(null);
//        Assertions.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
//    }
//
//    public void testInsert() {
//        System.out.println("----- insert method test");
//        User user = User.builder().id(25L).age(26).email("1710290860@qq.com").name("chengsukai").build();
//        int insert = userMapper.insert(user);
//        System.out.println("----- insert end ------" + insert);
//    }
//
//    @Test
//    public void testPage() {
//        System.out.println("----- page method test");
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        IPage<User> page = new Page<>(1, 2);
//        IPage<User> pageResult = userMapper.selectPage(page, queryWrapper);
//
//        // 获取结果
//        List<User> records = pageResult.getRecords();
//        records.forEach(System.out::println);
//        long pages = pageResult.getPages();
//        System.out.println("总页数: " + pages);
//        System.out.println("总记录数: " + pageResult.getTotal());
//        System.out.println("当前页码 " + pageResult.getCurrent());
//        System.out.println("每页大小 " + pageResult.getSize());
//    }
//
//}
