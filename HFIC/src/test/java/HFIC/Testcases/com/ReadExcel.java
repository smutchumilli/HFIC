package HFIC.Testcases.com;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadExcel {
	@Test
	public void Read_Excel() throws IOException {
		
		File src = new File("Q:\\06A61A0533\\Test.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		int totlrows=wb.getSheet("Name").getLastRowNum();
		int totalcols= wb.getSheet("Name").getRow(1).getLastCellNum();
		System.out.println("Total no of rows are "+totlrows);
		System.out.println("Total no of columns are "+totalcols);
		for(int i=0;i<=totlrows-1;i++) {
			for(int j=0;j<=totalcols-1;j++) {
			String data=wb.getSheet("Name").getRow(i).getCell(j).getStringCellValue();
			System.out.print(" "+data);

			}
	        System.out.println();

			wb.close();
		}

	}
}
	
		