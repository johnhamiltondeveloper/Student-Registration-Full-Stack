package com.mthree.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mthree.model.Student;

@Repository
public interface StudentJPARepository extends IDAO, JpaRepository<Student, Integer> {

}
