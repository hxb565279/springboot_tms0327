package com.hxb.springboot.service;

import com.hxb.springboot.pojo.EASYBUY_USER;

/**
 * The interface User service.
 *
 * @author 和学博
 */
public interface UserService {
    /**
     * Login easy user.
     *
     * @param name     the name
     * @param password the password
     * @return the easy user
     */
    EASYBUY_USER login(String name, String password);
}
