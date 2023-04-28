package com.kxr.csrs.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
     int updateStockByUsername(@Param("username") String username,@Param("cname") String cname,@Param("stock") int stock);
}
