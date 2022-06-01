package com.ExceptionHandling;

import java.io.IOException;

public class ThrowsKeywordExample {
	
	public void verifyDevice(boolean blnReady) throws IOException{
		
		if(blnReady==false) {
			
			throw new IOException("Device is not Ready");
			
		}else {
			
			System.out.println("Device is ready to use");
		}
		
	}
	
	public void handleException() throws IOException {
		
		try {
			
			verifyDevice(false);
			
		} catch (Exception exception) {
			
			exception.printStackTrace();
			System.out.println("Exception is Handled");
			System.out.println("Use another Device");
		}
		
		
	
		
	}

}
