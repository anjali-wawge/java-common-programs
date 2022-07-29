package com.java8practice.functionjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java8practice.StreamAPIExample;
import com.java8practice.Student;


public class ConsumerAcceptEx {
	
public static void main(String[] args) {
	List<List<Student>> stdList = new ArrayList<List<Student>>();
	List<Student> listStud2 = new ArrayList<>();
	listStud2.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
	listStud2.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
	listStud2.add(new Student(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
	listStud2.add(new Student(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
	stdList.add(listStud2);
		
	Consumer<List<List<Student>>> c= StreamAPIExample::filterFlatMapMethod;
	c.accept(stdList);//only printing purpose nothing return
	
	/*
	 * Consumer<List<List<Student>>> c1=s->{System.out.println(s.get(3));
	 * c1.accept(); };
	 */
}
	
}
