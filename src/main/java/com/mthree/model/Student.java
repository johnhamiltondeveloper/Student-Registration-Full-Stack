package com.mthree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	int age;
	int Mobile;
	String Address;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int age, int mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Mobile = mobile;
		Address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
}
