package testNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TimeOut_Keyword
{
	
	@Test(timeOut=6000)                                   //thread timeout exception
	public void timeouts() throws InterruptedException {
		
		
		Thread.sleep(5000);
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
