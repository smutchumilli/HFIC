package HFIC.Pages.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utilities.com.Helper;

public class Search extends Baseclass {

	public Search(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement Search_Link;

	public void Search_Link() {
		Search_Link.click();
	}

	@FindBy(xpath = "//*[contains(text(),'HFIC APPLICATION SEARCH')]")
	WebElement HFIC_APPLICATION_SEARCH;
	@FindBy(xpath = "//*[contains(text(),'HFIC TASK SEARCH')]")
	WebElement HFIC_TASK_SEARCH;
	@FindBy(xpath = "//*[contains(text(),'HEALTHPASS TASK SEARCH')]")
	WebElement HEALTHPASS_TASK_SEARCH;

	public void HFIC_APPLICATION_SEARCH() {
		HFIC_APPLICATION_SEARCH.click();
	}

	public void HFIC_TASK_SEARCH() {
		HFIC_TASK_SEARCH.click();
	}

	public void HEALTHPASS_TASK_SEARCH() {
		HEALTHPASS_TASK_SEARCH.click();
	}

	// HFIC Application Search
	@FindBy(xpath = "//*[contains(text(),'No matching data found')]")
	WebElement error_message;

	@FindBy(id = "60caa79c")
	WebElement Requesttype;
	@FindBy(id = "50d8717b")
	WebElement Applicationtyp;
	@FindBy(id = "21800331")
	WebElement Application_status;
	@FindBy(id = "6839a3e1")
	WebElement Broker_id;
	@FindBy(id = "cfdc9e7d")
	WebElement Application_id;
	@FindBy(xpath = "//select[@id='dc3086c6']//following::input[1]")
	WebElement Transaction_id;
	@FindBy(xpath = "//select[@id='dc3086c6']//following::input[2]")
	WebElement HFIC_HP_Group_id;
	@FindBy(id = "d4000d46")
	WebElement taxid;
	@FindBy(id = "5bb2922d")
	WebElement Group_OR_App_name;
	@FindBy(xpath= "//*[@id='5a403f22']//following::input[1]")
	WebElement MHS_Subscriber_id;
	@FindBy(name = "HFICSearchCriteria_pyDisplayHarness_63")
	WebElement HFIC_APP_Search;
	@FindBy(xpath = "//*[@id='d9073ef5']//following::button[1]")

	WebElement Search_Result;

	public void Search_Result1() throws InterruptedException, IOException {
		Helper.actions_class(Search_Result);
		Helper.Handle_Window();
		////Thread.sleep(1000);
	}

	public void HFIC_APP_Search() throws InterruptedException {
		HFIC_APP_Search.click();
		Thread.sleep(3000);

	}

	public void MHS_Subscriber_id(String MHSID) {
		MHS_Subscriber_id.sendKeys(MHSID);
	}

	public void Group_OR_App_name(String GANAME) {
		Group_OR_App_name.sendKeys(GANAME);
	}

	public void taxid(String TAX) {
		taxid.sendKeys(TAX);
	}

	public void HFIC_HP_Group_id(String GRPid) throws InterruptedException {
		//Thread.sleep(3000);
		HFIC_HP_Group_id.sendKeys(GRPid);
	}

	public void Transaction_id(String Tid) {
		Transaction_id.sendKeys(Tid);
	}
 
	public void Application_id(String Aid) {
		Application_id.sendKeys(Aid);
	}

	public void Broker_id(String Bid) {
		Broker_id.sendKeys(Bid);
	}

	public void Requesttype(int i) {
		Select reqtype = new Select(Requesttype);
		reqtype.selectByIndex(i);
	}

	public void Applicationtyp(int i) {
		Select apptype = new Select(Applicationtyp);
		apptype.selectByIndex(i);
	}

	public void Application_status(int i) {
		Select appstatus = new Select(Application_status);
		appstatus.selectByIndex(i);
	}

	// HFIC Task Search

	@FindBy(id = "64142ad6")
	WebElement Task_Search_Type;
	@FindBy(id = "65bee56e")
	WebElement Task_CR_id;
	@FindBy(id = "5a403f22")
	WebElement task_status;
	@FindBy(id = "dc3086c6")
	WebElement elog_type;
	@FindBy(id = "d9073ef5")
	WebElement account_num;
	@FindBy(xpath = "//*[@id='d9073ef5']//following::button[1]")
	WebElement TaskSearch;

	public void Task_Search_Type(int i) throws InterruptedException {
		Select tastatus = new Select(Task_Search_Type);
		tastatus.selectByIndex(i);
		Thread.sleep(2000);

	}

	public void Task_CR_id(String id) throws InterruptedException {
		Task_CR_id.sendKeys(id);
		Thread.sleep(1000);

	}

	public void task_status(int i) throws InterruptedException {
		Select tastatus = new Select(task_status);
		tastatus.selectByIndex(i);
		Thread.sleep(1000);
	}

	public void elog_type(int i) throws InterruptedException {
		Select etype = new Select(elog_type);
		etype.selectByIndex(i);
		Thread.sleep(1000);

	}

	public void account_num(String accnum) {
		account_num.sendKeys(accnum);
	}

	public void TaskSearch() throws InterruptedException {
		TaskSearch.click();
		Thread.sleep(3000);
	}

	// Membership
	@FindBy(id = "cc107979")
	WebElement Application;
	@FindBy(id = "853f4173")
	WebElement req_type;

	public void req_type(int i) {
		Select Reqtype = new Select(req_type);
		Reqtype.selectByIndex(i);
	}

	public void Application(String appname) {
		Application.sendKeys(appname);
	}

	// group
	@FindBy(id = "5bb2922d")
	WebElement application_name;
	@FindBy(id = "a42dbd22")
	WebElement Account_name;

	public void application_name(String appname) {
		application_name.sendKeys(appname);
	}

	public void Account_name(String accname) {
		Account_name.sendKeys(accname);
	}

	@FindBy(id = "cd1b1114")
	WebElement MHS_Member_id;
	@FindBy(id = "300fb943")
	WebElement Assigned_To;
	@FindBy(id = "fd466866")
	WebElement Change_Type;

	public void Change_Type(int i) {
		Select ctype = new Select(Change_Type);
		ctype.deselectByIndex(i);
	}

	public void Assigned_To(String assign) {
		Assigned_To.sendKeys(assign);
	}

	public void MHS_Member_id(String mid) {
		MHS_Member_id.sendKeys(mid);
	}

	// Healthpass task Search
	@FindBy(id = "2b1160eb")
	WebElement HPGroup_name;

	public void HP_Group_name(String Gname) {
		HPGroup_name.sendKeys(Gname);
	}
	public void validate() throws InterruptedException, IOException {
		
		if (error_message.isDisplayed()){
			//SoftAssert asrt= new SoftAssert();
			Assert.assertEquals(error_message.getText(), "No matching data found");
		
		}
		else if (Search_Result.isDisplayed()){
			Helper.actions_class(Search_Result);
			Helper.Handle_Window();
		}
	}

	// Methods
	public void HFIC_App_Search(int i, int j, int k, String bid, String appid, String transid, String grp_id,
			String taxid, String appname, String subid) throws InterruptedException, IOException {
		Search_Link();
		HFIC_APPLICATION_SEARCH();
		Requesttype(i);
		Applicationtyp(j);
		Application_status(k);
		Broker_id(bid);
		Application_id(appid);
		Transaction_id(transid);
		HFIC_HP_Group_id(grp_id);
		taxid(taxid);
		Group_OR_App_name(appname);
		MHS_Subscriber_id(subid);
		HFIC_APP_Search();
		//validate();
		}
	
	public void HFIC_Task_Search(String id,String transid,  String grp_id, String num) throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(1);
		Task_CR_id(id);	
		task_status(4);
		elog_type(1);
		Transaction_id(transid);
		HFIC_HP_Group_id(grp_id);
		account_num(num);
		Thread.sleep(1000);
		TaskSearch();
		//validate();
}
	public void HFIC_MTask_Search(String task,String id,String app) throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(2);
		Task_CR_id(task);	
		MHS_Subscriber_id(id);
		Application(app);
		Thread.sleep(1000);
		TaskSearch();
		//validate();
}
}