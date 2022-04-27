package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DesiredCapabilities
{
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\Browsers\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--start-maximized");
//		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized","--disable-notifications");
		
		WebDriver driver = new EdgeDriver(options);
		
		
		
	}

}
