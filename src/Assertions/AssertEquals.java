package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
	WebDriver driver;
	//String actualTitle;

	@Test
	public void setBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Facebook – log in or sign up";

		Assert.assertEquals(expectedTitle, actualTitle);

	}

	

}
