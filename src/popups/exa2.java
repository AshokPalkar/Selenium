package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class exa2
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		//get ID of both windows
		Set<String> windowIds = driver.getWindowHandles();
		
		//convert set into arraylist
		ArrayList<String> arrayList = new ArrayList<String>(windowIds);
		String parentWindowID = arrayList.get(0);
		String childWindowID = arrayList.get(1);
		System.out.println("Parent window ID:"+" "+parentWindowID);
		System.out.println("Child window ID:"+" "+childWindowID);
			
		
		//switch to child window
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		//switch to parent window from child window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@name='home']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	}


