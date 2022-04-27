package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Demo 
{
	@BeforeMethod
	public void login()
	{
		Reporter.log("Running login test case",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Running logout test case",true);
	}
	
	@Test(priority=3)
	public void test1()
	{
		Reporter.log("Running test 1",true);
	}
	
	@Test(priority=2)
	public void test2()
	{
		Reporter.log("Running test 2",true);
	}
	
	@Test(priority=1)
	public void test3()
	{
		Reporter.log("Running test 3",true);
	}

}
