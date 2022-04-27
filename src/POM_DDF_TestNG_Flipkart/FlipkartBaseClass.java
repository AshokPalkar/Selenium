package POM_DDF_TestNG_Flipkart;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartBaseClass
{
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{     
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(FlipkartUtilityClass.getPropFileData("URL"));
		
	}

}
