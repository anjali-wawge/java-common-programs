package com.java8practice;

import java.util.ArrayList;
import java.util.List;

public class ListObjToArray {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	Integer[] arr=list.stream().toArray(Integer[]::new);
	for(Integer a:arr) {
		System.out.println(a);
	}
}
}
