package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssert {
	WebDriver driver;

	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void verifyCheckBoxSelected() {
	
		driver.get("https://demos.telerik.com/kendo-ui/checkbox/index");
		WebElement Option = driver.findElement(By.xpath("(//ul[@class='fieldlist']//input)[1]"));
		boolean selected = Option.isSelected();
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		
		WebElement Option1 = driver.findElement(By.xpath("(//ul[@class='fieldlist']//input)[3]"));
		boolean notSelected = Option1.isSelected();
		soft.assertTrue(notSelected);
		soft.assertFalse(selected);
		soft.assertAll();

	}

}
