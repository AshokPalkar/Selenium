package POM_DDF_TestNG_BaseClass_UtilityClass;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClass extends KiteBaseClass
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	
	@BeforeClass
	public void openBrowser() 
	{
		initializeBrowser();
		
		login1 = new KiteLogin1Page(driver);
		login2 = new KiteLogin2Page(driver);
	    home = new KiteHomePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException
	{
		login1.inputKiteLogin1PageUsername(KiteUtilityClass.getData(0, 0));
		login1.inputKiteLogin1PagePassword(KiteUtilityClass.getData(0, 1));
		login1.inputKiteLogin1PageLoginButton();
		
		login2.inputKiteLogin2PagePin(KiteUtilityClass.getData(0, 2));
		login2.inputKiteLogin2PageSubmitButton();
		
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		String actUserID = home.getHomePageUserID();
        String ExpUserID = KiteUtilityClass.getData(0, 3);
        Assert.assertEquals(actUserID, ExpUserID);
		
	}
	
	@AfterMethod
	public void logOutFromApplication() throws InterruptedException
	{
		home.logOut();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
