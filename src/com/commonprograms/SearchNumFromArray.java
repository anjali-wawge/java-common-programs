package com.commonprograms;

public class SearchNumFromArray {
	boolean searchNumberInArray(int k) {
		int[] n= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<=n.length-1;i++) {
			if(k==n[i]) {
				return true; 
			}
		}
		return false;		
}
	boolean searchNumberInArray2(int k) {
		int[] n= {1,2,4,6,7,8,9};
		int first=0;
		int last=n.length-1;
		int mid=(first+last)/2;
		while(first<=last) {
		if(n[mid]==k) {
			return true;
		}
		else if(n[mid]<k){
			first=mid+1;
		}
		else if(n[mid]>k) {
			last=mid-1;
		}
		mid=(first+last)/2;
		}
		
		return false;		
}
	public static void main(String[] args) {
		
		SearchNumFromArray s=new SearchNumFromArray();
		int n=12;
		System.out.println(s.searchNumberInArray(n));
		
		System.out.println(s.searchNumberInArray2(n));
	}
}
