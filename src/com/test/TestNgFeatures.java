package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	//Some test cases depend on other test cases
	//like HomePage depend on Login Page
	//If LoginPage fail no need to Test HomePage as it is
	//waste of time there for we use key word "depend on"
	//
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		
	}
	
	@Test(dependsOnMethods="loginTest")
	//this method will ignored(skipped)
	public void HomePageTest() {
		System.out.println("homepage test");
	}
	
	

}
