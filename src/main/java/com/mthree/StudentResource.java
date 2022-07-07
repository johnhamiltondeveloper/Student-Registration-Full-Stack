package com.mthree;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.model.Student;
import com.mthree.service.IService;

@RestController
@RequestMapping("/api/v1")
public class StudentResource {
	@Autowired
	IService service;
	
	public StudentResource() {
		System.out.println("You are inside of StudentResource");
	}
	
	@GetMapping(path = "/students")
	
	public List<Student> retrieveAllUsers() {
		System.out.println("Inside of /students controller");
		return service.findAll();
	}
	//int id, String name, int age, int mobile, String address
	@CrossOrigin(origins = "*")
	@GetMapping(path = "/student",produces = "application/json")
	public Student retrieveFakeUser() {
		return new Student(1,"bob",25,234,"sydney");
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(path = "/students", consumes = "application/json")
	public Student createUser(@RequestBody Student student, BindingResult result, Model model) {
//		System.out.println("New Student Object: " + student);
		return service.save(student);
	}
	


}
