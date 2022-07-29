package com.stringprograms;

import java.util.HashSet;
import java.util.Set;

public class SearchDuplicateWord {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		String fruits = "mango,apple,guava,berry,mango,strawberry,apple";

		String[] str=fruits.split(",");
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length;j++) {
				if(str[i].equals(str[j])&& i!=j) {
					set.add(str[i]);
				}
			}
		}
		System.out.println(set);

	}
}
