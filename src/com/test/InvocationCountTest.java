package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//if we want to run same test case multiple times
	//example: dump the data into the system
	
	@Test(invocationCount=10)
	public void sum() {
		int a =10;
		int b =20;
		int c =a+b;
		System.out.println("sum is =="+c);
	}

}
