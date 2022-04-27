package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_and_Drop 
{
	WebDriver driver;
	WebElement web;
	@BeforeTest
	public void setBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	public void findElementForDragAndDrop() throws InterruptedException{
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement bankSrc = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement salesSrc = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement fiveThousand1Src = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement fiveThousand2Src = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement bankDestination = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement fiveThousand1Destination = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement salesDestination = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement fiveThousand2Destination = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(bankSrc).clickAndHold().moveToElement(bankDestination).release().build().perform();
		Thread.sleep(2000);
		action.moveToElement(salesSrc).clickAndHold().moveToElement(salesDestination).release().build().perform();
		Thread.sleep(2000);
		action.moveToElement(fiveThousand1Src).clickAndHold().moveToElement(fiveThousand1Destination).release().build().perform();
		Thread.sleep(2000);
		action.moveToElement(fiveThousand2Src).clickAndHold().moveToElement(fiveThousand2Destination).release().build().perform();
		
	}
	
	@Test(priority=2)
	public void verifyPerfectMessage() {
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		if(perfect.isDisplayed()) {
			Reporter.log("Test is pass",true);
		}
		else {
			Reporter.log("Test is fail",true);
		}
		driver.close();
	}

}
