package com.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdivision")
public class Studentdivision {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "studentid")
	private int studentId;

	@Column(name = "studdiv")
	private String studdiv;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStuddiv() {
		return studdiv;
	}

	public void setStuddiv(String studdiv) {
		this.studdiv = studdiv;
	}
}
