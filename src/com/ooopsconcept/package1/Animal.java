package com.ooopsconcept.package1;

public class Animal {
	static int eyes = 2;
	protected int ear=2;
	private int nose=1;
    boolean hornivorus=true;
	public void walk() {
		System.out.println(hornivorus);
		System.out.println("Animal has diif no of legs");
	}
	protected void testProtect() {
		System.out.println("Protected method");
	}
	public static void m1() {
		System.out.println("Static method");
	}
	
	public final void os()
	{
		System.out.println("Final");
	}
}
