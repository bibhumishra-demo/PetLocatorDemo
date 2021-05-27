package com.coding.excercise.demo.user.servcie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.excercise.demo.user.controller.entity.Users;
import com.coding.excercise.demo.user.servcie.repo.UsersRepo;

@Service
public class UserService {
	
	@Autowired
	private UsersRepo repo;

	public List<Users> saveUsers(List<Users> users) {
		return repo.saveAll(users);
	}

	public Optional<Users> findbyId(long id) {
		return repo.findById(id);
	}

	public List<Users> findAll() {
		return repo.findAll();
	}

}
