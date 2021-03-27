package com.hxb.springboot.dao.impl;

import com.hxb.springboot.dao.UserDao;
import com.hxb.springboot.pojo.EASYBUY_USER;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 和学博
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;

    final RowMapper<EASYBUY_USER> userMapper = (resultSet, i) -> {
        String id = resultSet.getString(1);
        String name = resultSet.getString(2);
        String password = resultSet.getString(3);

        EASYBUY_USER user = new EASYBUY_USER();
        user.setEU_USER_ID(id);
        user.setEU_USER_NAME(name);
        user.setEU_PASSWORD(password);

        return user;
    };

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public EASYBUY_USER login(String name, String password) {
        List<EASYBUY_USER> list = jdbcTemplate.query("select * from `springboot-tms`.easybuy_user where EU_USER_ID=? and EU_PASSWORD=?", userMapper, name, password);
        if(list.size() != 0){
            return list.get(0);
        }
        return null;
    }
}
