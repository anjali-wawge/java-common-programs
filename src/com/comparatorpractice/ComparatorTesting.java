package com.comparatorpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTesting {
	public static void main(String[] args) {
		List<ITStudent> listStud = new ArrayList<>();
		listStud.add(new ITStudent(1, 1, "Anjali Wawge", 27, "Pune", 1, "CSE", 4000.0f));
		listStud.add(new ITStudent(2, 1, "Pradip Wawge", 32, "Pune", 2, "IT", 25000.0f));
		listStud.add(new ITStudent(3, 1, "A W", 23, "Sasti", 5, "Bsc", 30000.0f));
		listStud.add(new ITStudent(4, 2, "K J", 34, "Ngp", 10, "Mech", 20000.0f));
		
		Collections.sort(listStud,new AgeComparator());
		System.out.println(listStud);
	}
}
