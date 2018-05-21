package com.jun;

import com.jun.mapper.UserMapper;
import com.jun.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import test.config.JUnit4ClassRunner;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:springmvc-config.xml","classpath:mybatis-config.xml"})
public class TestUser {

    @Autowired
    UserMapper userMapper;


    @Test
    public void testGetUserById(){
        User user = userMapper.getUserById(12L);
        System.out.println(user.getName());
    }

}
