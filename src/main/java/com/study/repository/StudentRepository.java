package com.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.entity.Student;

@Repository("Student")
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
