package com.jk.service.user.impl;

import com.jk.dao.user.UserDao;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lvlv on 2017/5/25.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
}
