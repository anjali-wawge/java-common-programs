package com.ooopsconcept;
class Statics{
	static int a=10; 
	int b=500;
	static void staticMethod() {
		System.out.println("Static method");
	}
}
public class StaticNonstatic extends Statics{
	public static void main(String[] args) {
		//to call static data
		StaticNonstatic.staticMethod();
		System.out.println(a);
		System.out.println(StaticNonstatic.a);//no obj required

		StaticNonstatic.a=20;
		System.out.println(a);//20
		
		Statics s=new Statics();
		s.a=50;
		Statics s1=new Statics();
		System.out.println(s.a);//50
		System.out.println(s1.a);//50//memory location gets update so we get value 50 not 10/20
		s1.a=60;
		System.out.println(s1.a);
		System.out.println(s.a);//60****************imp
		//to call non static data create object
		StaticNonstatic st=new StaticNonstatic();
		System.out.println(st.b);//500
		StaticNonstatic st2=new StaticNonstatic();
		st2.b=600;
		System.out.println(st2.b);//memory location doesn't get updated so we get value 500 and 600
		System.out.println(st.b);//remains 500************imp
	}
}
