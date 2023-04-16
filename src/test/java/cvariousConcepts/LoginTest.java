package cvariousConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	
	public static void main(String[] args) {
		
		
		

	
	

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanis\\Selenium-workspace\\crm\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //object variable
		
		
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
}
}

		