package com.ooopsconcept.package2;

import com.ooopsconcept.package1.Animal;

public class Animal1 extends Animal {
	public void walk() {
		System.out.println("Ears"+ear);//protected
		//System.out.println("Nose"+nose);//error coz private
		//System.out.println(hornivorus);coz default
		
	} 

	/*
	 * public final void os() { System.out.println("Child final"); }
	 */
	public static void m1() {
		System.out.println("child static method");
	}
	public static void main(String[] args) {
		Animal1 a1=new Animal1();
		a1.walk();
		a1.testProtect();
		a1.m1();
		
		Animal a=new Animal();
		a.walk();
		
		a.m1();
		m1();
		a.os();
	}
}
