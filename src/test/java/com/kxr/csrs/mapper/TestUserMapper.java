package com.kxr.csrs.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserMapper {

    ApplicationContext applicationContext;
    UserMapper userMapper;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userMapper = applicationContext.getBean(UserMapper.class);
    }

    @Test
    public void testUpdateStockByUsername() {
        System.out.println(userMapper.updateStockByUsername("张三","库里南 2024款 四座版",-1));
    }
}
