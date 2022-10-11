package com.deevyanshu.entity;

public class Student {
	
	private int id;
	
	private String name;
	
	private double marks;
	
	private String college;
	
	private int cid;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, double marks, String college, int cid) {
		super();
		this.name = name;
		this.marks = marks;
		this.college = college;
		this.cid = cid;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", college=" + college + ", cid=" + cid
				+ "]";
	}
	
	
	
}
