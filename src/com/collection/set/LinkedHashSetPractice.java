package com.collection.set;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.practice.model.Student;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		Set<Student> set= new LinkedHashSet<>();
		set.add(new Student(4, 1, "Neelima Mane", 30, "pune", 2, "Mech", 33333.0f));
		set.add(new Student(1, 2, "Kalyani Mane", 27, "Pune", 15, "IT", 120000.0f));
		set.add(new Student(2, 1, "Neha Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
		set.add(new Student(2, 1, "Mira Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
		set.add(new Student(3, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));
		set.add(new Student(3, 1, "Anjali Kale", 30, "Wadegaon", 2, "IT", 33333.0f));
		
		System.out.println(set);//maintains order ,gives unique
		
		Iterator<Student> iterate=set.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());//not in sorted
		}
	}
}
