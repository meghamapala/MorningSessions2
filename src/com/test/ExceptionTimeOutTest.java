package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	//This is to stop infinite loop "invocationTimeOut"
	//ThreadTimeoutException
	
	@Test(invocationTimeOut=100)
	public void infintLoopTest() {
		int i= 1;
	//	while(i==1) {
	//		System.out.print(i);
	//	}
	}

}
