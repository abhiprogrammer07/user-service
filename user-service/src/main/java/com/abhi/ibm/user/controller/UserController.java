package com.abhi.ibm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.ibm.user.entity.User;
import com.abhi.ibm.user.service.UserService;
import com.abhi.ibm.user.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);

	}
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
		
	}
}
