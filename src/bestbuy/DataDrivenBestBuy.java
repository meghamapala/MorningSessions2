package bestbuy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenBestBuy {
	
	
	WebDriver driver;
	Set<String> handler;
	Iterator<String> it;
	String parentWindowId;
	String childWindowId;
	
	@BeforeMethod
	public void setUp() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
			+ "eclipse-workspace/MorningSessions2/chromedriver 4");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.bestbuy.com");
	driver.findElement(By.xpath("//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[1]/div/div/div/div/button")).click();;
	
	}
	
	
	
	@Test
	public void expressTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()=\"Account\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='am-create-account__button btn btn-outline']"
				+ "[data-lid='account nav_Create Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("David");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Warne");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcd1234@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='fld-p1']")).sendKeys("@Aabcd 1234");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='reenterPassword']")).sendKeys("@Aabcd 1234");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("5166018622");
		Thread.sleep(5000);
	}
	
	@Test
	public void login1() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()=\"Account\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[class='am-create-account__button btn btn-outline']"
				+ "[data-lid='account nav_Create Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Peter");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Perera");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcdd1234@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='fld-p1']")).sendKeys("@AabcD 1234");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='reenterPassword']")).sendKeys("@AabcD 1234");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("7186058622");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
