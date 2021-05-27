package com.coding.excercise.demo.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.excercise.demo.user.controller.entity.Users;
import com.coding.excercise.demo.user.servcie.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired 
	private UserService svc;

	@PostMapping("/")
	public List<Users> saveUser(@RequestBody List<Users> users) {
		return svc.saveUsers(users);
	}
	
	@GetMapping("/{id}")
	public Optional<Users> findByOwnerId(@PathVariable("id") long id) {
		return svc.findbyId(id);
		
	}
	
	@GetMapping("/all")
	public List<Users> findByOwnerId() {
		return svc.findAll();
		
	}
}
