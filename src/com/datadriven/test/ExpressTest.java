package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExpressTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
			+ "eclipse-workspace/MorningSessions2/chromedriver 3");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.express.com");
	
	}
	
	@Test
	public void expressTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void closePopup() throws InterruptedException {
		driver.findElement(By.cssSelector(".srOnly"));
		Thread.sleep(5000);
	}
	
	 @Test
		public void loginPage() throws InterruptedException {
			driver.findElement(By.cssSelector("button[aria-label='Focus Close Modal']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/button")).click();
			driver.findElement(By.cssSelector("input[aria-label='Email'][id='email']")).sendKeys("abcd@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='Password'][id='password']")).sendKeys("abcd1234");
			driver.findElement(By.cssSelector("button[data-testid='submit-element']")).click();
		} 
	 
	 @Test
		public void loginPage2() throws InterruptedException {
			driver.findElement(By.cssSelector("button[aria-label='Focus Close Modal']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/button")).click();
			driver.findElement(By.cssSelector("input[aria-label='Email'][id='email']")).sendKeys("abbcd@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='Password'][id='password']")).sendKeys("abcdd1234");
			driver.findElement(By.cssSelector("button[data-testid='submit-element']")).click();
		} 
	 
	// @DataProvider
	// public Iterator<Object[]> getTestData(){
		// ArrayList<Object[]> testData = TestUtil.getDatafromSpreadSheet();
		//return testData.iterator();
	// }
	 
	 @DataProvider
	 public void getTestData() {
		 TestUtil.getDatafromSpreadSheet();
	 }
	 
	 @Test
		public void loginPage3(String email, String password) throws InterruptedException {
			driver.findElement(By.cssSelector("button[aria-label='Focus Close Modal']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/button")).click();
			driver.findElement(By.cssSelector("input[aria-label='Email'][id='email']")).sendKeys("abbcd@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='Password'][id='password']")).sendKeys("abcdd1234");
			driver.findElement(By.cssSelector("button[data-testid='submit-element']")).click();
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/div[1]/button")).click();
			driver.findElement(By.cssSelector("input[aria-label='Email'][id='email']")).sendKeys("abcd@gmail.com");
			driver.findElement(By.cssSelector("input[aria-label='Password'][id='password']")).sendKeys("abcd1234");
			driver.findElement(By.cssSelector("button[data-testid='submit-element']")).click();
		} 
		
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
