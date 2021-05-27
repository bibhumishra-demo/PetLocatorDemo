package com.coding.excercise.demo.user.controller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Users {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	Long userId;
	@NotNull
	String name;
	String cellNumber;
	Boolean isPremium;
	
	public Users() { }
	
	public Users(Long userId, String name, String cellNumber, Boolean isPremium) {
		super();
		this.userId = userId;
		this.name = name;
		this.cellNumber = cellNumber;
		this.isPremium = isPremium;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", cellNumber=" + cellNumber + ", isPremium=" + isPremium
				+ "]";
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	public Boolean getIsPremium() {
		return isPremium;
	}
	public void setIsPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}
	
}
