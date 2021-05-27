package com.coding.excercise.demo.user.servcie.repo;

import org.springframework.stereotype.Repository;

import com.coding.excercise.demo.user.controller.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {

}
