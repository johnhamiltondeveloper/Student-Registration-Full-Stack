package com.mthree.service;

import java.util.List;

import com.mthree.model.Student;

public interface IService {
	public List<Student> findAll();
	public Student save(Student student);
}
