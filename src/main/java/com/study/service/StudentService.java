package com.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.entity.Student;
import com.study.entity.Studentdivision;
import com.study.repository.StudentRepository;
import com.study.repository.StudentdivisionRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private StudentDivisionService studentDivisionService;
	
	@Autowired
	private AddressService addressService;
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void saveStudent() throws Exception {
			Student student = new Student();
			student.setId(999);
			student.setFirstName("stude");
			student.setLastName("patil ");
			System.out.println("stude ");
			studentRepo.save(student);
			studentDivisionService.saveStudentATrasnsactional();
				throw new RuntimeException("Erorrrrr");
		
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Student processStudetDetails(Student student) throws Exception {
			addressService.saveStudentAddress();
			Student  stud =  studentRepo.save(student);	
//				throw new RuntimeException("Erorrrrr");
		return stud;
	}
	
//	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public Student mandateProagation(Student student) throws Exception {
			addressService.mandatoryPropagation();
			Student  stud =  studentRepo.save(student);
		return stud;
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED) 
	public Student neverProagation(Student student) throws Exception {
			addressService.neverPropagation();
			Student  stud =  studentRepo.save(student);
		return stud;
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED) 
	public Student notSupportedProagation(Student student) throws Exception {
			addressService.notSupportedPropagation();
			Student  stud =  studentRepo.save(student);
		return stud;
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED) 
	public Student nonProagation(Student student) throws Exception {
		Student  stud =  studentRepo.save(student);
		addressService.nonPropagation();
		return stud;
	}
}
