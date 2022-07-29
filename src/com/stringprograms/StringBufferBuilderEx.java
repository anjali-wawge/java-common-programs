package com.stringprograms;

public class StringBufferBuilderEx {
	
	public static void main(String[] args) {
		StringBuffer obj1=new StringBuffer("ANJALI");
		StringBuilder obj2=new StringBuilder("G KHADKE");
				
		System.out.println(obj1.append(obj2));
		System.out.println(obj1.charAt(2));
		
		System.out.println(obj1.capacity());
		System.out.println(obj2.capacity());
		
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj2.replace(0, 2, "G"));
		System.out.println(obj1.indexOf("J"));
    }
}
