package com.stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FruitsCount {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<>();
	
	String fruits="mango,apple,guava,berry,mango,strawberry,apple";

	String[] f=fruits.split(",");
	System.out.println(Arrays.asList(f));
	
	for(String s:f) {
		if(map.containsKey(s)) {
			int count=map.get(s);
			count+=1;
			map.put(s, count);
		}
		else {
			map.put(s, 1);
		}
	}
	
   System.out.println(map);
    
  }
}
