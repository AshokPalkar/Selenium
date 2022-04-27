package POM_DDF_TestNG_ScreenShotOFailedTC_PropertiesFile;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.ITestResult;
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
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		initializeBrowser();
		
		login1 = new KiteLogin1Page(driver);
		login2 = new KiteLogin2Page(driver);
	    home = new KiteHomePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException
	{
		login1.inputKiteLogin1PageUsername(KiteUtilityClass.getPropertyFileData("UN"));
		login1.inputKiteLogin1PagePassword(KiteUtilityClass.getPropertyFileData("PWD"));
		login1.inputKiteLogin1PageLoginButton();
		
		login2.inputKiteLogin2PagePin(KiteUtilityClass.getPropertyFileData("PIN"));
		login2.inputKiteLogin2PageSubmitButton();
		
	}
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		TCID=101;
		String actUserID = home.getHomePageUserID();
        String ExpUserID = KiteUtilityClass.getData(0, 3);
        Assert.assertEquals(actUserID, ExpUserID);
		
	}
	
	@AfterMethod           //use ITestResult interface which gives status of test case from listeners interface 
	public void logOutFromApplication(ITestResult result) throws InterruptedException, IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			KiteUtilityClass.captureScreenShot(driver, TCID);
		}
		
		Thread.sleep(3000);
		home.logOut();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
