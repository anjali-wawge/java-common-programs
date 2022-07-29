package com.stringprograms;

import java.util.Set;
import java.util.TreeSet;

public class SearchDuplicateCharacter {
	public static void main(String[] args) {
		Set<Character> set=new TreeSet<>();
		String name="MRINAMAYI";
		
		for(int i=0;i<name.length();i++) {
			for (int j = 0; j < name.length(); j++) {
				if(name.charAt(i)==name.charAt(j) && i!=j) {
					set.add(name.charAt(i));
				}
			}
		}
		System.out.println(set);
	}
}
