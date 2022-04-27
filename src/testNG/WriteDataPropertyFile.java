package testNG;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataPropertyFile
{
	public static void writeDataPropertyFile(String key,String Value) throws IOException
	{
		Properties prop = new Properties();
		prop.put(key, Value);
		
		FileOutputStream fis = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\writedata.properties");
		
		prop.store(fis, null);
	}

}
