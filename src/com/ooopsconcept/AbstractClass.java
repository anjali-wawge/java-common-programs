package com.ooopsconcept;

abstract class Animal {
	public Animal() {
		System.out.println("Animal Class constructor");
	}

	abstract public void walk();
	 
	int eyes=2;

	public void run() {
		System.out.println("abstract class public run method");
	}
}

class Horse1 extends Animal {
	
	public void walk() {
		System.out.println("horse is walking with "+ eyes +" eyes");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Horse1 horse1 = new Horse1();
		horse1.walk();
		horse1.run();
	}
}
