package com.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	
public static void main(String[] args) {
	List<List<Student>> stdList = new ArrayList<List<Student>>();
	List<Student> listStud2 = new ArrayList<>();
	listStud2.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
	listStud2.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
	listStud2.add(new Student(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
	listStud2.add(new Student(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
	stdList.add(listStud2);
		
	Consumer<List<List<Student>>> c= StreamAPIExample::filterFlatMapMethod;
	c.accept(stdList);
}
}
