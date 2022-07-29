package com.java8practice;

public class Student{

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
	
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getClassName() {
		return className;
	}

	public void setClassName(Integer className) {
		this.className = className;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
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
}
