package POM_DDF_TestNG_ScreenShotOFailedTC_PropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteUtilityClass
{
	public static String  getData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		 String excelPath = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\TestData\\excel Sheet.xlsx";
		 FileInputStream fis = new FileInputStream(excelPath);
		 Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet2");
		 String testData = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		 return testData;
	}
	
	public static void captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\ScreenShot\\TestCase"+TCID+".jpg");
		FileUtils.copyFile(src, destination);
		 
	}
	
	public static String getPropertyFileData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\PropertyFile.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String keyValue = prop.getProperty(key);
		return keyValue;
	}
	
	

}
