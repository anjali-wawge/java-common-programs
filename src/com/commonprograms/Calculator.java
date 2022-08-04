package com.commonprograms;

import java.util.Scanner;

public class Calculator {

	Calculator() {
		
	} 
	static public void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter two numbers: ");
		int firstNumber = sc.nextInt();
		int secondNumber =sc.nextInt();
		
		System.out.println("Enter operator (+,-,*,/): ");
		char operator=sc.next().charAt(0);
		int result;
		switch(operator) 
		{
		case '+':
			result=firstNumber+secondNumber;
		break;
		case '-':
			result=firstNumber-secondNumber;
		break;	
		case '*':
			result=firstNumber*secondNumber;
		break;	
		case '/':
			result=firstNumber/secondNumber;
		break;
		default:
			System.out.printf("Error! operator is not correct");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
		}
	}

