package com.kxr.csrs.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStockService {

    ApplicationContext applicationContext;
    IStockService stockService;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        stockService = applicationContext.getBean(IStockService.class);
    }

    @Test
    public void testStockService() {
        System.out.println(stockService.transferStock("库里南 2024款 四座版", "张三", 1));
    }
}
