package HFIC.Pages.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.sun.glass.events.KeyEvent;

import Utilities.com.Helper;
import io.reactivex.rxjava3.functions.Action;

public class PEGA_SMG_Process extends Baseclass {

	public PEGA_SMG_Process(WebDriver driver) {
		this.driver = driver;
	}

	// input[@id='txtUserID']
	@FindBy(xpath = "//input[@id='txtUserID']")
	WebElement userid;
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement Password;
	@FindBy(xpath = "//button[@id='sub']")
	WebElement Login_Button;
	@FindBy(xpath = "//button[@name='HFICUnAssignedWorkBasket_pyDisplayHarness_67']//following::a[5]")
	WebElement appid_filter;
	@FindBy(xpath = "//button[@name='HFICOperatorFirstReviewApplications_pyDisplayHarness_677']//following::a[5]")
	WebElement appid_filter_Suser;

	@FindBy(xpath = "//input[@id='ef910d46']")
	WebElement appid_search_text;
	@FindBy(xpath = "//input[@id='156a3c55']")
	WebElement appid_search_text_suser;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement Apply_button;
	@FindBy(xpath = "//*[text()='SMG']//preceding::input[1]")
	WebElement checkbox;
	@FindBy(xpath = "//button[text()='Assign Applications']")
	WebElement Assignbtton;
	@FindBy(xpath = "//input[@id='19c272f1']")
	WebElement assign_id;
	@FindBy(xpath = "//button[@name='HFICUnAssignedTask_pyDisplayHarness_41']")
	WebElement submit;
	@FindBy(css = "img.pzbtn-img")
	WebElement image;
	@FindBy(xpath = "//*[@id='pyNavigation1615791358304']/li[3]/a/span/span")
	WebElement logout;

	// PEGA Login:

	public void HFIC_Manager_Login(String uid, String pwd, String app_id, String user) throws InterruptedException {
		Thread.sleep(2500);
		driver.get("https://pegaenbst.healthfirst.org/prweb");
		userid.sendKeys(uid);
		Password.sendKeys(pwd);
		Login_Button.click();
		appid_filter.click();
		appid_search_text.sendKeys(app_id);
		Apply_button.click();
		checkbox.click();
		Assignbtton.click();
		assign_id.sendKeys(user);
		submit.click();
		image.click();
		logout.click();

	}

	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[2]//td[1]")
	WebElement Results;
	// @FindBy(xpath="//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG1)_429']")
	// WebElement confirm1;
	@FindBy(linkText = "CONFIRM")
	WebElement confirm;

	@FindBy(xpath = "//a[@name='ActionButtons_pyWorkPage_2']")
	WebElement next;
	@FindBy(xpath = "//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG2)_430']")
	WebElement confirm2;

	@FindBy(xpath = "//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG3)_430']")
	WebElement confirm3;
	@FindBy(xpath = "//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG4)_430']")
	WebElement confirm4;
	@FindBy(xpath = "//a[@name='ActionButtons_pyWorkPage_7']")
	WebElement review_mship;;

	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[2]")
	WebElement row1;
	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[3]")
	WebElement row2;;
	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[4]")
	WebElement row3;;
	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[5]")
	WebElement row4;;

	@FindBy(linkText = "GO TO MEMBER LISTING")
	WebElement mem_listing;
	@FindBy(linkText = "Next")
	WebElement Next1;

	@FindBy(xpath = "//*[text()='PaymentAuthorizationForm']//following::input[5]")
	WebElement PAF_Doc_Approval;
	@FindBy(xpath = "//*[text()='NYS45']//following::input[5]")
	WebElement NYS45_Doc_Approval;
	@FindBy(xpath = "//*[text()='GroupApplication']//following::input[5]")
	WebElement Grpappl_Doc_Approval;

