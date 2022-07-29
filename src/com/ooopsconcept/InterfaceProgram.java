package com.ooopsconcept;

interface Animal2 {
	int a = 5;// public static final

	default void run() {
		System.out.println("Java 8 feature default method can be there in interface");
	}

	void walk();// public abstract

}

interface Dog extends Animal2 {
	void runDog();
}

class Sheru implements Dog {

	@Override
	public void walk() {
		System.out.println("Walk method of sheru class");
	}

	@Override
	public void runDog() {
		System.out.println("run method of sheu class");
	}
}

class Cow implements Animal2 {
	public void walk() {
		System.out.println("walk method in cow class");
	}
}

public class InterfaceProgram {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.walk();
		Sheru s = new Sheru();
		s.walk();
	}
}
