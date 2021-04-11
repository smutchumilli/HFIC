package Utilities.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataProvider {
	public XSSFWorkbook wb;

	public TestDataProvider() {

		File Src = new File("./TestData/TestDATA.xlsx");
		try {
			FileInputStream fis = new FileInputStream(Src);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("Unable to read the Test data" + e.getMessage());
		}
	}

	public String getstringdata(String sheetname, int row, int col) {

		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();

	}

	public String getstringdata(int sheetindex, int row, int col) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();

	}
	public double getintdata(int sheetindex, int row, int col) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getNumericCellValue();


	}

}
