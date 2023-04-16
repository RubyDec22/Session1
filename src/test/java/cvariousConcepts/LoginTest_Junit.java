package cvariousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		positiveLoginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest1();
		tearDown();
		
		launchBrowser();
		negLoginTest2();
		tearDown();
		
		

	}
	
	public static void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiha\\Selenium_Dec2022\\crm\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanis\\Selenium-workspace\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver(); //object variable
		
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
	
	public static void positiveLoginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	public static void negLoginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	public static void negLoginTest1() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	public static void negLoginTest2() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

}


=================================================== LoginTest_Junit ==================================

public class LoginTest_Junit {
	
	WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Before
	public void launchBrowser() {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver(); //object variable
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("After");
		driver.close();
		driver.quit();
	}
	
	@Test
	public void positiveLoginTest() throws InterruptedException {
		System.out.println("Positive login");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void negLoginTest() throws InterruptedException {
		System.out.println("Neg login");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password1")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	
	

}