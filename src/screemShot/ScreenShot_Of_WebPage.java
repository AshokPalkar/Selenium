package screemShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScreenShot_Of_WebPage 
{
	@Test
	public void screenShotOfCompletePage() throws IOException
	{

		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File("WebPage.png");
		
		FileUtils.copyFile(src, destination);
	}

}
