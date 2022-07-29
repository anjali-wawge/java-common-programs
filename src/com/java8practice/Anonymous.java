package com.java8practice;

@FunctionalInterface
public interface Anonymous {
	default void num(int x) {
		System.out.println("default");
	}
	static void print(int x) {
		System.out.println("static");
	}
	int show(int a,int b);//functional interface coz only one method declaration

}
