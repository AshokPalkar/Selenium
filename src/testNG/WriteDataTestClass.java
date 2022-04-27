package testNG;

import java.io.IOException;

import org.testng.annotations.Test;

public class WriteDataTestClass 
{
	@Test
	public void setData() throws IOException
	{
		WriteDataPropertyFile.writeDataPropertyFile("name","Ashok");
		WriteDataPropertyFile.writeDataPropertyFile("UN","umesh");
		
	}

}
