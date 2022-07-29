package com.commonprograms;

public class Factorial {
	static int factorialOfNum(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		output=factorialOfNum(n-1)*n;
		return output;
	}
	public static void main(String[] args) {
		int fact=factorialOfNum(3);
		System.out.println("Factorial of given no : "+fact);
		
	}

}
