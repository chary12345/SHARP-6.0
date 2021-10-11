package com.sharp6.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharp6.entity.UserMaster;
import com.sharp6.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/newRegister/")
	public HashMap<String, Object> newUserRegister(@RequestBody UserMaster user) {
		HashMap<String, Object> resultMap = new HashMap<>();
		String[] split = user.getEmail().split("@");
		user.setUserId(split[0]);
		UserMaster registerObj = userService.newUserRegister(user);
		System.out.println("object registerd in db succesfully");
		System.out.println("changes");
		if(registerObj!=null) {
			resultMap.put("status", "success");
			resultMap.put("value", registerObj);
		}else {
			resultMap.put("status", "failure");
			resultMap.put("value", "inpuError");
		}
		return resultMap;
	}
}
