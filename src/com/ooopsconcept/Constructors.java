package com.ooopsconcept;
class StudentForConstructor {
	String name;
	String standard;
	
	//methods
	public void attend() {
		System.out.println("Student is Present");
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.standard);
	}
	
	//if we are creating copy constructor then must hv default const
	public StudentForConstructor() {
		// TODO Auto-generated constructor stub
	}
	 StudentForConstructor(String name,String standard) {
		this.name=name;
		this.standard=standard;
	}
	 
	 //copy constructor
	  StudentForConstructor(StudentForConstructor s) {
		 this.name=s.name;
		 this.standard=s.standard;
	 }
}


public class Constructors {
public static void main(String[] args) {
	StudentForConstructor s=new StudentForConstructor("Anjali", "2nd");
	s.printInfo();
	
	StudentForConstructor s1=new StudentForConstructor();
	s1.name="KAjol";
	s1.standard="5th";
	
	StudentForConstructor s2=new StudentForConstructor(s1);
	s2.printInfo();
	
}
}
