package COM.HFIC.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Utilities.com.TestDataProvider;

public class GroupInformationPage extends Baseclass{
//	public WebDriver driver;
public TestDataProvider data;
	public GroupInformationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "tax_id_number")
	WebElement Tax1;
	@FindBy(xpath = "//*[@id='applicationModalContainer']/div/div[2]/div[5]/div[2]/div[2]/div/label")
	WebElement affiliate;
	@FindBy(id = "businessTypeSelect")
	WebElement businessTypeSelect;
	@FindBy(name = "primary_business_address")
	WebElement paddress11;
	@FindBy(name = "primaryBusinessCityInput")
	WebElement pcity;
	@FindBy(name = "primaryBusinessZipInput")
	WebElement pzip1;
	@FindBy(name = "primary_business_phone_number")
	WebElement pphone1;
	@FindBy(name = "benefits_administrator_first_name")
	WebElement bafname1;
	@FindBy(name = "benefits_administrator_last_name")
	WebElement balastname1;
	@FindBy(name = "benefits_administrator_email_address")
	WebElement baemail1;
	@FindBy(name = "benefits_administrator_phone_number")
	WebElement baphonenumber1;
	@FindBy(name = "benefits_administrator_street_address")
	WebElement bastreetaddress1;
	@FindBy(name = "benefitsAdministratorCityInput")
	WebElement bacity1;
	@FindBy(name = "benefitsAdministratorZip")
	WebElement bazip1;
	@FindBy(name = "billing_first_name")
	WebElement bfname1;
	@FindBy(name = "billing_last_name")
	WebElement blastname1;
	@FindBy(name = "billing_email_address")
	WebElement bemail1;
	@FindBy(xpath = "//*[@id='applicationModalContainer']/div/div[2]/div[30]/div/button")
	WebElement con;
	//

	@FindBy(name = "doing_business_as")
	WebElement DBA;
	@FindBy(name = "owner_ceo")
	WebElement CEO;
	@FindBy(name = "nature_of_business")
	WebElement nob;
	@FindBy(name = "primary_business_address_2")
	WebElement paddr2;
	@FindBy(name = "primary_business_fax_number")
	WebElement pfax;
	@FindBy(id = "industry_type")
	WebElement industry_type;
	@FindBy(name = "naics_number")
	WebElement naics;
	@FindBy(name = "benefits_administrator_address2")
	WebElement baaddr2;
	@FindBy(name = "benefits_administrator_additional_contact")
	WebElement baacnt;
	@FindBy(id = "additional_benefits_administrator_phone_number")
	WebElement abapn;
	@FindBy(id = "billing-information")
	WebElement billinginformation;

	@FindBy(name = "billing_street_address")
	WebElement billing_street_address;
	@FindBy(name = "billing_street_address2")
	WebElement billing_street_address2;
	@FindBy(name = "billingCityInput")
	WebElement billingCityInput;
	@FindBy(id = "billingZipInput")
	WebElement billingZipInput;
	@FindBy(id = "billing_phone_number")
	WebElement billing_phone_number;
	@FindBy(id = "billingStateSelect")
	WebElement billingStateSelect;
	@FindBy(id = "billing_fax_number")
	WebElement billing_fax_number;

	public void Group_Information_Page()
			throws InterruptedException {
		
		
		data= new TestDataProvider();
		DBA.sendKeys(data.getstringdata("Login", 1, 6));
		Tax1.sendKeys(data.getstringdata("Login", 2, 6));
		CEO.sendKeys(data.getstringdata("Login", 3, 6));
		nob.sendKeys(data.getstringdata("Login", 4, 6));
		paddress11.sendKeys(data.getstringdata("Login", 5, 6));
		paddr2.sendKeys(data.getstringdata("Login", 6, 6));
		pcity.sendKeys(data.getstringdata("Login", 7, 6));
	//	pzip1.sendKeys(data.getstringdata("Login", 8, 6));
		pphone1.sendKeys(data.getstringdata("Login", 9, 6));
		pfax.sendKeys(data.getstringdata("Login", 10, 6));
		industry_type.sendKeys(data.getstringdata("Login", 11, 6));
		naics.sendKeys(data.getstringdata("Login", 12, 6));	
		
		
		bafname1.sendKeys(data.getstringdata("Login", 13, 6));
		balastname1.sendKeys(data.getstringdata("Login", 14, 6));
		baemail1.sendKeys(data.getstringdata("Login", 15, 6));
		baphonenumber1.sendKeys(data.getstringdata("Login", 16, 6));
		bastreetaddress1.sendKeys(data.getstringdata("Login", 17, 6));
		baaddr2.sendKeys(data.getstringdata("Login", 18, 6));
		bacity1.sendKeys(data.getstringdata("Login", 19, 6));
		bazip1.sendKeys(data.getstringdata("Login", 20, 6));
		baacnt.sendKeys(data.getstringdata("Login", 21, 6));
		abapn.sendKeys(data.getstringdata("Login", 22, 6));
	//	
		bfname1.sendKeys(data.getstringdata("Login", 23, 6));
		blastname1.sendKeys(data.getstringdata("Login", 24, 6));
		bemail1.sendKeys(data.getstringdata("Login", 25, 6));
		
		Thread.sleep(4000);
		Select s = new Select(driver.findElement(By.name("businessTypeSelect")));
		s.selectByIndex(5);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		WebElement affr = driver.findElement(By.xpath("//input[@name='nature_of_business']//following::input[2]"));
		js4.executeScript("arguments[0].click();", affr);
		WebElement cnt1 = driver.findElement(By.xpath("//input[@name='billing_email_address']//following::button[1]"));
		
		
	//	
		billinginformation.click();
		billing_street_address.sendKeys(data.getstringdata("Login", 26, 6));
		billing_street_address2.sendKeys(data.getstringdata("Login", 27, 6));
		billingCityInput.sendKeys(data.getstringdata("Login", 28, 6));
		Select s2 = new Select(billingStateSelect);
		s2.selectByVisibleText("NY");
		billingZipInput.sendKeys(data.getstringdata("Login", 29, 6));
		billing_phone_number.sendKeys(data.getstringdata("Login", 30, 6));
		billing_fax_number.sendKeys(data.getstringdata("Login", 31, 6));
		js4.executeScript("arguments[0].click();", cnt1);
		test.log( Status.INFO,"Group information is entered successfully");


	}

}