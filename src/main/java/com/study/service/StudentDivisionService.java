package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.entity.Address;
import com.study.entity.Studentdivision;
import com.study.repository.StudentdivisionRepository;

@Service
public class StudentDivisionService {
	
	@Autowired
	private StudentdivisionRepository divisionRepository;
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRES_NEW)
	public void saveStudentATrasnsactional() throws Exception {

		for(int i= 30; i<=40 ; i++) {
			Studentdivision div = new Studentdivision();
			div.setStuddiv("A");
			div.setId(i);
			div.setStudentId(99);
			divisionRepository.save(div);
			
		}
//		throw new RuntimeException("Erorrrrr");
		
	}



}
