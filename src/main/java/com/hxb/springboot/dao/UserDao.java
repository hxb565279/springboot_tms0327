package com.hxb.springboot.dao;

import com.hxb.springboot.pojo.EASYBUY_USER;

/**
 * The interface User dao.
 *
 * @author 和学博
 */
public interface UserDao {

    /**
     * Login easy user.
     *
     * @param name     the name
     * @param password the password
     * @return the easy user
     */
    EASYBUY_USER login(String name, String password);
}
