package com.java8practice.functionjava8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierGetEx {
	public static void main(String[] args) {
		Supplier<Date> d=()->new Date();//no argument
		System.out.println("never take any input always return : "+d.get());
	}
}
