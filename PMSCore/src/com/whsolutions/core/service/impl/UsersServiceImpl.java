package com.whsolutions.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.whsolutions.core.dao.PmsUsersDao;
import com.whsolutions.core.service.UsersService;

public class UsersServiceImpl implements UsersService {

	@Autowired
	public PmsUsersDao userDao;
	
	@Transactional
	@Override
	public void addUser() {
		userDao.findById(1);
	}

}
