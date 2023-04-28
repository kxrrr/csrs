package com.kxr.csrs.mapper;

import com.kxr.csrs.entity.Car;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarMapper {
    ApplicationContext applicationContext;
    CarMapper carMapper;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        carMapper = applicationContext.getBean(CarMapper.class);
    }

    @Test
    public void testInsertCar() {
        Car car = new Car(0, "库里南 2024款 四座版", "劳斯莱斯", "大型SUV", "汽油", "2023.02", 420, 850, "6.7T 571马力 V12", 250, 14.9, 200);
        System.out.println(carMapper.insertCar(car));
    }

    @Test
    public void testSelectCarByManufacturer(){
        System.out.println(carMapper.selectCarByManufacturer("劳斯莱斯"));
    }

    @Test
    public void testUpdateStockByCname() {
        System.out.println(carMapper.updateStockByCname("库里南 2024款 四座版",210));
    }
}
