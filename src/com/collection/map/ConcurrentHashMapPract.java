package com.collection.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPract {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Integer> c=new ConcurrentHashMap<>();
		c.put(1, 1);
		c.put(3, 2);
		c.put(2, 5);
		c.put(0, 4);
		//c.put(5, null);//not allowed
		
		System.out.println(c);//sorted order
		
	}
}
