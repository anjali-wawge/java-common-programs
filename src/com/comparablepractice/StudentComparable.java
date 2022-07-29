package com.comparablepractice;

public class StudentComparable implements Comparable<StudentComparable> {
	Integer id;
	Integer departmentId;
	String name;
	Integer age;
	String address;
	Integer className;
	String stream;
	Float fees;
	
	@Override
	public String toString() {
		return "StudentComparable [id=" + id + ", departmentId=" + departmentId + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", className=" + className + ", stream=" + stream + ", fees=" + fees + "]";
	}


	public StudentComparable(Integer id, Integer departmentId, String name, Integer age, String address,
			Integer className, String stream, Float fees) {
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


	@Override
	public int compareTo(StudentComparable o) {
		if(this.age<o.age) {
			return -1;
		}
		if(this.age>o.age) {
			return 1;
		}
		if(this.age==o.age) {
		return 0;
		}
		return 0;
	}
}
