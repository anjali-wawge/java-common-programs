package com.collection.map;

import java.util.Hashtable;

public class HashTablePractice {
public static void main(String[] args) {
	Hashtable<Integer, Integer> h=new Hashtable<>();
	h.put(1,1);
	h.put(3, 5);
	h.put(2, 2);
	h.put(4, 4);
	h.put(0, 2);
	//h.put(null, 0);//key also can not be null
	//h.put(5, null);doesnt allow null
	System.out.println(h);//desc in sorted order,do
	System.out.println(h.size());
}
}
