package com.collection.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPract {
	public static void main(String[] args) {
		Map<Integer, String> treeMap=new TreeMap<>();
		treeMap.put(1, "Anjali");
		treeMap.put(2,"Khadke");
		treeMap.put(0, "Darshita");
		treeMap.put(3, "Darshita");
		treeMap.put(7, null);
		treeMap.put(6, null);
		
		System.out.println(treeMap);//allows null,sorted in asc order,key duplicates not allowed
		
	}
}
