package com.study.models;

public class User {
	private String name;
	private int rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}
