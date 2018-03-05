package com.qx.cfg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qx.cfg.bean.User;
import com.qx.cfg.dao.UserDao;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}