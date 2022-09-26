package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//1.@BeforeSuite,2.@BeforeTest,3.@BeforeClass,4.@BeforeMethod,5.@Test
	//6.@AfterMethod,7.@AfterClass,8.@AfterTest,
	
	//@BeforeMethod---PreConditions
	//@Test-1
	//@AfterMethod---AfterConditions
	
	//@BeforeMethod
	//@Test-2
	//@AfterMethod
	
	//Mostly Use
	//@BeforeClass,@BeforeMethod,@Test,@AfterMethod,@AfterClass
	
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
	//we can define our test cases in sequencing manner using priority
	@Test(priority=0,groups="Title")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("/html/body")).isDisplayed();
		System.out.println(b);
		
	}
	
	@Test(priority=2,groups="Test")
	public void mailLinkTest() {
		boolean c=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		System.out.println(c);
		
	}
	//How you define grouping in TESTNG?
	//Using "groups" keyword
	
	@Test(priority=1,groups="Test")
	public void test4() {
		System.out.println("test 4");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}//TestNG Gives HTML Report right click project and refresh it
	 //we get test-output open test-output get path of test-output using 
	 //property and paste on any browser, then we get the report
	
}
