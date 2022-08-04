package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.model.Student;

public class ArrayListPractice {

	public static void main(String[] args) {
		//Arraylist
		List<Student> listStud = new ArrayList<>();
		listStud.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
		listStud.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
		listStud.add(new Student(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
		listStud.add(new Student(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
			
		System.out.println("Print lIst : "+listStud);
		
		listStud.remove(3);
		System.out.println("Remove 3 : "+listStud);
		
		System.out.println("Get At index : "+listStud.get(1));
		
		List<Student> listStud1 = new ArrayList<>();
		listStud1.add(new Student(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
		listStud1.add(new Student(2,1,"Pradip Wawge",32,"Pune",2,"IT",25000.0f));
		//required hash code and equals method for true value of containsAll method which is in Student class
		System.out.println(listStud.containsAll(listStud1));
		
		System.out.println("index of 1"+listStud.indexOf(1));// cant give obj index
		
		//System.out.println("ListSecond(retainAll) deleted from list First:"+listStud.retainAll(listStud1));//listStud1 objects get deleted from listStud
		//System.out.println(listStud);
		
		//iterator
		
		  Iterator iterator=listStud.iterator();
		  while(iterator.hasNext())//hasNext returns true
		  {
			  System.out.println("listStud iteration"+iterator.next());//returns next element in the iteration 
		  }
		 
		
		listStud.set(2, new Student(3, 1, "Shriya Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
		listStud.set(2, new Student(4, 1, "Mina Kale", 30, "Goregaon", 2, "LLB", 33333.0f));

		Iterator  iterator11=listStud.iterator();
		while(iterator11.hasNext()) {
			System.out.println(iterator11.next());//returns next element in the iteration 
		}
		
			
	}
}
