package com.ooopsconcept.package2;

import com.ooopsconcept.package1.Animal;

public class Animal1 extends Animal {
	public void walk() {
		System.out.println("Ears"+ear);//protected
		//System.out.println("Nose"+nose);//error coz private
		//System.out.println(hornivorus);coz default
		
	}
	public static void main(String[] args) {
		Animal1 a1=new Animal1();
		a1.walk();
		a1.testProtect();
		
		Animal a=new Animal();
		a.walk();
	}
}
