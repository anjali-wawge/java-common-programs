package com.bufferbuilder;

public class StringBufferEx {
public static void main(String[] args) {
	StringBuffer stringBuffer=new StringBuffer("Hello");
	stringBuffer.append('K');
	System.out.println(stringBuffer);
	
	StringBuffer sb1=stringBuffer.append(new char[]{'a','b'});
	System.out.println(sb1);
	
	StringBuffer sb2=stringBuffer.append(0.9f);
	System.out.println(sb2);

	char sb3=stringBuffer.charAt(0);
	System.out.println(sb3);
	
	StringBuffer sb4=new StringBuffer("JAVA LOGIC");
	sb4.delete(3, 7);
	System.out.println(sb4);
	
	System.out.println(sb4.indexOf("G"));
	
	System.out.println(sb4.substring(2));
	
	System.out.println(sb4.reverse());

	System.out.println(sb4.indexOf("G",0));
	
	System.out.println(sb4.capacity());
	
	System.out.println(sb4.substring(1, 4));
  }
}
