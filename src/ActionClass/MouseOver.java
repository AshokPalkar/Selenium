package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	WebDriver driver;
	WebElement web;

	@Test(priority = 1)
	public void setBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 2)
	public void loginPage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Test(priority =3)
	public void homePage() throws InterruptedException {
		
		
		WebElement admmin = driver.findElement(By.xpath("(//a[@class='firstLevelMenu'])[1]"));
		WebElement management = driver.findElement(By.xpath("//a[text()='User Management']"));
		WebElement users = driver.findElement(By.xpath("//a[text()='Users']"));
		WebElement job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));

		Actions action = new Actions(driver);
		action.moveToElement(admmin).moveToElement(management).moveToElement(users).click().build().perform();
		
		Thread.sleep(2000);
		try {
			action.moveToElement(job).build().perform();
		}
		catch(StaleElementReferenceException e) {
			WebElement job1 = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
			WebElement empStatus = driver.findElement(By.xpath("//a[text()='Employment Status']"));
			action.moveToElement(job1).moveToElement(empStatus).click().build().perform();
			

		}
		
	}

}
