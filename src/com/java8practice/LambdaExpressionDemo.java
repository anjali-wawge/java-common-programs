package com.java8practice;
public class LambdaExpressionDemo {
	public static void main(String[] args) {
		Anonymous l=(a,b)->(a+b);
			System.out.println(l.show(4,5));//without calling this method above will not print
			l.num(1);

	}
	
}
