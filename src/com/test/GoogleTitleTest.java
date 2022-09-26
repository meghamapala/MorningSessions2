package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
				+ "eclipse-workspace/MorningSessions2/chromedriver 3");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	//Validation is the most important thing in Automation or Manual Testing
	//So we put validation in form of Assertion
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Title is not matched");
	}
	
	@Test
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("/html/body")).isDisplayed();
		System.out.println(b);
		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
