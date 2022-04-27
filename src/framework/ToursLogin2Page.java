package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ToursLogin2Page {
	
	WebDriver driver;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='address1']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement postalCode;

	@FindBy(xpath = "//select[@name='country']")
	private WebElement country;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement UN;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pwd;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirmPwd;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement sumitButton;

	public ToursLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void inputToursLogin2PageFirstName(String FName) {
		firstName.sendKeys(FName);
	}
	public void inputToursLogin2PageLastName(String LName) {
		lastName.sendKeys(LName);
	}
	public void inputToursLogin2PagePhone(String phonenumber) {
		phone.sendKeys(phonenumber);
	}
	public void inputToursLogin2PageEmail(String emailName) {
		email.sendKeys(emailName);
	}
	public void inputToursLogin2PageAddress(String addressName) {
		address.sendKeys(addressName);
	}
	public void inputToursLogin2PageCity(String cityName) {
		city.sendKeys(cityName);
	}
	public void inputToursLogin2PageState(String stateName) {
		state.sendKeys(stateName);
	}
	public void inputToursLogin2PageCode(String code) {
		postalCode.sendKeys(code);
	}
	
	
	public void inputToursLogin2PageCountry() {
		Select sel = new Select(country);
		sel.selectByValue("INDIA");
		//country.sendKeys(countryName);
	}
	public void inputToursLogin2PageUserName(String userName) {
		UN.sendKeys(userName);
	}
	public void inputToursLogin2PagePassword(String password) {
		pwd.sendKeys(password);
	}
	public void inputToursLogin2Pageconfirmpassword(String confirmPassword) {
		confirmPwd.sendKeys(confirmPassword);
	}
	public void clickToursLogin2PageSubmitButton() {
		sumitButton.click();
	}
	
	
	
	
	
	
	

}
