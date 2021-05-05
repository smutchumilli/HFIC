package COM.HFIC.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GroupInformationPage {
	public WebDriver driver;

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

	public void Group_Information_Page(String Tax, String paddress, String pcity1, String pzip, String pphone,
			String bafname, String balastname, String baemail, String baphonenumber, String bastreetaddress,
			String bacity, String bazip, String bfname, String blastname, String bemail, String dba1, String CEO1,
			String nob1, String paddr21, String pfax1, String industry_type1, String naics1, String baaddr21,
			String baacnt1, String abapn1, String billing_street_address21, String billing_street_address1,
			String billingCityInput1, String billingZipInput1, String billing_phone_number1, String billing_fax_number1)
			throws InterruptedException {
		Tax1.sendKeys(Tax);
		paddress11.sendKeys(paddress);
		pcity.sendKeys(pcity1);
		pzip1.sendKeys(pzip);
		pphone1.sendKeys(pphone);
		bafname1.sendKeys(bafname);
		balastname1.sendKeys(balastname);
		baemail1.sendKeys(baemail);
		baphonenumber1.sendKeys(baphonenumber);
		bastreetaddress1.sendKeys(bastreetaddress);
		bacity1.sendKeys(bacity);
		bazip1.sendKeys(bazip);
		bfname1.sendKeys(bfname);
		blastname1.sendKeys(blastname);
		bemail1.sendKeys(bemail);
		Thread.sleep(4000);
		Select s = new Select(driver.findElement(By.name("businessTypeSelect")));
		s.selectByIndex(5);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		WebElement affr = driver.findElement(By.xpath("//input[@name='nature_of_business']//following::input[2]"));
		js4.executeScript("arguments[0].click();", affr);
		WebElement cnt1 = driver.findElement(By.xpath("//input[@name='billing_email_address']//following::button[1]"));
		DBA.sendKeys(dba1);
		CEO.sendKeys(CEO1);
		nob.sendKeys(nob1);
		paddr2.sendKeys(paddr21);
		pfax.sendKeys(pfax1);
		industry_type.sendKeys(industry_type1);
		naics.sendKeys(naics1);
		baaddr2.sendKeys(baaddr21);
		baacnt.sendKeys(baacnt1);
		abapn.sendKeys(abapn1);
		billinginformation.click();
		billing_street_address.sendKeys(billing_street_address1);
		billingCityInput.sendKeys(billingCityInput1);
		Select s2 = new Select(billingStateSelect);
		s2.selectByVisibleText("NY");
		billingZipInput.sendKeys(billingZipInput1);
		billing_phone_number.sendKeys(billing_phone_number1);
		billing_street_address2.sendKeys(billing_street_address21);
		billing_fax_number.sendKeys(billing_fax_number1);
		js4.executeScript("arguments[0].click();", cnt1);

	}

}