package com.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
public class StreamAPIExample {

	public static void main(String[] args) {
		List<Student> listStud = new ArrayList<>();
		listStud.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
		listStud.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
		listStud.add(new Student(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
		listStud.add(new Student(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
		filterMethod(listStud);
		filterMapMethod(listStud);
		
		List<List<Student>> stdList = new ArrayList<List<Student>>();
		List<Student> listStud2 = new ArrayList<>();
		listStud2.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
		listStud2.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
		listStud2.add(new Student(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
		listStud2.add(new Student(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
		stdList.add(listStud2);
		stdList.add(listStud);
		
		filterMapMethod1(listStud2);
		filterMapMethod2(listStud2);
		filterMapMethod3(listStud2);
		filterFlatMapMethod(stdList);
		methodReference(listStud);
	
	}
	private static void filterMethod(List<Student> list) {
		List<Student> filteredList = list.stream().filter(obj -> obj.getAge() > 30).collect(Collectors.toList());
		System.out.println("Age > 30 : "+filteredList);
	}
	private static void filterMapMethod(List<Student> list) {	
		List<Student> filteredList = list.stream().filter(obj -> obj.getAge() > 30).map(obj->{
			obj.setFees(obj.getFees()-2000.0f);
			return obj;
		}).collect(Collectors.toList());
		System.out.println("age and fees : "+filteredList);
	}
	//***************
	private static void filterMapMethod1(List<Student> list) {
		List<Student> list1=list.stream().filter(obj-> obj.getAddress()=="Pune").collect(Collectors.toList());
		System.out.println("Adddress =Pune : "+list1);
	}
	private static void filterMapMethod2(List<Student> list) {
		System.out.println("to print using Parallel Stream : ");
		list.parallelStream().forEach((System.out::println));
		
	}
	
	private static void filterMapMethod3(List<Student> list) {
		//List<Student> list3=list.stream().filter().collect(Collectors.toList());
		//list3.forEach(System.out::println);
	}
	public static void filterFlatMapMethod(List<List<Student>> list) {
		List<Student> filteredList = list.stream().flatMap(stdList -> stdList.stream() ).collect(Collectors.toList());
		System.out.println("Flat map : "+filteredList);
	}
	
	private static void consumerMethod(List<List<Student>> list) {
		Consumer<List<List<Student>>> c= StreamAPIExample::filterFlatMapMethod;
		c.accept(list);
	}
	private static void supplierMethod(List<Student> list) {
		
	}
	
	private static void methodReference(List<Student> list) {
		List<String> list1=list.stream().map(Student::getAddress).collect(Collectors.toList());
		System.out.println("using Student class we get data directly : "+list1);
	}
}
