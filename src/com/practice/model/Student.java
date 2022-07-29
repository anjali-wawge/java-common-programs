package com.practice.model;

public class Student implements Comparable<Student>{

	Integer id;
	Integer departmentId;
	String name;
	Integer age;
	String address;
	Integer className;
	String stream;
	Float fees;
	public Student(Integer id, Integer departmentId, String name, Integer age, String address, Integer className,
			String stream, Float fees) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.className = className;
		this.stream = stream;
		this.fees = fees;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", departmentId=" + departmentId + ", name=" + name + ", age=" + age + ", address="
				+ address + ", className=" + className + ", stream=" + stream + ", fees=" + fees + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s1=(Student)obj;
		return this.id.equals(s1.getId());
	}

	//for TreeSet we need to compare objects according to that it will sort 
	@Override
	public int compareTo(Student o) {
		if(this.id < o.id) {
			return -1;
		}
		if(this.id == o.id) {
			return 0;
		}
		if(this.id > o.id) {
			return 1;
		}
		return 0 ;
	}
	
	
}
