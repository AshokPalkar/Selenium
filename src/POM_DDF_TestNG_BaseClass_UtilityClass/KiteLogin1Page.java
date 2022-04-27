package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy(xpath="//input[@id='userid']") 
	private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") 
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement loginbutton;
	
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inputKiteLogin1PageUsername(String UNValue)
	{
		UN.sendKeys(UNValue);
	}
	
	public void inputKiteLogin1PagePassword(String pwdValue)
	{
		pwd.sendKeys(pwdValue);
	}
	
	public void inputKiteLogin1PageLoginButton()
	{
		loginbutton.click();
	}

}
