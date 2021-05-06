package COM.HFIC.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Pages.com.Baseclass;
import Utilities.com.TestDataProvider;


public class Agreement  {
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
	@FindBy(xpath="//*[contains(text(),'HFA')]")
	WebElement Application_number;
	public static String appnum;
	public static String amount;
	public static double amount1;



	

	
	
	public void Agreement1() throws InterruptedException, IOException{
		
		TestDataProvider data= new TestDataProvider();
		sign.sendKeys("Srikanth");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", acknowledge);
		Select s =new Select( accoun_type);
		s.selectByIndex(1);
		account_name.sendKeys(data.getstringdata("Login", 20, 0));
		routing_aba.sendKeys(data.getstringdata("Login", 21, 0));
		account_number.sendKeys(data.getstringdata("Login", 22, 0));
		confirm_account_number.sendKeys(data.getstringdata("Login", 23, 0));
		billing_address.sendKeys(data.getstringdata("Login", 24, 0));
		city.sendKeys(data.getstringdata("Login", 25, 0));
		zip.sendKeys(data.getstringdata("Login", 26, 0));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Review_Payment);
		Thread.sleep(5000);
		Submit_Payment.click();
		Thread.sleep(5000);
		appnum=Application_number.getText().substring(16, 23);
		String amount=Application_number.getText().substring(117,126).replaceAll("[$,]", "");
		amount1 = Double.parseDouble(amount);
		System.out.println(appnum);
		System.out.println(amount1);

		
		
		
//		//write data
//		File src = new File("./TestData/TestData.xlsx");
//		FileInputStream fis = new FileInputStream(src);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
////		int lastrow=wb.getSheet("Pega").getLastRowNum()-wb.getSheet("Pega").getFirstRowNum();
////		System.out.println(lastrow);
//		wb.getSheet("Pega").createRow(2).createCell(0).setCellValue(appnum);
//		FileOutputStream outputStream = new FileOutputStream(src);
//		wb.write(outputStream);
//		outputStream.close();
//		wb.close();		
		//driver.findElement(By.xpath("//*[text()='Log Out']")).click();
			
	}
	
	
	}
	


	

	

	

	
	


