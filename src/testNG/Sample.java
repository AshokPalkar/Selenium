package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void initialiseBrowser(String browserName)
	{
		switch(browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		}
		
	}
	@Parameters({"UN","pwd"})
	@Test(priority=1)
	public void login(String UN,String pwd )
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	@Test(priority=2)
	public void demo()
	{
		System.out.println("demo");
	}
	
	@Test(priority=3)
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@AfterTest(enabled=false)
	public void tearDown()
	{
		driver.quit();
	}


}
