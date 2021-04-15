package COM.HFIC.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Agreement {
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
	@FindBy(className="hf-submit-payment-btn") WebElement Review_Payment;
	@FindBy(xpath="//*[contains(@class,'hf-save-review-payment-btn pull-right')]") WebElement Submit_Payment;
	
	public void Agreement1(String an,String aba,String accnum,String caccnum,String baddr,String city1,String zip1) throws InterruptedException{
		JavascriptExecutor js= (JavascriptExecutor)driver;
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
		Review_Payment.click();
		Thread.sleep(2000);
		Submit_Payment.click();
		Thread.sleep(10000);
	}
	

}	

	

	

	

	
	


