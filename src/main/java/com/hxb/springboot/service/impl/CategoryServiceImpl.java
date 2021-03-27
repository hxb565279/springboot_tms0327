package com.hxb.springboot.service.impl;

import com.hxb.springboot.dao.CategoryDao;
import com.hxb.springboot.pojo.EASYBUY_PRODUCT_CATEGORY;
import com.hxb.springboot.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Category service.
 *
 * @author 和学博
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryDao categoryDao;

    /**
     * Instantiates a new Category service.
     *
     * @param categoryDao the category dao
     */
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<EASYBUY_PRODUCT_CATEGORY> findAll() {
        return categoryDao.findAll();
    }
}
