package com.login.login.service;

import com.login.login.Mapper.UserMapper;
import com.login.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dingwl
 * @date 2020/3/8 9:08
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userDao;

    public User login(String username ,String password){
        return userDao.login(username,password);
    }
}
