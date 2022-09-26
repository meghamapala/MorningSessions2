package com.test;

import org.testng.annotations.Test;

public class ExpectedException {
	
	//If we know exception is coming this keyword is used "expectedExceptions" 
	//We do not use this in Selenium  We allow exception to happen and mark as Fail
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()  {
		String x = "100A";
		Integer.parseInt(x);
	}
	
	//Interview Question  :
	//How to handle Exceptions without try catch block ?
	//Using TestNG expectedExceptions

}
