package com.hxb.springboot.dao;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT;

import java.util.List;

public interface ProductDao {
//    根据类别ID查询商品
List<EASYBUY_PRODUCT> findByCid(int categoryID);

    EASYBUY_PRODUCT findById(int id);
}
