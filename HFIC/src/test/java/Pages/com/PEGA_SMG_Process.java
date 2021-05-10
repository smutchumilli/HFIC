package Pages.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.sun.glass.events.KeyEvent;

import COM.HFIC.Pages.Agreement;
import Utilities.com.Helper;
import Utilities.com.TestDataProvider;
import io.reactivex.rxjava3.functions.Action;

public class PEGA_SMG_Process extends Baseclass {
	//WebDriver driver;

	public PEGA_SMG_Process(WebDriver driver) {
		this.driver = driver;
	}

	public TestDataProvider data;
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
	public static String mydate;
	
	@FindBy(xpath = "//button[text()='Refresh']")
	WebElement Refresh;

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
	
	@FindBy(id = "24dbd519")WebElement inputsearch;
	@FindBy(name = "pzStudioHeaderTools_pyDisplayHarness_2")WebElement search;
	@FindBy(linkText = "HFICIntakeCaseList")WebElement HFICIntakeCaseList;
	@FindBy(xpath = "(//*[text()='Activity']//following::a[1])[2]")WebElement paymentbypass;

	
	
	// PEGA Login:

	
	public void PEGA_process() throws InterruptedException, AWTException, IOException {
		data= new TestDataProvider();
		Thread.sleep(2500);
		test.log( Status.INFO," Login to PEGA SSO for Bypass the payment");

		driver.get("https://pegaenbst.healthfirst.org/prweb/sso");
		Thread.sleep(2500);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		image.click();
		Thread.sleep(2500);
		Actions act = new Actions(driver);
		act.moveToElement(Switch_application).perform();

		// Switch_application.click();
		Thread.sleep(1700);
		act.moveToElement(hfic_support).click().perform();
		Thread.sleep(1700);
		
		inputsearch.sendKeys("HFICIntakeCaseList");
		Thread.sleep(1700);

		search.click();
		Thread.sleep(1700);

		HFICIntakeCaseList.click();
		Thread.sleep(1700);
		
		

		
//		SV.click();
//		Thread.sleep(1700);
//		act.moveToElement(Favorites).perform();
//		Thread.sleep(1700);
//
//		// HFIC Intake case list
//		act.moveToElement(intakecaselist).click().perform();
		Thread.sleep(3000);
		driver.switchTo().frame("PegaGadget0Ifr");
		Thread.sleep(5000);

		act.moveToElement(Actions).click().perform();
		Thread.sleep(1700);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Run);
		Thread.sleep(7000);
		// Handlewindow
		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back
		for (String winHandle : driver.getWindowHandles()) {
			if (driver.switchTo().window(winHandle).getTitle().equalsIgnoreCase("HFIC Intake CaseList")) {
				driver.switchTo().window(winHandle);
				Thread.sleep(4000);
				driver.manage().window().maximize();
				Thread.sleep(4000);
				filter_icon.click();
				Thread.sleep(2000);
				filter.click();
				Thread.sleep(14000);
				input_Search.sendKeys(Agreement.appnum);
				Thread.sleep(15000);
				Search_text.click();
				Thread.sleep(20000);
				test.log( Status.INFO,"ITK number captured for the Application");
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
				Thread.sleep(3000);
				ITK = ITK_NUM.getText();
				System.out.println(ITK);
				
				driver.close();
				Thread.sleep(3000);
				
				

			}
		}

		// PaymentBypass
		driver.switchTo().window(currentWindow);
		Thread.sleep(5000);

//		SV.click();
//		Thread.sleep(3000);
//		act.moveToElement(Favorites).perform();
//		Thread.sleep(3000);
//		act.moveToElement(payment_bypass).click().perform();
		inputsearch.clear();
		Thread.sleep(1700);
		test.log( Status.INFO," Navigate to HFICPaymentVerificationUtility");

		inputsearch.sendKeys("HFICPaymentVerificationUtility");
		Thread.sleep(1700);

		search.click();
		Thread.sleep(1700);

