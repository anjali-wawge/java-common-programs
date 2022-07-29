package com.ooopsconcept;

class TeacherOverloading {
	String name;
	int age;

	public void printInfo(int age) {
		System.out.println(age);
	}

	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}

	public void printInfo(String name) {
		System.out.println(name);
	}
}

public class OverloadigOrCompileTPoly {
public static void main(String[] args) {
	TeacherOverloading t1=new TeacherOverloading();
	t1.printInfo(35);
	t1.printInfo("Anamika");
	t1.printInfo("Kajol", 40);
}
}
