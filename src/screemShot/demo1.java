package screemShot;



import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.co.in/");
		
		
	}

}
