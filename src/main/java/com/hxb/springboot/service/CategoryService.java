package com.hxb.springboot.service;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT_CATEGORY;

import java.util.List;

/**
 * @author 和学博
 */
public interface CategoryService {
    List<EASYBUY_PRODUCT_CATEGORY> findAll();
}
