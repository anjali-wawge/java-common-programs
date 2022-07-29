package com.commonprograms;

public class Palindrome {
	static void checkPalindromeOrNot(String input) {
		boolean res=true;
		int length=input.length();
		for(int i=0;i<=length/2;i++) {
			if(input.charAt(i)!=input.charAt(length-i-1)){
				res=false;
				break;
			}
		}
		System.out.println(res);	
	}
	public static void main(String[] args) {
		checkPalindromeOrNot("PNANP");	
	}

}
