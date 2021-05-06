package COM.HFIC.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.com.Baseclass;
import Utilities.com.TestDataProvider;

public class COBRA_Coverage  {
WebDriver driver;
	public COBRA_Coverage(WebDriver driver) {
		this.driver = driver;
	}
	public TestDataProvider data;

	@FindBy(id = "isCoveredByCobraYes")
	WebElement RDO_isCoveredByCobraYes;
	@FindBy(name = "benefits_period")
	WebElement Text_benefits_period;
	@FindBy(name = "individuals_currently_covered")
	WebElement Txt_individuals_currently_covered;
	@FindBy(id = "isDisabledInHospitalYes")
	WebElement RDO_isDisabledInHospitalYes;
	@FindBy(xpath = "//input[@name='benefits_period']//following::button[1]")
	WebElement Btn_cnt;

	public void COBRA_Coverage1() throws InterruptedException
	{
		
		data= new TestDataProvider();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", RDO_isCoveredByCobraYes);
		Txt_individuals_currently_covered.sendKeys(data.getstringdata("Login", 0, 1));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", RDO_isDisabledInHospitalYes);
		Text_benefits_period.sendKeys(data.getstringdata("Login", 0, 1));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Btn_cnt);

	}

}
