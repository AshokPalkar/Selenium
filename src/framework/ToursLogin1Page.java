package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToursLogin1Page
{
	@FindBy(xpath="(//a[@href='register.php'])[2]") private WebElement register;
	
	public ToursLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickToursLogin1PageRegisterLink()
	{
		register.click();
	}

}
