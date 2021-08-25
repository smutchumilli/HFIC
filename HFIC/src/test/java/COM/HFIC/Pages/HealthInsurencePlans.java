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
	// WebDriver driver;
	public HealthInsurencePlans(WebDriver driver) {
		this.driver = driver;
	}

	// @FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Bronze
	// 6650 Pro EPO']") WebElement P1;
	// @FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Gold
	// 25/50/0 Pro EPO']") WebElement P2;
	// @FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst
	// Platinum Pro Plus EPO']") WebElement P3;
	// @FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Silver
	// Pro EPO']") WebElement P4;
	// @FindBy(xpath="//*[@id='quotePlanSlection']//*[@planname='Healthfirst Bronze
	// 8150 Pro EPO']") WebElement P5;

	@FindBy(xpath = "//button[@planname='Healthfirst Bronze 5250 Pro EPO']")
	WebElement B1;
	@FindBy(xpath = "//button[@planname='Healthfirst Bronze 6850 Pro EPO']")
	WebElement B2;
	@FindBy(xpath = "//button[@planname='Healthfirst Bronze 6850 Pro Plus EPO']")
	WebElement B3;
	@FindBy(xpath = "//button[@planname='Healthfirst Bronze 8225 Pro EPO']")
	WebElement B4;
	@FindBy(xpath = "//button[@planname='Healthfirst Bronze Pro EPO']")
	WebElement B5;
	@FindBy(xpath = "//button[@planname='Healthfirst Bronze Pro Plus EPO']")
	WebElement B6;

	@FindBy(xpath = "//button[@planname='Healthfirst Gold 1350 Pro EPO']")
	WebElement G1;
	@FindBy(xpath = "//button[@planname='Healthfirst Gold 1350 Pro Plus EPO']")
	WebElement G2;
	@FindBy(xpath = "//button[@planname='Healthfirst Gold 25/50/0 Pro EPO']")
	WebElement G3;
	@FindBy(xpath = "//button[@planname='Healthfirst Gold 25/50/0 Pro Plus EPO']")
	WebElement G4;
	@FindBy(xpath = "//button[@planname='Healthfirst Gold Pro EPO']")
	WebElement G5;
	@FindBy(xpath = "//button[@planname='Healthfirst Gold Pro Plus EPO']")
	WebElement G6;

	@FindBy(xpath = "//button[@planname='Healthfirst Platinum Pro EPO']")
	WebElement P1;
	@FindBy(xpath = "//button[@planname='Healthfirst Platinum Pro Plus EPO']")
	WebElement P2;

	@FindBy(xpath = "//button[@planname='Healthfirst Silver 40/75/4700 Pro EPO']")
	WebElement S1;
	@FindBy(xpath = "//button[@planname='Healthfirst Silver 40/75/4700 Pro Plus EPO']")
	WebElement S2;
	@FindBy(xpath = "//button[@planname='Healthfirst Silver Pro EPO']")
	WebElement S3;
	@FindBy(xpath = "//button[@planname='Healthfirst Silver Pro Plus EPO']")
	WebElement S4;

	@FindBy(className = "begin-application-btn")
	WebElement continu;

	public void Health_Insurence_Plans() throws InterruptedException {
		// COMBINATION 1
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B1);
		js.executeScript("arguments[0].click();", B1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B2);
		js.executeScript("arguments[0].click();", B2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B4);
		js.executeScript("arguments[0].click();", B4);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B5);
		js.executeScript("arguments[0].click();", B5);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G1);
		js.executeScript("arguments[0].click();", G1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G3);
		js.executeScript("arguments[0].click();", G3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G5);
		js.executeScript("arguments[0].click();", G5);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", P1);
		js.executeScript("arguments[0].click();", P1);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", S2);
		js.executeScript("arguments[0].click();", S1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", S4);
		js.executeScript("arguments[0].click();", S3);
		// COMBINATION 2
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B1);
//		js.executeScript("arguments[0].click();", B1);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B2);
//		js.executeScript("arguments[0].click();", B2);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B3);
//		js.executeScript("arguments[0].click();", B3);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", B6);
//		js.executeScript("arguments[0].click();", B6);
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G2);
//		js.executeScript("arguments[0].click();", G2);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G4);
//		js.executeScript("arguments[0].click();", G4);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", G6);
//		js.executeScript("arguments[0].click();", G6);
//		
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", P2);
//		js.executeScript("arguments[0].click();", P2);
//		
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", S1);
//		js.executeScript("arguments[0].click();", S2);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", S3);
//		js.executeScript("arguments[0].click();", S4);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continu);

		js.executeScript("arguments[0].click();", continu);
		test.log(Status.INFO, " Health insurense plans selected");

	}

}
