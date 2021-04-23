package HFIC.Testcases.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	@Test
	public void Read_Excel() throws IOException {

		File src = new File("Q:\\06A61A0533\\Test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Name");
		String s= "Srikanth";
		sheet.createRow(0).createCell(0).setCellValue(s);
		FileOutputStream outputStream = new FileOutputStream(src);
		wb.write(outputStream);
		outputStream.close();
		wb.close();

	}
}
