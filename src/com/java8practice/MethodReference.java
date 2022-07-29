package com.java8practice;

 class MethodReference {
 public static void saySomething() {
	 System.out.println("SaySomething");
 }
 public static void main(String[] args) {
	MethodRefEx a=MethodReference::saySomething;
	a.show();
}
}

