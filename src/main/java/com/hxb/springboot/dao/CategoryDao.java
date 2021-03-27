package com.hxb.springboot.dao;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT_CATEGORY;

import java.util.List;

/**
 * @author 和学博
 */
public interface CategoryDao {

    List<EASYBUY_PRODUCT_CATEGORY> findAll();
}
