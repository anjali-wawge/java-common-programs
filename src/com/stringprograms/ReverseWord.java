package com.stringprograms;

public class ReverseWord {
	public static void main(String[] args) {
		String name="ANJALI PRADIP WAWGE";
		String[] strArr=name.split(" ");
		
		//rever only words
		for(int i=strArr.length-1;i>=0;i--) {
			System.out.println(strArr[i]);
		}
		
		//Reverse on its place
		for(String str:strArr) {
			for(int i=str.length()-1;i>=0;i--) {
				char reverse=str.charAt(i);
				
			System.out.println(reverse);
			}
		}
		//reverse from last
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}
}
