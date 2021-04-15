package COM.HFIC.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GroupInformationPage {
	public WebDriver driver;
	public GroupInformationPage(WebDriver driver){
		this.driver=driver;
	} 

	@FindBy(name="tax_id_number") WebElement  Tax1;
	@FindBy(xpath="//*[@id='applicationModalContainer']/div/div[2]/div[5]/div[2]/div[2]/div/label") WebElement affiliate;
	@FindBy(id="businessTypeSelect")WebElement businessTypeSelect;
	@FindBy(name="primary_business_address")WebElement paddress11;
	@FindBy(name="primaryBusinessCityInput")WebElement pcity;
	@FindBy(name="primaryBusinessZipInput")WebElement pzip1;
	@FindBy(name="primary_business_phone_number")WebElement pphone1;
	@FindBy(name="benefits_administrator_first_name")WebElement bafname1;
	@FindBy(name="benefits_administrator_last_name")WebElement balastname1;
	@FindBy(name="benefits_administrator_email_address")WebElement baemail1;
	@FindBy(name="benefits_administrator_phone_number")WebElement baphonenumber1;
	@FindBy(name="benefits_administrator_street_address")WebElement bastreetaddress1;
	@FindBy(name="benefitsAdministratorCityInput")WebElement bacity1;
	@FindBy(name="benefitsAdministratorZip")WebElement bazip1;
	@FindBy(name="billing_first_name")WebElement bfname1;
	@FindBy(name="billing_last_name")WebElement blastname1;
	@FindBy(name="billing_email_address")WebElement bemail1;
	@FindBy(xpath="//*[@id='applicationModalContainer']/div/div[2]/div[30]/div/button")WebElement con;
	

public 	void Group_Information_Page(
		String Tax,
		String paddress,
		String pcity1,
		String pzip,
		String pphone,
		String bafname,
		String balastname,
		String baemail,
		String baphonenumber,
		String bastreetaddress,
		String bacity,
		String bazip,
		String bfname,
		String blastname,
		String bemail) throws InterruptedException {
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
	Thread.sleep(5000);
	Select s= new Select(driver.findElement(By.name("businessTypeSelect")));
	s.selectByIndex(5);
	JavascriptExecutor js4= (JavascriptExecutor)driver;
	WebElement affr= driver.findElement(By.xpath("//*[@id='applicationModalContainer']/div/div[2]/div[5]/div[2]/div[2]/div/label"));
	js4.executeScript("arguments[0].click();", affr);
	WebElement cnt1=driver.findElement(By.xpath("//*[@id='applicationModalContainer']/div/div[2]/div[30]/div/button"));
	js4.executeScript("arguments[0].click();", cnt1);

}
	
}