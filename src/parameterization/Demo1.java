package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelSheetPath = "C:\\Selenium Files\\excel Sheet.xlsx";
		FileInputStream fis = new FileInputStream(excelSheetPath);
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");
		int lastRowIndex = sheet.getLastRowNum();
		short cellSize = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i <= lastRowIndex; i++) {
			Row row = sheet.getRow(i);

			for (int c = 0; c < cellSize; c++) {
				Cell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					
					
				}
				System.out.print(" | ");
			}
			System.out.println();
		}

//		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
	}

}
