package com.hxb.springboot.dao.impl;

import com.hxb.springboot.dao.ProductDao;
import com.hxb.springboot.pojo.EASYBUY_PRODUCT;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 和学博
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    private final JdbcTemplate jdbcTemplate;

    final RowMapper<EASYBUY_PRODUCT> productMapper = (resultSet, i) -> {
        int id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String desc = resultSet.getString(3);
        int cid = resultSet.getInt("epc_id");
        String img = resultSet.getString("EP_FILE_NAME");
        int price = resultSet.getInt("EP_PRICE");
        EASYBUY_PRODUCT product = new EASYBUY_PRODUCT();
        product.setEP_ID(id);
        product.setEP_NAME(name);
        product.setEP_DESCRIPTION(desc);
        product.setEPC_ID(cid);
        product.setEP_FILE_NAME(img);
        product.setEP_PRICE(price);
        return product;
    };

    public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EASYBUY_PRODUCT> findByCid(int categoryID) {
        return jdbcTemplate.query("select * from `springboot-tms`.easybuy_product where epc_id=?", productMapper, categoryID);
    }

    @Override
    public EASYBUY_PRODUCT findById(int id) {
        List<EASYBUY_PRODUCT> list = jdbcTemplate.query("select * from `springboot-tms`.easybuy_product where ep_id=?", productMapper, id);
        return list.get(0);
    }
}
