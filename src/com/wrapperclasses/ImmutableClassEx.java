package com.wrapperclasses;
final class Employee {
	final String empName;

	public String getEmpName() {
		return empName;
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

}

public class ImmutableClassEx {
	public static void main(String[] args) {
		Employee ex=new Employee("Anjali");
		String s=ex.empName;
		System.out.println(s);
	}
}
