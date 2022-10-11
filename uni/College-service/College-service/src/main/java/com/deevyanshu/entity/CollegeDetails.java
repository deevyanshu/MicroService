package com.deevyanshu.entity;

import java.util.List;

public class CollegeDetails {

	private int id;
	
	private String name;
	
	private List<Student> students;
	
	public CollegeDetails() {
		// TODO Auto-generated constructor stub
	}

	public CollegeDetails(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "CollegeDetails [id=" + id + ", name=" + name + ", students=" + students + "]";
	}
	
	
}
