package com.ExceptionHandling;

public class TestExceptionHandlingConcept {

	public static void main(String[] args) {
		
		ExeptionHandlingConcept objExeptionHandlingConcept = new ExeptionHandlingConcept();
		
		objExeptionHandlingConcept.toHandleNullPointerException("Swapnil");
		System.out.println("\n");
		
		objExeptionHandlingConcept.toHandleArrayOutOfBoundException(4);
		System.out.println("\n");
		
		objExeptionHandlingConcept.toUseFinallyBlock(0);
		System.out.println("\n");
		

		
		

	}

}
