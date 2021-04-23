package COM.HFIC.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import HFIC.Pages.com.Baseclass;


public class Agreement extends Baseclass {
	WebDriver driver;
	public Agreement(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(name="payment_acknowledge")WebElement acknowledge;
	@FindBy(id="account_type") WebElement accoun_type;
	@FindBy(id="account_name") WebElement account_name;
	@FindBy(id="routing_aba") WebElement routing_aba;
	@FindBy(id="account_number") WebElement account_number;
	@FindBy(name="confirm_account_number") WebElement confirm_account_number;
	@FindBy(id="billing_address") WebElement billing_address;
	@FindBy(id="billing_address2") WebElement billing_address2;
	@FindBy(name="city") WebElement city;
	@FindBy(name="zip") WebElement zip;
	@FindBy(xpath="//input[@name='zip']//following::button[1]") WebElement Review_Payment;
	@FindBy(xpath="//*[contains(@class,'hf-save-review-payment-btn pull-right')]") WebElement Submit_Payment;
	@FindBy(id="account_signature") WebElement sign;
	@FindBy(xpath="//*[contains(text(),'HFA')]") WebElement Application_number;

	

	
	
	public void Agreement1(String an,String aba,String accnum,String caccnum,String baddr,String city1,String zip1) throws InterruptedException, IOException{
		sign.sendKeys("Srikanth");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);

		js.executeScript("arguments[0].click();", acknowledge);
		Select s =new Select( accoun_type);
		s.selectByIndex(1);
		account_name.sendKeys(an);
		routing_aba.sendKeys(aba);
		account_number.sendKeys(accnum);
		confirm_account_number.sendKeys(caccnum);
		billing_address.sendKeys(baddr);
		city.sendKeys(city1);
		zip.sendKeys(zip1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", Review_Payment);
		Thread.sleep(5000);
		Submit_Payment.click();
		Thread.sleep(5000);
		String appnum=Application_number.getText().substring(16, 23);
		System.out.println(appnum);
		//write data
		File src = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int lastrow=wb.getSheet("Pega").getLastRowNum()-wb.getSheet("Pega").getFirstRowNum();
		System.out.println(lastrow);
		wb.getSheet("Pega").createRow(lastrow+1).createCell(0).setCellValue(appnum);
		FileOutputStream outputStream = new FileOutputStream(src);
		wb.write(outputStream);
		outputStream.close();
		wb.close();		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(5000);
		
	}
	}
	


	

	

	

	
	


