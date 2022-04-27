package demo;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(2000);
		WebElement electro = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
	
		Actions action = new Actions(driver);
		action.moveToElement(electro).build().perform();
//		List<WebElement> alloption = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']//a"));
//		
//		
//	
//		Thread.sleep(2000);
//		for(WebElement option : alloption)
//		{
//			
//			String optionName = option.getText();
//			if(optionName.equalsIgnoreCase("Men's Bottom Wear"))
//			{
//				option.click();
//				break;
//			}
//		}
//		
//		Thread.sleep(2000);
//		WebElement shorts = driver.findElement(By.xpath("//a[@title='Shorts']"));
//		
//		
//		shorts.click();

//		WebElement shorts = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[5]"));

//	Thread.sleep(2000);
//		
//	try {
//		action.moveToElement(fashion).moveToElement(menShorts).build().perform();
//
//		} catch (StaleElementReferenceException e) {
//
//		List<WebElement> alloption1 = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']//a"));
//		   WebElement menShorts1 = alloption1.get(1);
//		   action.moveToElement(menShorts).build().perform();

		}
	}


