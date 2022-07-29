package com.comparatorpractice;

import java.util.Comparator;

public class AgeComparator implements Comparator<ITStudent>{

	@Override
	public int compare(ITStudent o1, ITStudent o2) {
		if(o1.age>o2.age) {
			return 1;
		}
		if(o1.age<o2.age) {
			return -1;
		}
		if(o1.age==o2.age) {
			return 0;
		}
		return 0;
	}

	

}
