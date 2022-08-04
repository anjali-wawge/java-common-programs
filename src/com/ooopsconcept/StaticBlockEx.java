package com.ooopsconcept;

public class StaticBlockEx {
	static {
		System.out.println("Static block");
	}
	static int a=5;//get memory once so memory efficient(less memory)
	final int i=9;
	int k=0;//get memory each time when instance is creadted
	public void print() {
		int a=6;
		k++;
		System.out.println("instanec variable : "+k);
		System.out.println("static:"+a++);
		System.out.println(++a+" Static variable");
		//System.out.println(i++);only i=once final var can initialize
	}
	
	public static void main(String[] args) {
		StaticBlockEx s=new StaticBlockEx();
		s.print();  
		System.out.println(a);
				
		StaticBlockEx s1=new StaticBlockEx();
		s1.print();
		
		
	}
	
}
