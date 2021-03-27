package com.hxb.springboot.dao.impl;

import com.hxb.springboot.dao.CategoryDao;
import com.hxb.springboot.pojo.EASYBUY_PRODUCT_CATEGORY;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Category dao.
 *
 * @author 和学博
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {
    private final JdbcTemplate jdbcTemplate;

    /**
     * The Category mapper.
     */
    final RowMapper<EASYBUY_PRODUCT_CATEGORY> categoryMapper = (resultSet, i) -> {
        int id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        int pid = resultSet.getInt(3);
        return new EASYBUY_PRODUCT_CATEGORY(id,name,pid);
    };

    /**
     * Instantiates a new Category dao.
     *
     * @param jdbcTemplate the jdbc template
     */
    public CategoryDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EASYBUY_PRODUCT_CATEGORY> findAll() {
        return jdbcTemplate.query("select * from `springboot-tms`.easybuy_product_category where EPC_PARENT_ID=0", categoryMapper);
    }
}
