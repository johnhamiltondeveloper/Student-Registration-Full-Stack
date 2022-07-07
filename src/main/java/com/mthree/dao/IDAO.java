package com.mthree.dao;

import java.util.List;

import com.mthree.model.Student;

public interface IDAO {
	public List<Student> findAll();
	public Student save(Student student);
}
