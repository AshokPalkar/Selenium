package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage extends KiteBaseClass
{
	@FindBy(xpath = "//span[@class='user-id']")
	private WebElement userId;
	
	@FindBy (xpath = "//a[@target='_self']")
	private WebElement logout;

	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getHomePageUserID()
	{
		//driver.switchTo().alert().dismiss();
		String actualUserID = userId.getText();
		return actualUserID;
	}
	
	public void logOut() throws InterruptedException
	{
		userId.click();
		Thread.sleep(2000);
		logout.click();
	}
}
