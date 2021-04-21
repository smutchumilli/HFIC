package Utilities.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataProvider {
	public XSSFWorkbook wb;

	public TestDataProvider() {

		File Src = new File("./TestData/TestData.xlsx");
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
	public void writestringdata(String sheetname, int row, int col,String Value) throws IOException {
		String Src1 = "C:\\Users\\smutchumilli\\git\\HFIC\\HFIC\\TestData\\TestData.xlsx";
		wb.getSheet(sheetname).getRow(row).createCell(col).setCellValue(Value);
		FileOutputStream fos = new FileOutputStream(Src1);
		wb.write(fos);
		fos.close();

	}
	

}
