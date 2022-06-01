package com.ExceptionHandling;

public class ThrowKeywordExample {
	
	public void useOfThrowKeyword(int intAge) {
		
		System.out.println("Your Current Age is : "+intAge);
		
		if(intAge<18) {
			throw new ArithmeticException("You are not eligible to fill Application Form");
			
		}else {
			System.out.println("You are eligible to Apply !");
		}
		
		System.out.println("Welcome to Online Application Portal");
	}
	

}
