package COM.HFIC.Pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;

public class HealthInsurencePlans extends Baseclass {
	//WebDriver driver;
	public HealthInsurencePlans(WebDriver driver){
		this.driver= driver;
	}

	@FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Bronze 6650 Pro EPO']") WebElement P1;
	@FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Gold 25/50/0 Pro EPO']") WebElement P2;
	@FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Platinum Pro Plus EPO']") WebElement P3;
	@FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Silver Pro EPO']") WebElement P4;
	@FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Bronze 8150 Pro EPO']") WebElement P5;



	
	
	@FindBy(className="begin-application-btn") WebElement continu;
	

	public void Health_Insurence_Plans() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P1);
		js.executeScript("arguments[0].click();", P1);
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P2);

		js.executeScript("arguments[0].click();", P2);
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P3);

		js.executeScript("arguments[0].click();", P3);
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P4);

		js.executeScript("arguments[0].click();", P4);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P5);

		js.executeScript("arguments[0].click();", P5);
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", P6);
//		js.executeScript("arguments[0].click();", P6);
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", continu);

		js.executeScript("arguments[0].click();", continu);
		test.log( Status.INFO," Health insurense plans selected");

	}
	
}
