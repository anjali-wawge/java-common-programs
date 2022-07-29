package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.practice.model.Student;

public class HashSetPractice {
public static void main(String[] args) {
	Set<Student> hashSet=new HashSet<>();
	hashSet.add(new Student(4, 1, "Neelima Mane", 30, "pune", 2, "Mech", 33333.0f));
	hashSet.add(new Student(1, 2, "Kalyani Mane", 27, "Pune", 15, "IT", 120000.0f));
	hashSet.add(new Student(2, 1, "Neha Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
	hashSet.add(new Student(2, 1, "Mina Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
	hashSet.add(new Student(3, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));
	hashSet.add(new Student(3, 1, "Shriya Kale", 30, "Wadegaon", 2, "IT", 33333.0f));
	
	System.out.println(hashSet.size());//duplicates are not allowed
	
	System.out.println(hashSet);//gives in sorted order(no matter of insertion and duplicates are not allowed
	
	Iterator<Student> iterate=hashSet.iterator();
	while(iterate.hasNext()) {
		System.out.println(iterate.next());//sorted
	}
  }
}
