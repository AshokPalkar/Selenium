package POM_DDF_TestNG_ScreenShotOFailedTC_PropertiesFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']") 
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement submitButton;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputKiteLogin2PagePin(String pinValue)
	{
		pin.sendKeys(pinValue);
	}
	
	public void inputKiteLogin2PageSubmitButton()
	{
		submitButton.click();
	}

}
