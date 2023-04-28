package com.kxr.csrs.mapper;

import com.kxr.csrs.entity.Car;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMapper {
    int insertCar(Car car);
    Car selectCarByManufacturer(String manufacturer);
    int updateStockByCname(@Param("cname") String cname,@Param("stock") int stock);
}
