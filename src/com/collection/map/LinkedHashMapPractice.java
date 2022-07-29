package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	public static void main(String[] args) {
		Map<String, Integer> m=new LinkedHashMap<>();
		m.put("C class", 70);
		m.put("A class", null);
		m.put("B class", 30);
		m.put("B class", 40);
		m.put("E class", 80);
		m.put("D class", null);
		
		System.out.println(m);//not in sorted order,maintain insertion order,duplicates null allowed but key not allowed
		System.out.println(m.replace("D class", null, 33));
		System.out.println(m);
		
		System.out.println(m.keySet());
		
	}
}
