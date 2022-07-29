package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapPractice {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(2, "Java");
		m.put(3, "Collection");
		m.put(1, "Anjali");
		m.put(4, null);
		m.put(5, "HashMap");
		m.put(6, null);
		m.put(null, "Null value for null key");//allows one null key and multiple null values
		System.out.println(m);//HashMap doesnt maintain insertion order not fix,gives sorted order,duplicate null allowed
		System.out.println(m.entrySet());
		System.out.println(m.get(5));
		
		System.out.println(m.putIfAbsent(0, null));
		System.out.println(m);
		
		m.remove(0);
		System.out.println(m);
		
		m.replace(1, "replace");
		System.out.println(m);
		
		System.out.println(m.containsValue("replace"));
		
		System.out.println(m.keySet());//all keys
		
		Map<String, Integer> m1=new HashMap<>();
		m1.put("C class", 70);
		m1.put("A class", null);
		m1.put("B class", 30);
		m1.put("E class", 80);
		m1.put("D class", null);
		
		System.out.println(m1);
	}
	
}
