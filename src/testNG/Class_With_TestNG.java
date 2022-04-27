package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class_With_TestNG
{

	@Test
	public void openBrowser() throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	}
}
