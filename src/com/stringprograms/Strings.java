package com.stringprograms;

public class Strings {
public static void main(String[] args) {
	String s1="Namita";
	String s2="Mahesh";
	String s3="Namita";
	String s4=new String("Asmita");
	String s5=new String("Asmita");
	
	System.out.println(s1==s3);//true
	System.out.println(s1.equals(s3));//true compares contents/values
	
	System.out.println(s4==s5);//false check memory location,(points to same or not),address of two objs are same or not
	System.out.println(s4.equals(s5));//true compares contents/values
	
	System.out.println(s1.concat(s4));
	System.out.println(s2.endsWith("h"));//true case sensitive
	
	System.out.println(s5.indexOf("m"));
	
	System.out.println(s4.replace("A", "a"));
	
	System.out.println(s5.substring(1));
	
	System.out.println(s5.substring(1,5));
	
	
	
}
}
