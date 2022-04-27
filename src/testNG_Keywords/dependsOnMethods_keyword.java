package testNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods_keyword
{
	
	@Test
	public void openEdgebrowser() {
		Assert.fail();
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	
    @Test(dependsOnMethods= {"openEdgebrowser"})
	public void openChromebrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
    


}
