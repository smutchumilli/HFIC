package HFIC.Pages.com;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Search extends Baseclass {

	public Search(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement Search_icon;
	@FindBy(id = "60caa79c")
	WebElement Request_type;
	@FindBy(id = "50d8717b")
	WebElement Application_type;
	@FindBy(id = "21800331")
	WebElement Application_status;
	@FindBy(id = "6839a3e1")
	WebElement Broker;
	@FindBy(id = "cfdc9e7d")
	WebElement Application_id;
	@FindBy(id = "d1600a6")
	WebElement Transaction_id;
	@FindBy(id = "874fdaa4")
	WebElement grpid;
	@FindBy(id = "d4000d46")
	WebElement taxid;
	@FindBy(id = "5bb2922d")
	WebElement grpname;
	@FindBy(id = "1f1bdbe")
	WebElement Subscriber;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[1]")
	WebElement CEFrom;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[2]")
	WebElement CETo;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[3]")
	WebElement ARfrom;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[4]")
	WebElement ARto;
	@FindBy(name = "HFICSearchCriteria_pyDisplayHarness_63")
	WebElement search;
	//
	@FindBy(xpath = "//tr[@id='$PHFICSearchTasks$ppxResults$l1']")
	WebElement search_result;

	// date select
	@FindBy(xpath = "//*[@id='controlCalBody']//tr[1]//td[1]")
	WebElement CEDtselect;
	@FindBy(xpath = "//*[@id='controlCalBody']//tr[2]//td[4]")
	WebElement ARDTselect;
	@FindBy(css = "input.spinner-input")
	WebElement DTFromMonth;
	@FindBy(xpath = "//*[@id='yearSpinner']")
	WebElement DTFromYear;

	@FindBy(xpath = "//*[contains(text(),'HFIC TASK SEARCH')]")
	WebElement HFIC_TaskSearch_TAB;
	@FindBy(xpath = "//*[contains(text(),'HFIC TASK SEARCH')]//following::Select[4]")
	WebElement Task_Search_Type;
	@FindBy(name = "TaskELogSearchCriteria_pyDisplayHarness_223")
	WebElement Task_Search;

	@FindBy(id = "65bee56e")
	WebElement billing_task_id;

	@FindBy(name = "$PpyDisplayHarness$pTransactionID")
	WebElement billing_Transcation_id;
	@FindBy(id = "874fdaa4")
	WebElement billing_Group_id;

	@FindBy(id = "d9073ef5")
	WebElement billing_Account_num;
	@FindBy(xpath = "//*[@id='gridLayoutTable']//tr[2]//td[1]")
	WebElement Elog_Search_Result;
	
	@FindBy(id = "5a403f22")
	WebElement billing_task_status;
	@FindBy(id = "dc3086c6")
	WebElement billing_elog_type;
	
	
	public void billing_task_status(int s) {
		
		Select bts = new Select(billing_task_status);
		bts.selectByIndex(s);
	}
public void billing_elog_type(int s) {
		
		Select bts1 = new Select(billing_elog_type);
		bts1.selectByIndex(s);
	}
	
	
	
	
	
	
	
	
	public void Elog_Search_Result() throws InterruptedException {
Actions act= new Actions(driver);
act.doubleClick(Elog_Search_Result).perform();
Thread.sleep(3000);

	}

	public void billing_Account_num1(String billing_acc_num) {
		billing_Account_num.sendKeys(billing_acc_num);
	}

	public void billing_Group_id1(String grp_id) {
		billing_Group_id.sendKeys(grp_id);
	}

	public void billing_Transcation_id1(String Transcation) {
		billing_Transcation_id.sendKeys(Transcation);
	}
	public void billing_task_id1(String task_id) {
		billing_task_id.sendKeys(task_id);
	}

	public void HFIC_TaskSearch_TAB() throws InterruptedException {
		HFIC_TaskSearch_TAB.click();

	}

	public void Task_Search_Type(int i) throws InterruptedException {
		Select Tasksearch = new Select(Task_Search_Type);
		Tasksearch.selectByIndex(i);
		
		Thread.sleep(1000);
	
	}

	public void Task_Search() throws InterruptedException {
		Task_Search.click();
		Thread.sleep(3000);
	}

	public void Request_type(int i) {
		Select ReqType = new Select(Request_type);
		ReqType.selectByIndex(i);

	}

	public void Application_type(int i) {
		Select APPTYPE = new Select(Application_type);
		APPTYPE.selectByIndex(i);

	}

	public void Application_status(int i) {
		Select APPstatus = new Select(Application_status);
		APPstatus.selectByIndex(i);

	}

	public void Broker(String broker) {
		Broker.sendKeys(broker);
	}

	public void Application_id(String appid) {
		Application_id.sendKeys(appid);
	}

	public void Transaction_id(String trid) {
		Transaction_id.sendKeys(trid);
	}

	public void grpid(String grp_id) {
		grpid.sendKeys(grp_id);

	}

	public void taxid(String tax_id) {
		taxid.sendKeys(tax_id);

	}

	public void grpname(String grp_name) {
		grpname.sendKeys(grp_name);

	}

	public void Subscriber(String subs) throws InterruptedException {
		Subscriber.sendKeys(subs);

	}

	public void CEFrom() throws InterruptedException, AWTException {
		CEFrom.click();
		DTFromMonth.sendKeys("D");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		CEDtselect.click();
		Thread.sleep(2000);

	}

	public void CETo() throws InterruptedException, AWTException {
		CETo.click();
		DTFromMonth.sendKeys("D");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		CEDtselect.click();
		Thread.sleep(2000);

	}

	public void ARfrom() throws AWTException, InterruptedException {
		ARfrom.click();
		DTFromMonth.sendKeys("A");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(5000);
		ARDTselect.click();
		Thread.sleep(2000);

	}

	public void ARto() throws AWTException, InterruptedException {
		ARto.click();
		DTFromMonth.sendKeys("D");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(3000);

		ARDTselect.click();
		Thread.sleep(2000);

	}

	public void search_Button() throws InterruptedException {
		search.click();
		Thread.sleep(2000);

	}

	public void search_result() throws InterruptedException {
		Actions act = new Actions(driver);
		act.doubleClick(search_result).perform();
		Thread.sleep(4000);
	}

	public void search_icon() {
		Search_icon.click();

	}

}
