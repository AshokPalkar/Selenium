//package framework;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//public class KiteTestClass 
//{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
//	{
//		String excelSheetPath = "C:\\Selenium Files\\excel Sheet.xlsx";
//		FileInputStream fis = new FileInputStream(excelSheetPath);
//		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet2");
//		
//		System.setProperty("webdriver.edge.driver", "C:\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		KiteLogin1Page login1 = new KiteLogin1Page(driver);
//		login1.inputKiteLogin1PageUsername(sheet.getRow(0).getCell(0).getStringCellValue());
//		login1.inputKiteLogin1PagePassword(sheet.getRow(0).getCell(1).getStringCellValue());
//		login1.inputKiteLogin1PageLoginButton();
//		
//		KiteLogin2Page login2 = new KiteLogin2Page(driver);
//		login2.inputKiteLogin2PagePin(sheet.getRow(0).getCell(2).getStringCellValue());
//		login2.inputKiteLogin2PageSubmitButton();
//		
////		KiteHomePage home = new KiteHomePage(driver);
////		home.verifyKiteHomePageUserId(sheet.getRow(0).getCell(3).getStringCellValue());
////		
//		//Thread.sleep(2000);
//		//driver.close();
//		
//		
//		
//		
//	}
//
//}
