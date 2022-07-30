package com.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class VowelsCounting {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		
		String string = "JavaSpringBoot";
		String vowel="aeiou";
		
		for(int i=0;i<string.length();i++) {
			if(vowel.contains(string.charAt(i)+"")) {
				if(map.containsKey(string.charAt(i))) {
				int count=map.get(string.charAt(i));
				count=count+1;
				map.put(string.charAt(i), count);
				}
				else {
					map.put(string.charAt(i), 1);
				}
			}
		}
		System.out.println(map);
	
	}
}
