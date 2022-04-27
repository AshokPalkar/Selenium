package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertNotEquals
{
	public  WebDriver driver;
	//String actualTitle;

	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	   @Test
		public  void openFacebook() {
			
		   
		  driver.get("https://www.facebook.com/");

			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "Facebook";

			
			
			
			
			Assert.assertNotEquals(expectedTitle, actualTitle);
		
		

	}

}
