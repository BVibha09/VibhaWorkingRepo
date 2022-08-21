package utilpac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.testbase;

public class testutil extends testbase {
	public static long Page_load_timeout = 40;
	public static long Implicitly_wait = 10;

	static Workbook book;
	static Sheet sheet;
	
	public void explicitwait(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public static Object[][] getTestData(String sheetname) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(
					"C:\\Users\\UE\\eclipse-workspace\\Pitonsops\\src\\main\\java\\testdat\\Piton_adisan.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
		Object[][] value = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				value[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return value;
	}
}
