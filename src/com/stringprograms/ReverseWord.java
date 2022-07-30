package com.stringprograms;

public class ReverseWord {
	public static void main(String[] args) {
		String name="ANJALI PRADIP WAWGE";
		String[] strArr=name.split(" ");
		StringBuilder sb=new StringBuilder();
		//rever only words
		for(int i=strArr.length-1;i>=0;i--) {
			
			sb.append(strArr[i]+" ");
		}
		System.out.println(sb);
		
		//Reverse on its place
		StringBuilder sb1=new StringBuilder();
		for(String str:strArr) {
			for(int i=str.length()-1;i>=0;i--) {
				char reverse=str.charAt(i);
				sb1.append(reverse);
			}	
			sb1.append(" ");
		}
		System.out.println(sb1);
		
		//reverse from last
		StringBuilder sb2=new StringBuilder();
		for(int i=name.length()-1;i>=0;i--) {
			sb2.append(name.charAt(i));
		}
		sb2.append(" ");
		System.out.println(sb2);
	}
}
