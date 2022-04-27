package screemShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScreenShotOf_WenElement 
{
	@Test
	public void screenShotOfWenElement() throws IOException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("(//img[contains(@src,'/webres_6232099995a779.24953301/themes')])[1]"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File("Logo.png");
		
		org.openqa.selenium.io.FileHandler.copy(src, destination);
	
	}

}
