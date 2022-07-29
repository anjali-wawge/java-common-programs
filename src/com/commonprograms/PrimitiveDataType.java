package com.commonprograms;

public class PrimitiveDataType {
	static int a=0; 
	int b=10;
	final int c=1;
	public void counter() {
		a++;
		b++;
		//c++;Can not assigned final varible
		//c=c+1;
		System.out.println("Static with diff objects:"+a);
		System.out.println("non static with diff objects:"+b);//allocates memory every time so ans is 11 11 11
	}
	public void singleobject() {
		a++;
		b++;
		System.out.println("Single Obj static var:"+a);
		System.out.println("Single Obj non static:"+b);
	}
	public static void main(String[] args) {
		//3 different objects are created so non static var value will be same
		PrimitiveDataType p=new PrimitiveDataType();
		p.counter();
		PrimitiveDataType p1=new PrimitiveDataType();
		p1.counter();
		PrimitiveDataType p2=new PrimitiveDataType();
		p2.counter();
		//Below one object is created so value will changed
		PrimitiveDataType a=new PrimitiveDataType();
		a.singleobject();
		a.singleobject();
		a.singleobject();
		
	}
}
