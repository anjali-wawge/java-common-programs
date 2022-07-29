package com.comparatorpractice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ComparatorUsingStream {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(3);
		l.add(32);
		l.add(1);
		
		l.stream().sorted().forEach(i-> {
			System.out.println("The s of"+ i+" no :"+(i*i));
		});
		
		List<Integer> sortList = l.stream().sorted((s1,s2)->(s1>s2?1:s1<s2?-1:0)).collect(Collectors.toList());
		System.out.println("Simply natural sorting of integer : " +sortList);
		
		Integer minValueAsc=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Get min value from asc order : "+minValueAsc);
		
		Integer maxValueDesc=l.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println("Get max value from desc order : "+maxValueDesc);

		List<String> name=new ArrayList<>();
		name.add("Fat");
		name.add("Carry");
		name.add("Anjali");
		
		List<String> nameSortedList= name.stream().sorted().collect(Collectors.toList());
		System.out.println("Simply natural sorting of string : "+nameSortedList);
		
		List<String> nameLength=new ArrayList<>();
		nameLength.add("Carry");
		nameLength.add("Fat");
		nameLength.add("Anjali");

		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> lengthSorting=name.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorting name according to lenght : "+lengthSorting);
		
	}
}
