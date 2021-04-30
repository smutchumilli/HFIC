package Pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Get_Quotepage {
	WebDriver driver;
	
	public Get_Quotepage(WebDriver driver){
		this.driver= driver;
	}
@FindBy(id="employerName")@CacheLookup WebElement employerName;
@FindBy(id="employerZipInput") @CacheLookup WebElement employerZip;
@FindBy(id="extendCoverageNo")  WebElement extendcoverage;
@FindBy(id="requestedEffectiveDateSelect")@CacheLookup  WebElement requestedEffectiveDateSelect;
@FindBy(className="hf-continue-btn")@CacheLookup  WebElement continu;

public void GetQuotepage(String ename, String zip) throws InterruptedException{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	employerName.sendKeys(ename);
	employerZip.sendKeys(zip);
	js.executeScript("arguments[0].click();", extendcoverage);
	Select s = new Select(driver.findElement(By.id("requestedEffectiveDateSelect")));
	s.selectByIndex(10);
	continu.click();
	Thread.sleep(8000);

	
}

	
}
