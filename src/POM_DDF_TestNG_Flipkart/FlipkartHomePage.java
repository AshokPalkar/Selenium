package POM_DDF_TestNG_Flipkart;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlipkartHomePage {
	@FindBy(xpath = "//div[@class='exehdJ']")
	private WebElement userName;

	@FindBy(xpath = "//ul[@class='pO9syL undefined']//li")
	private List<WebElement> userNameDropDown;

	int rowIndex;
	int cellIndex;
	String actualText;

	public FlipkartHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void mouseOverOnUserID(WebDriver driver) throws EncryptedDocumentException, IOException {

		Actions action = new Actions(driver);
		action.moveToElement(userName).perform();
	}
        public void userDropDown() throws EncryptedDocumentException, IOException {
        	 for (int i = 0; i <= 9; i++) {
     			String expectedText = FlipkartUtilityClass.getExcelSheetData(0, i);
     			System.out.println(expectedText);

     			for (WebElement option : userNameDropDown) {
     				String actualText = option.getText();
     				System.out.println(actualText);

     				if (actualText.equals(expectedText)) {
     					Assert.assertTrue(true);
     					break;
     				}

     			}
     		}

        
	}
}


//ArrayList al = new ArrayList(userNameDropDown);
//System.out.println(al.size());