		paymentbypass.click();
		Thread.sleep(3000);
		driver.switchTo().frame("PegaGadget1Ifr");
		Thread.sleep(3000);
		act.moveToElement(Actions).click().perform();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Run);
		Thread.sleep(3000);
		String currentWindow_p = driver.getWindowHandle(); // will keep current window to switch back
		for (String winHandle_p : driver.getWindowHandles()) {
			if (driver.switchTo().window(winHandle_p).getTitle().equalsIgnoreCase("Run")) {
				driver.switchTo().window(winHandle_p);
				driver.manage().window().maximize();
				Thread.sleep(3000);

				driver.findElement(By.xpath("(//input[@id='pyValue'])[1]")).sendKeys(ITK);
				driver.findElement(By.xpath("(//input[@id='pyValue'])[5]")).clear();
				Thread.sleep(1700);
				driver.findElement(By.xpath("(//input[@id='pyValue'])[5]")).sendKeys(String.valueOf(Agreement.amount1));
				driver.findElement(By.xpath("//input[@id='gridCheckBox']")).click();
				Thread.sleep(1700);
				driver.findElement(By.xpath("(//input[@id='pyValue'])[6]")).clear();
				DateFormat format = new SimpleDateFormat("yyyyMMdd");
				Date dt = new Date();
				mydate = format.format(dt);
				driver.findElement(By.xpath("(//input[@id='pyValue'])[6]")).sendKeys(mydate);
				Thread.sleep(1700);
				driver.findElement(By.xpath("(//*[text()='Run'])[3]")).click();
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

				Thread.sleep(3000);
				// String currentWindow1 = driver.getWindowHandle(); // will keep current window
				// to switch back
				// for (String winHandle1 : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle_p).getTitle().equalsIgnoreCase("Status Page");
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

				Thread.sleep(3000);
				driver.close();
				Thread.sleep(5000);
				driver.switchTo().window(currentWindow_p);
				test.log( Status.INFO,"Payment bypass completed");


			}
		}
		
		Thread.sleep(5000);
		test.log( Status.INFO,"Login as HFIC Manager");

		
		driver.get("https://pegaenbst.healthfirst.org/prweb");

		userid.sendKeys(data.getstringdata("Pega", 0, 0));
		Password.sendKeys(data.getstringdata("Pega", 0, 1));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		Login_Button.click();
		Thread.sleep(8000);
		appid_filter.click();
		appid_search_text.sendKeys(Agreement.appnum);
		Thread.sleep(2500);
		Apply_button.click();
		Thread.sleep(5000);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(2000);

		checkbox.click();
		Thread.sleep(1700);
		Assignbtton.click();
		Thread.sleep(1700);
		test.log( Status.INFO,"Application assigned to HFIC super user");

		assign_id.sendKeys(data.getstringdata("Pega", 0, 2));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		Thread.sleep(1700);

		submit.click();
		Thread.sleep(1700);
		
		image.click();
		Thread.sleep(1700);

		logout.click();
		test.log( Status.INFO,"HFIC Manager logout");
		test.log( Status.INFO,"HFIC super user login to approve the application");

		userid.sendKeys(data.getstringdata("Pega", 1, 0));
		Password.sendKeys(data.getstringdata("Pega", 1, 1));
		Login_Button.click();
		appid_filter_Suser.click();
		appid_search_text_suser.sendKeys(Agreement.appnum);
		Apply_button.click();
		Thread.sleep(5000);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(2000);

		Results.click();

		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm);
		confirm.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"GROUP INFORMATION (Sec 1, 2) reviewed and successfully");

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm2);

		confirm.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"PG.2 GROUP ADMINISTRATION (Sec 3) reviewed and successfully");

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm3);

		confirm.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"PG.3 PLAN INFORMATION (Sec 4, 5, 6) reviewed and successfully");

		next.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm4);

		confirm.click();
		Thread.sleep(2000);

		next.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"PG.4 BROKER / GA INFORMATION (Sec 7) reviewed and successfully");

		
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
		test.log( Status.INFO,"Documents are reviewed and successfully");
	
		review_mship.click();
		Thread.sleep(6000);

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
		Thread.sleep(2000);

		confirm.click();

		Thread.sleep(2000);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();

		Thread.sleep(2000);

		mem_listing.click();

		Thread.sleep(2000);

		row3.click();
		Thread.sleep(1700);

		confirm.click();
		Thread.sleep(1700);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1700);

		mem_listing.click();
		Thread.sleep(2000);

		row4.click();
		Thread.sleep(1700);

		confirm.click();
		Thread.sleep(1700);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1700);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1700);

		Next1.click();
		Thread.sleep(2000);

		confirm.click();
		Thread.sleep(1700);

		mem_listing.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"Members are reviewed and successfully");


		Review_PAYMENT.click();
		Thread.sleep(2000);
		test.log( Status.INFO,"Payment details are reviewed and successfully");


		Final_Review.click();
		Thread.sleep(2000);

		confirm.click();
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(3000);

		SUbmit.click();
		Thread.sleep(3000);
		test.log( Status.INFO,"Application review completd and submitted");


		image.click();
		Thread.sleep(3500);

		Super_Logout.click();
		test.log( Status.INFO,"Logout button clicked");

		Thread.sleep(3500);

	}
}
