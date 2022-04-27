package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class exa1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Alert window with input box
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		
		Alert alertWindow = driver.switchTo().alert();
		System.out.println(alertWindow.getText());
		alertWindow.sendKeys("Hey!! Your father Is Here");
		alertWindow.accept();
		
		
	}

}
