package com.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.practice.model.Student;

public class TreeSetPractice {
public static void main(String[] args) {
	Set<Student> treeSet=new TreeSet<>();
	treeSet.add(new Student(4, 1, "Neelima Mane", 30, "pune", 2, "Mech", 33333.0f));
	treeSet.add(new Student(1, 2, "Kalyani Mane", 27, "Pune", 15, "IT", 120000.0f));
	treeSet.add(new Student(2, 1, "Neha Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
	treeSet.add(new Student(2, 1, "Mira Kale", 30, "Goregaon", 2, "LLB", 33333.0f));
	treeSet.add(new Student(3, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));
	//treeSet.add(new Student(3, 1, "Anjali Kale", 30, "Wadegaon", 2, "IT", 33333.0f));
	
	System.out.println(treeSet);
	System.out.println(treeSet.size());

	Iterator iterate=treeSet.iterator();
	while(iterate.hasNext()) {
		System.out.println(iterate.next());//sorted order unique
	}
	
	Set<Student> treeSet1=new TreeSet<>();
	treeSet1.add(new Student(3, 1, "Shriya Lele", 30, "mumbai", 2, "CSE", 33333.0f));
	//System.out.println(treeSet1.addAll(treeSet));
	// Removing elements from treeSet
    // specified in treeSet1
    // using retainAll() method
	//treeSet.retainAll(treeSet1);
	System.out.println(treeSet);
	
	//System.out.println(treeSet.addAll(treeSet));
}
}
