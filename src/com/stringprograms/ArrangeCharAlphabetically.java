package com.stringprograms;

import java.util.Set;
import java.util.TreeSet;

public class ArrangeCharAlphabetically {
	public static void main(String[] args) {
		Set<Character> set=new TreeSet<>();
		String name="bhavesh";
		
		char[] ch=name.toCharArray();
		for(char c:ch) {
			set.add(c);
		}
		System.out.println(set);
	}
}
