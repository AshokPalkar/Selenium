//package framework;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class KiteHomePage 
//{
//	@FindBy(xpath="//span[@class='user-id']") 
//	private WebElement userId;
//	
//	public KiteHomePage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//
//	public String getHomePageUserID()
//	{
//		String actualUserID = userId.getText();
//		return actualUserID;
//	}
//	
////	public void verifyKiteHomePageUserId(String userIdValue)
////	{
////		userId.getText();
////		
////		if(userId.getText().equals(userIdValue))
////		{
////			System.out.println("Valid User ID");
////		}
////		else
////		{
////			System.out.println("Invalid User ID");
////		}
//	}
//	
//	
//
//
