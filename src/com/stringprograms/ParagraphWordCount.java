package com.stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParagraphWordCount {

	public static void main(String[] args) {
		String para="Anjali Khadke Pradip Wawge Darshita Anjali Pradip Wawge";
		Map<String,Integer> map=new HashMap<>();
		
		String[] str=para.split(" ");
		System.out.println(Arrays.asList(str));//to print the array us Arrays.asList(String)
		for(String words:str) {
			//System.out.println(words);
			if(map.containsKey(words)) {
				//int count=map.get(words)+1;
				//count+=1;
				map.put(words, map.get(words)+1);
			}
			else {
				map.put(words, 1);
			}
		}
		System.out.println(map);
	}
}
