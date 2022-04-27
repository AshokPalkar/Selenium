package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver2
{
	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	

			 WebElement admin = driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[1]"));
		     WebElement management = driver.findElement(By.xpath("//a[text()='User Management']"));
			 WebElement users = driver.findElement(By.xpath("//a[text()='Users']"));
		
			 Actions action = new Actions(driver);
			 action.moveToElement(admin).moveToElement(management).moveToElement(users).click().build().perform();
			
	}

}
