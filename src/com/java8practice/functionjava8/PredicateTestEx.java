package com.java8practice.functionjava8;

import java.util.function.Predicate;

public class PredicateTestEx {
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println("Only true or false return so used Predicate : "+p.test(4));
	}
}
