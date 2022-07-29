package com.ooopsconcept;

class Student{
	//properties
	String name;
	String standard;
	
	//methods
	public void attend() {
		System.out.println("Student is Present");
	}
	
	public void printName() {
		System.out.println(this.name);
	}
}
class Teacher{
	String sub;
	int age;
	
	public void printInfo() {
		System.out.println(this.sub);
		System.out.println(this.age);
	}
}
public class MethodVariables {
public static void main(String[] args) {
	Student stud1=new Student();
	stud1.name="Drshita";
	stud1.standard="1st,'A'";
	
	stud1.attend();
	
	Student stud2=new Student();
	stud2.name="Anjali";
	stud2.standard="11th,'A'"; 
	
	stud2.printName();
	stud1.printName();
	
	Teacher teach=new Teacher();
	teach.sub="English";
	teach.age=30;
	
	teach.printInfo();
}
}
