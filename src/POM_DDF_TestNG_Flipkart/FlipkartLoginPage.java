package POM_DDF_TestNG_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeButton;
	@FindBy(xpath = "//a[@class='_1_3w1N']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement eMail;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement pwd;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement submitButton;

	public FlipkartLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickFlipkartLoginPageCloseButton() {
		closeButton.click();
	}

	public void clickFlipkartLoginPageLoginButton() {
		loginButton.click();
	}

	public void inputFlipkartLoginPageEmail(String eMailID) {
		eMail.sendKeys(eMailID);
		
	}

	public void inputFlipkartLoginPagePwd(String password) {
		pwd.sendKeys(password);
		
	}

	public void clickFlipkartLoginPageSubmitButton() {
		submitButton.click();
	}

}
