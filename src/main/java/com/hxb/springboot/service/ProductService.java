package com.hxb.springboot.service;

import com.hxb.springboot.pojo.EASYBUY_PRODUCT;

import java.util.List;

/**
 * The interface Product service.
 *
 * @author 和学博
 */
public interface ProductService {

    /**
     * Find by cid list.
     *
     * @param cid the cid
     * @return the list
     */
    List<EASYBUY_PRODUCT> findByCid(int cid);

    /**
     * Find by id easybuy product.
     *
     * @param id the id
     * @return the easybuy product
     */
    EASYBUY_PRODUCT findById(int id);
}
