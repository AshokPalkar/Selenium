package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KiteUtilityClass
{
	public static String  getData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		 String excelPath = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\TestData\\excel Sheet.xlsx";
		 FileInputStream fis = new FileInputStream(excelPath);
		 Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet2");
		 String testData = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		 return testData;
	}
	

}
