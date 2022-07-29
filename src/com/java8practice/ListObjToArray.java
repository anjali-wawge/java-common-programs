package com.java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListObjToArray {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(21);
	list.add(12);
	list.add(3);
	list.add(4);
	
	Integer[] arr=list.stream().toArray(Integer[]::new);//constructor reference
//	System.out.println(Stream.of(arr).findFirst());
	
	//Stream.of(arr).forEach(System.out::println);//to print array
	Stream.of(arr).sorted().forEach(System.out::println);;
	/*
	 * for(Integer a:arr) { System.out.println(a); }
	 */
}
}
