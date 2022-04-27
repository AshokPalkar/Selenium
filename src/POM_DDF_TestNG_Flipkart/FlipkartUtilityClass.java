package POM_DDF_TestNG_Flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class FlipkartUtilityClass 
{
	
	public static void captureScreenShot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\ScreenShot\\TesCase"+TCID+".jpg");
		FileHandler.copy(src, destination);
	}
	
	public static String getPropFileData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\FlipkartPropFile.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String keyValue = prop.getProperty(key);
		return keyValue;
	}
	public static String getExcelSheetData(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\TestData\\excel Sheet.xlsx");
		
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet3");
		String testData = sheet.getRow(row).getCell(cell).getStringCellValue();
		return testData;
		
	}	
//		
//		XSSFWorkbook book = new XSSFWorkbook(fis);
//		Sheet sh = book.getSheetAt(2);
//		ArrayList al1=new ArrayList();
//		for(Row row1 : sh)
//		{
//			for(org.apache.poi.ss.usermodel.Cell cell1:row1)
//			{
//				
//				al1.add(cell1.getStringCellValue());
//			}
//		}
	}


