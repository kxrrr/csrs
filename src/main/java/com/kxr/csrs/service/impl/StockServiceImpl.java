package com.kxr.csrs.service.impl;

import com.kxr.csrs.mapper.CarMapper;
import com.kxr.csrs.mapper.UserMapper;
import com.kxr.csrs.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockServiceImpl implements IStockService {

    @Autowired
    private CarMapper carMapper;
    @Autowired
    public UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    //购入
    public Boolean transferStock(String cname, String username, int stock) {
        int count = carMapper.updateStockByCname(cname, -stock);
        count = count + userMapper.updateStockByUsername(username, cname, stock);
        if (count > 1){
            return true;
        }
        return false;
    }
}