	public void HFIC_Superuser_login(String uid, String pwd, String app_id) throws InterruptedException {

		userid.sendKeys(uid);
		Password.sendKeys(pwd);
		Login_Button.click();
		appid_filter_Suser.click();
		appid_search_text_suser.sendKeys(app_id);
		Apply_button.click();
		Results.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm);
		confirm.click();
		Thread.sleep(2000);

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm2);

		confirm.click();
		Thread.sleep(2000);

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm3);

		confirm.click();
		Thread.sleep(2000);

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm4);

		confirm.click();
		Thread.sleep(2000);

		next.click();
		Thread.sleep(2000);

		review_mship.click();
		Thread.sleep(6000);
		///

		GRPAPPL.click();
		Thread.sleep(2000);

		Grpappl_Doc_Approval.click();
		Thread.sleep(2000);

		NYS45.click();
		Thread.sleep(2000);

		NYS45_Doc_Approval.click();
		Thread.sleep(2000);

		PAF.click();
		Thread.sleep(2000);

		PAF_Doc_Approval.click();
		Thread.sleep(3500);

		row1.click();
		confirm.click();
		Thread.sleep(2000);

		mem_listing.click();

		Thread.sleep(3000);

		row2.click();
		confirm.click();
		Thread.sleep(2000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(2000);

		mem_listing.click();
		Thread.sleep(2000);

		row3.click();
		Thread.sleep(1000);

		confirm.click();

		Thread.sleep(1000);

		Next1.click();
		Thread.sleep(1000);

		confirm.click();

		Thread.sleep(1000);

		mem_listing.click();

		Thread.sleep(2000);

		row3.click();
		Thread.sleep(1000);

		confirm.click();
		Thread.sleep(1000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1000);

		mem_listing.click();
		Thread.sleep(2000);

		row4.click();
		Thread.sleep(1000);

		confirm.click();
		Thread.sleep(1000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1000);

		mem_listing.click();
		Thread.sleep(2000);

		Review_PAYMENT.click();
		Thread.sleep(2000);

		Final_Review.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(2000);

		SUbmit.click();
		Thread.sleep(3000);

		image.click();
		Thread.sleep(3500);

		Super_Logout.click();
		Thread.sleep(3500);

	}

	@FindBy(xpath = "//*[text()='Log off']")
	WebElement Super_Logout;
	@FindBy(name = "FinalReviewActionButtons_pyWorkPage_1")
	WebElement SUbmit;

	@FindBy(xpath = "//*[text()='GO TO STEP:3 REVIEW PAYMENT']")
	WebElement Review_PAYMENT;
	@FindBy(xpath = "//*[text()='GO TO STEP 4: FINAL REVIEW']")
	WebElement Final_Review;

	@FindBy(xpath = "//*[text()='NYS45']")
	WebElement NYS45;
	@FindBy(xpath = "//*[text()='GroupApplication']")
	WebElement GRPAPPL;
	@FindBy(xpath = "//*[text()='PaymentAuthorizationForm']")
	WebElement PAF;

	// Payment ByPass
	@FindBy(xpath = "//*[@id='$PpyNavigation1615791358304$ppyElements$l1$ppyElements$l1']/li[4]")
	WebElement hfic_support;

	@FindBy(xpath = "//*[text()='Switch Application']")
	WebElement Switch_application;

	@FindBy(xpath = "//*[@id='RULE_KEY']/div[2]/div/i")
	WebElement SV;

	@FindBy(xpath = "//*[text()='My Favorites']")
	WebElement Favorites;

	@FindBy(xpath = "//*[@id='$PpyNavigation1615668990878$ppyElements$l7']//li[12]")
	WebElement intakecaselist;
	

	@FindBy(xpath = "//*[@id='$PpyNavigation1615668990878$ppyElements$l7']//li[11]")
	WebElement payment_bypass;

	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	WebElement Actions;
	@FindBy(xpath = "(//*[text()='Run'])[2]")
	WebElement Run;
	@FindBy(xpath = "(//*[@id='pui_colmenu'])[3]")
	WebElement filter_icon;
	@FindBy(xpath = "//*[text()='Filter']")
	WebElement filter;

	@FindBy(xpath = "//input[@id='f9b6bb99']")
	WebElement input_Search;

	@FindBy(xpath = "//button[text()='Apply']")
	WebElement Search_text;
	@FindBy(xpath = "//*[contains(text(),'ITK')]")
	WebElement ITK_NUM;
	public static String ITK;

	public void Payment_Bypass(String app_num) throws InterruptedException, AWTException {

		Thread.sleep(2500);
		// driver.get("https://pegaenbst.healthfirst.org/prweb/sso");
		image.click();
		Thread.sleep(2500);
		Actions act = new Actions(driver);
		act.moveToElement(Switch_application).perform();

		// Switch_application.click();
		Thread.sleep(1000);
		act.moveToElement(hfic_support).click().perform();
		Thread.sleep(1000);

		SV.click();
		Thread.sleep(1000);

		act.moveToElement(Favorites).perform();
		Thread.sleep(1000);
		
		act.moveToElement(payment_bypass).click().perform();
		Thread.sleep(3000);
		driver.switchTo().frame("PegaGadget0Ifr");
		
//		act.moveToElement(intakecaselist).click().perform();
//		Thread.sleep(3000);
//		for (int i = 0; i <= 8; i++) {
//			Robot rb = new Robot();
//			rb.keyPress(KeyEvent.VK_RIGHT);
//			rb.keyRelease(KeyEvent.VK_RIGHT);
//		}
//		Thread.sleep(5000);
//		driver.switchTo().frame("PegaGadget0Ifr");
//		Actions actions = new Actions(driver);
//		actions.moveToElement(Actions).click().perform();
//		Thread.sleep(3000);
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Run);
//		Thread.sleep(4000);
//		// Handlewindow
//		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back
//		for (String winHandle : driver.getWindowHandles()) {
//			if (driver.switchTo().window(winHandle).getTitle().equalsIgnoreCase("HFIC Intake CaseList")) {
//				driver.switchTo().window(winHandle);
//				driver.manage().window().maximize();
//				Thread.sleep(3000);
//				filter_icon.click();
//				Thread.sleep(3000);
//
//				filter.click();
//				Thread.sleep(3000);
//
//				input_Search.sendKeys(app_num);
//				Thread.sleep(3000);
//
//				Search_text.click();
//				Thread.sleep(3000);
//				ITK = ITK_NUM.getText();
//				driver.close();
//
//			} else {
//				System.out.println("Window not found");
//
//			}
//			driver.switchTo().window(currentWindow);
//			act.moveToElement(Favorites).perform();
//			Thread.sleep(1000);
//			act.moveToElement(payment_bypass).click().perform();
//			Thread.sleep(3000);
//			for (int i = 0; i <= 8; i++) {
//				Robot rb = new Robot();
//				rb.keyPress(KeyEvent.VK_RIGHT);
//				rb.keyRelease(KeyEvent.VK_RIGHT);
//			}
//
//		}

	}
}