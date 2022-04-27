package framework;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToursTestClass {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		String excelSheetPath = "C:\\Selenium Files\\excel Sheet.xlsx";
		FileInputStream fis = new FileInputStream(excelSheetPath);
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet2");
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		ToursLogin1Page login1 = new ToursLogin1Page(driver);
		login1.clickToursLogin1PageRegisterLink();

		ToursLogin2Page login2 = new ToursLogin2Page(driver);
		login2.inputToursLogin2PageFirstName(sheet.getRow(1).getCell(0).getStringCellValue());

		login2.inputToursLogin2PageLastName(sheet.getRow(1).getCell(1).getStringCellValue());

		login2.inputToursLogin2PagePhone(sheet.getRow(1).getCell(2).getStringCellValue());

		login2.inputToursLogin2PageEmail(sheet.getRow(1).getCell(3).getStringCellValue());

		login2.inputToursLogin2PageAddress(sheet.getRow(1).getCell(4).getStringCellValue());

		login2.inputToursLogin2PageCity(sheet.getRow(1).getCell(5).getStringCellValue());

		login2.inputToursLogin2PageState(sheet.getRow(1).getCell(6).getStringCellValue());

		login2.inputToursLogin2PageCode(sheet.getRow(1).getCell(7).getStringCellValue());

		login2.inputToursLogin2PageCountry();

		login2.inputToursLogin2PageUserName(sheet.getRow(1).getCell(8).getStringCellValue());

		login2.inputToursLogin2PagePassword(sheet.getRow(1).getCell(9).getStringCellValue());

		login2.inputToursLogin2Pageconfirmpassword(sheet.getRow(1).getCell(10).getStringCellValue());

		Thread.sleep(3000);
		login2.clickToursLogin2PageSubmitButton();

		

	}

}
