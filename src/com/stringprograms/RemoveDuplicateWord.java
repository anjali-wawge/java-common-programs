package com.stringprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
	
    	Set<String> set=new HashSet<>();
    	String fruits="mango,apple,guava,berry,mango,strawberry,apple";
    	
    	String[] onefruit=fruits.split(",");
    	
    	for(String str:onefruit) {
    		if(set.contains(str)) {
    			set.remove(str);
    		}
    		else {
    			set.add(str);
    		}
    	}
    	System.out.println(set);
    	
}
}
