package POM_DDF_TestNG_Flipkart;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends FlipkartBaseClass
{
	FlipkartLoginPage login;
	FlipkartHomePage homePage;
	

	@BeforeClass
	public void openBrowser() throws IOException
	{
		initializeBrowser();
		
		login = new FlipkartLoginPage(driver);
		homePage = new FlipkartHomePage(driver);
	}
	@BeforeMethod
	public void loginToFlipkart() throws IOException, InterruptedException
	{
		login.clickFlipkartLoginPageCloseButton();
		login.clickFlipkartLoginPageLoginButton();
		login.inputFlipkartLoginPageEmail(FlipkartUtilityClass.getPropFileData("EMAIL"));
		login.inputFlipkartLoginPagePwd(FlipkartUtilityClass.getPropFileData("PASS"));
		login.clickFlipkartLoginPageSubmitButton();
		
		Thread.sleep(2000);
		homePage.mouseOverOnUserID(driver);
		
	}
	
	@Test
	public void verifyDropDownElement() throws EncryptedDocumentException, IOException
	{
		homePage.userDropDown();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
