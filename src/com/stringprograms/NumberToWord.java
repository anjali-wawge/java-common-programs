package com.stringprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
	
    	Map<Integer,String> number=new HashMap<>();
    	number.put(1, "One");
    	number.put(2, "Two");
    	number.put(3, "Three");
    	number.put(4, "Four");
    	number.put(5, "Five");
    	number.put(6, "Six");
    	number.put(7, "Seven");
    	number.put(8, "Eight");
    	number.put(9, "Nine");
    	number.put(0, "zero");
    	
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		System.out.println(number.get(num));
    
    }
}
