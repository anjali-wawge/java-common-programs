package com.java8practice.functionjava8;

import java.util.function.Function;

public class FunctionApplyEx {
	public static void main(String[] args) {
		String s="Anjali";
		Function<String,Integer> f=a->a.length();
		System.out.println("Length of string getting return so used function : "+f.apply(s));
	}
}
