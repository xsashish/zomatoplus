package com.thinkxfactor.zomatoplus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {
	@PostMapping("/create")
	User usr_reg(@RequestBody User user){
		System.out.println(user.toString());
		return user;
	}
	
	@PostMapping("/login")
	public User usr_log(@RequestBody User users) {
		User us1 = new User();
		us1.setUserName(users.getUserName());
		us1.setPassWord(users.getPassWord());
		return us1;		
	}

	

}
