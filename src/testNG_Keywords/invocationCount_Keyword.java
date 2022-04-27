package testNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class invocationCount_Keyword 
{
	
	@Test(invocationCount=5)      // 
	public void openbrowser() {
		
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	

}
}