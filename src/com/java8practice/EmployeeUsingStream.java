package com.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUsingStream {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("A",23,"Male","IT"));
		emp.add(new Employee("Anjali Wawge", 27,"Female", "CSE"));
		emp.add(new Employee("Pradip Wawge",32,"Male","IT"));
		emp.add(new Employee("A W", 23,"Female","CSE"));
		emp.add(new Employee("K J", 34,"Male","Mech"));
		
		//to get distinct dept name
		emp.stream().map(Employee::getDept).distinct().forEach(System.out::println);

		//count of dept
		Map<String,Long> deptCount=
		emp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println(deptCount);
		
		//avg age of male emp and female emp
		Map<String,Double> avgAge=
		emp.stream()
		.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
		
		//get name of person having age greater than 25
		System.out.println(emp.stream().filter(age->age.getAge()>33).collect(Collectors.toList()));
		
		//get list of male emp
		System.out.println(emp.stream().filter(gender->gender.getGender().equals("Male"))
				.collect(Collectors.toList()));
		
		//name Starts with A
		System.out.println(emp.stream().filter(name->name.getName().startsWith("A")).collect(Collectors.toList()));
		
		//
	}
}
