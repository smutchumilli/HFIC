package HFIC.Pages.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.com.Helper;

public class HFIC_SigninPage extends Baseclass {
	WebDriver driver;

	public HFIC_SigninPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "username")
	WebElement uname;
	@FindBy(id = "npn-tax-id")
	WebElement npn;
	@FindBy(id = "password")
	WebElement pass;
	@FindBy(css = "button.btn")
	WebElement signin;

	public void HFIC_Login(String UNAME, String NPN, String PASS) throws InterruptedException {
		uname.sendKeys(UNAME);
		npn.sendKeys(NPN);
		pass.sendKeys(PASS);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", signin);
		Thread.sleep(5000);

	}
}
