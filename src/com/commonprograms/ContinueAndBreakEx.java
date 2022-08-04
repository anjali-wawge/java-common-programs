package com.commonprograms;

public class ContinueAndBreakEx {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			if(i==3) {
				System.out.println(i);
				continue;//continue from 4 and skip 3
				//System.out.println(i);
			}
			System.out.println(i);
		}
		
	}
}
