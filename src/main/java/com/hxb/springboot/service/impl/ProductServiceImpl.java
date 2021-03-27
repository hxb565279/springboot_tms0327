package com.hxb.springboot.service.impl;

import com.hxb.springboot.dao.ProductDao;
import com.hxb.springboot.pojo.EASYBUY_PRODUCT;
import com.hxb.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 和学博
 */
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<EASYBUY_PRODUCT> findByCid(int cid) {
        return productDao.findByCid(cid);
    }

    @Override
    public EASYBUY_PRODUCT findById(int id) {
        return productDao.findById(id);
    }
}
