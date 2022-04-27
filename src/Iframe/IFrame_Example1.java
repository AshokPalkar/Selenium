package Iframe;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class IFrame_Example1 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			driver.manage().window().maximize();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			
			//switch to frame using
			//1.Name or ID
			//2.Index
			//3.WebElement
			
			// first we have to switch to frame then find element on which we have to perform action
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.xpath("//a[text()='org.openqa.selenium'][1]")).click();
			
			//To return from frame use switchTo().defaultContent() method
			driver.switchTo().defaultContent();  //returns to main page
			Thread.sleep(5000);
			
			
			//WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
			driver.switchTo().frame("classFrame");
			driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();
			driver.switchTo().parentFrame();
			Thread.sleep(5000);
			
//			driver.navigate().back();
			
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.xpath("//div[@class='indexContainer']//span[text()='WebDriver']")).click();
		
			
		}

	}


