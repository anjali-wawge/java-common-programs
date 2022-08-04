package com.ooopsconcept;

interface Animal2 {
	int a = 5;// public static final
	default void run() {
		System.out.println("Animal 2 Java 8 feature default method can be there in interface");
	}
	void walk();// public abstract
}
interface Dog {
	default void run() {
		System.out.println("Dog");
	}
}
class Sheru implements Dog, Animal2 {
	@Override
	public void walk() {
		
		System.out.println("Walk method of sheru class");
	}
	@Override
	public void run() {
		Dog.super.run();
		System.out.println("run method of sheru class");
	}
}

class Cow implements Animal2 {
	public void walk() {
		System.out.println("walk method in cow class");
	}
}

public class InterfaceProgram {
	public static void main(String[] args) {
		/*
		 * Cow c = new Cow(); c.walk();
		 */
		Sheru s = new Sheru();
		s.walk();
		s.run();
	}
}
