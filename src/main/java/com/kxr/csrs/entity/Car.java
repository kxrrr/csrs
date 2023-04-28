package com.kxr.csrs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private int id; //id
    private String cname; //品牌名
    private String manufacturer; //厂商
    private String level; //级别
    private String energyType; //能源类型
    private String listingTime; //上市时间
    private int maxPower; //最大功率
    private int maxTorque; //最大扭矩
    private String engine; //发动机
    private int maxSpeed; //最高车速
    private Double fuelConsumption; //油耗
    private int stock; //库存
}
