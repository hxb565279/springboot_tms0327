package com.hxb.springboot.service.impl;

import com.hxb.springboot.dao.UserDao;
import com.hxb.springboot.pojo.EASYBUY_USER;
import com.hxb.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * The type User service.
 *
 * @author 和学博
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    /**
     * Instantiates a new User service.
     *
     * @param userDao the user dao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public EASYBUY_USER login(String name, String password) {
        return userDao.login(name,password);
    }
}
