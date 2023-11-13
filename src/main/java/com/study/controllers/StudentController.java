package com.study.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Student;
import com.study.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> saveStudent(@RequestBody Student student) {
			Student stud = studentService.saveStudent(student);
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<?>> getAllStudent() {
		List<Student> stud = studentService.getAllStudent();
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@GetMapping(value = "/saveRandom")
	public ResponseEntity<?> saveRandomStudent() throws Exception {
		 studentService.saveStudent();
		 return new ResponseEntity<>("Success", HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> saveStudentNew(@RequestBody Student student) throws Exception {
			Student stud = studentService.processStudetDetails(student);
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@PostMapping("/never-propation")
	public ResponseEntity<?> saveStudentMandoryPropation(@RequestBody Student student) throws Exception {
			Student stud = studentService.neverProagation(student);
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@PostMapping("/not-supported-propation")
	public ResponseEntity<?> saveStudentNotSupportedPropation(@RequestBody Student student) throws Exception {
			Student stud = studentService.notSupportedProagation(student);
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
	
	@PostMapping("/non-propation")
	public ResponseEntity<?> saveStudentNonPropation(@RequestBody Student student) throws Exception {
			Student stud = studentService.nonProagation(student);
		 return new ResponseEntity<>(stud, HttpStatus.OK);
	}
}
