package com.revature.beans;

public class Person {
	
	private String name;
	
	private String dob;
	
	private String major;

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", major=" + major + "]";
	}

	public Person(String name, String dob, String major) {
		super();
		this.name = name;
		this.dob = dob;
		this.major = major;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
