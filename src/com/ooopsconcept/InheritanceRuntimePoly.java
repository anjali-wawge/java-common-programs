package com.ooopsconcept;

class Shape {
	String color;
    Shape(){
    	System.out.println("Default Const");
    }
    Shape(int a){
    	System.out.println("parameterized Const"+a);
    }
	public void area() {
		System.out.println("Displays area");
	}
}
//single level inheritance
class Triangle extends Shape {
	public Triangle(int a) {
		super(a);
		System.out.println("Tri cons"+a);
	}
	public void area(int l, int h) {
		super.area();
		System.out.println((0.5) * l * h);
	}
}
//multilevel inheritance
class EquilateralTriangle extends Triangle {
	public EquilateralTriangle(int a) {
		super(a);
System.out.println("Equ"+a);	}

	public void area(int l, int h) {
		System.out.println((0.5) * l * h);
	}
}
//hierarchical 
class Circle extends Shape{
	public void area(int r) {
		System.out.println(3.14*r*r);
	}
}
public class InheritanceRuntimePoly {
	public static void main(String[] args) {
		Triangle t=new Triangle(4);
		t.area(5,6);
		 
		EquilateralTriangle ts = new EquilateralTriangle(5);
		ts.area(2,4);
		
		Circle c=new Circle();
		c.area(5);
	}
}
