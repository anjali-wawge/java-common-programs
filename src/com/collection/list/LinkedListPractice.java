package com.collection.list;

import java.util.LinkedList;
import java.util.List;

import com.practice.model.Student;

public class LinkedListPractice {
public static void main(String[] args) {
	//LinkedList
			List<Student> linkedList=new LinkedList<>();
			
			linkedList.add(new Student(4, 1, "Neelima Mane", 30, "pune", 2, "Mech", 33333.0f));
			linkedList.add(new Student(1, 1, "Neha Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
			linkedList.add(new Student(2, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));
			linkedList.add(new Student(2, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));

			linkedList.add(new Student(3, 1, "Shriya Kale", 30, "Wadegaon", 2, "IT", 33333.0f));
			
			
			System.out.println(linkedList.get(3));
			linkedList.remove(2);
			System.out.println(linkedList);//not in sorted manner and duplicates are allowed
			
}
}
