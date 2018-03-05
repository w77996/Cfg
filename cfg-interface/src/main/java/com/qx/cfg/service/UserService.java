package com.qx.cfg.service;

import java.util.List;

import com.qx.cfg.bean.User;


public interface UserService {
	  List<User> getAllUser();

	    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

	    User getUserById(Long userId);
}
