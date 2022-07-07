package com.mthree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.dao.IDAO;
import com.mthree.model.Student;

@Service
public class StudentService implements IService {
	@Autowired
	private IDAO dao;

	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

	@Override
	public Student save(Student student) {
		return dao.save(student);
	}

}
