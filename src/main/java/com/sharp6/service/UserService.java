package com.sharp6.service;

import org.springframework.stereotype.Component;

import com.sharp6.entity.UserMaster;

@Component
public interface UserService {
	
	public UserMaster newUserRegister( UserMaster user);

}
