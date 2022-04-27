package testNG_Keywords;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Enabled_keyword 
{
	@Test(enabled=false)
	public void openEdgebrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		

}
	
	
	
}