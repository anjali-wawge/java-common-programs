package com.wrapperclasses;

public class WrapperClassEx {

	public static void main(String[] args) {
		//primitive types
		byte b=40;
		short s=20;
		char c='A';
		boolean bo=true;
		int i=10;
		long l=300;
		float f=20.8f;
		double d=20;
		
		//wrappper classes
		Byte bW=10;
		Short sW=50;
		Character cW='K';
		Integer iW=20;
		Long lW=40l;
		Float fW=70.8f;
		Double dW=90d;
		
		//Autoboxing:primitive to Wrapper class
		Byte byteA=b;
		Short shortA=s;
		Character charA=c;
		Integer intA=i;
		Long longA=l;
		Float floatA=f;
		Double doubleA=d;
		Boolean booleanA=bo;
		System.out.println(byteA+"***"+shortA+"***"+charA+"***");
		
		//Unboxing:Wrapper class to primitive
		byte byteU=bW;
		short shortU=sW;
		char charU=cW;
		int iU=iW;
		System.out.println(byteU+"***"+shortU+"***"+charU);
		
	}
}
