package com.java8practice;

public class Employee {

	public String name;
	public int age;
	public String gender;
	public String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String name, int age, String gender, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept + "]";
	}
	
	
	
}
