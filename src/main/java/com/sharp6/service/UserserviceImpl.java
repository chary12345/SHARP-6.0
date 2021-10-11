package com.sharp6.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sharp6.entity.UserMaster;
import com.sharp6.repostorys.UserRepository;

public class UserserviceImpl implements UserService {
	@Autowired
	UserRepository userdao;

	@Override
	public UserMaster newUserRegister(UserMaster user) {

		UserMaster userObj = new UserMaster();
		try {
			userObj = userdao.save(user);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return userObj;
	}

}
