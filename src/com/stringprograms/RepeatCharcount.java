package com.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatCharcount {
public static void main(String[] args) {
	String name="ANJAkkkLINNN";
	Map<Character, Integer> map=new HashMap<>();
	for(int i=0;i<=name.length()-1;i++) {
		if(map.containsKey(name.charAt(i))) {
			int count=map.get(name.charAt(i));
			count+=1;
			map.put(name.charAt(i), count);
		}
		else {
			map.put(name.charAt(i), 1);
		}
	}
	System.out.println(map);
 }
}
