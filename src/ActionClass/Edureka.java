package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Edureka
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.edureka.co/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='open_search_overlay']"));
		searchBox.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='new-search-inp']")).sendKeys("devops");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@id='search-results']//a)[1]")).click();
		

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-button-name='Country filter']")).click();
		
		driver.findElement(By.xpath("(//div[@id='mCSB_1_container']//li)[3]")).click();
		
		WebElement enrollNow = driver.findElement(By.xpath("(//button[@data-button-name='Enroll Now'])[2]"));
		
		//js.executeScript("arguments[0].scrollIntoView();", enrollNow);
		js.executeScript("arguments[0].click();", enrollNow);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='inputfld']//input)[9]")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Mobile Number*'])[13]")).sendKeys("9527762417");
		driver.findElement(By.xpath("(//button[text()='Start Learning'])[2]")).click();
		
		
		

	}

}
