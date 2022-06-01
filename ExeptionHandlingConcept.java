package com.ExceptionHandling;

public class ExeptionHandlingConcept {
	
	public void toHandleNullPointerException(String strName) { //If name is null, it will throw nullpointer exception
		
		System.out.println("This method is to handle Null Pointer Exceptions");
		
		try {
			
			int intLength = strName.length();
			
			System.out.println("Length of the entered string : "+intLength);
						
			
		} catch (NullPointerException nullpointer) {
			System.out.println("Exception Occured : "+nullpointer.getMessage());
			nullpointer.printStackTrace();
		}
		
		if(strName==null) {
			System.out.println("Null pointer exception is handled Successfully !");
		}else{
			System.out.println("Exception not occured");
		}
		
				
	}
	
	
	public void toHandleArrayOutOfBoundException(int intGetIndex) {
		
		String strMonthArray[] = {null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		try {			
			
			for(int intIndex=0; intIndex<=strMonthArray.length; intIndex++) {
				System.out.println("Month at index "+intIndex+" : "+strMonthArray[intIndex]);
			}
			
		} catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBounds) {
			
			System.out.println("Exception Message : "+ArrayIndexOutOfBounds.getMessage());
			ArrayIndexOutOfBounds.printStackTrace();
		}
		
		String strIndexValue = strMonthArray[intGetIndex];
		System.out.println("Value of the given index : "+strIndexValue);
				
	}
	
	
	public void toUseFinallyBlock(int intDivisible) {
		
		int intMainValue = 500;
		int intResult;
		
		try {
			
			intResult = intMainValue/intDivisible; 
			System.out.println("Division is : "+intResult);
			
		} catch (NullPointerException Nullpointer) { //Trying to handle exception with different type
			System.out.println("Exception found : "+Nullpointer.getMessage());
		}
		
		finally {
			
			System.out.println("This is Finally Block !");
			
			if(intDivisible==0) {
				intDivisible = intDivisible + 2;
				System.out.println("Division by changing divisible : "+intMainValue/intDivisible);
			}
		}
		
		System.out.println("This is the remaining flow");
		
		
	}
	
	
}
