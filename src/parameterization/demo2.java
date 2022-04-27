package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Project\\TestData\\excel Sheet.xlsx");
		Sheet sheet = WorkbookFactory.create(fis).getSheet("Sheet1");
		int rowIndex = sheet.getLastRowNum();
		int cellSize = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=rowIndex;i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<cellSize;j++)
			{
				Cell cell = row.getCell(j);
						switch(cell.getCellType())
						{
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
	}

}
