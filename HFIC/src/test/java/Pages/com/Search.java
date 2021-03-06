package Pages.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
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

	public void Search_Link() throws InterruptedException {
		Search_Link.click();
		Thread.sleep(1500);
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

	public void HFIC_TASK_SEARCH() throws InterruptedException {
		HFIC_TASK_SEARCH.click();
		Thread.sleep(1000);
	}

	public void HEALTHPASS_TASK_SEARCH() throws InterruptedException {
		HEALTHPASS_TASK_SEARCH.click();
		Thread.sleep(1000);

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
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement Group_id_task_billing;
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[1]")
	WebElement Transaction_ID_Task_billing;

	@FindBy(xpath = "//input[@id='cfdc9e7d']//following::input[1]")
	WebElement Transaction_ID_Appl;
	@FindBy(xpath = "//input[@id='cfdc9e7d']//following::input[2]")
	WebElement Group_id_appli;

	public void Transaction_ID_Appl(String appl) throws InterruptedException {
		Transaction_ID_Appl.sendKeys(appl);
		// Thread.sleep(1800);

	}

	public void Group_id_appli(String appl) throws InterruptedException {
		Group_id_appli.sendKeys(appl);

	}

	

	

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[1]")
	WebElement Group_id_task1;

	public void Grp_id_task(String grp) throws InterruptedException {
		Group_id_task_billing.sendKeys(grp);
		Thread.sleep(1500);
	}

	@FindBy(id = "d4000d46")
	WebElement taxid;
	@FindBy(id = "5bb2922d")
	WebElement Group_OR_App_name;
	@FindBy(id = "1f1bdbe")
	WebElement MHS_Subscriber_id;
	@FindBy(xpath = "//select[@id='5a403f22']//following::input[1]")
	WebElement MHS_Subscriber_id_Task;

	public void MHS_Subscriber_id_Task(String subid) {
		MHS_Subscriber_id_Task.sendKeys(subid);
	}

	@FindBy(xpath = "//input[@id='1f1bdbe']//following::button[1]")
	WebElement HFIC_APP_Search;
	@FindBy(xpath = "//*[@id='PEGA_GRID_SKIN']//tr[2]//td[1]//span[1]")

	WebElement Search_Result;

	public void Search_Result() throws InterruptedException, IOException {
		Helper.actions_class(Search_Result);
		Helper.Handle_Window();
	}

	public void HFIC_APP_Search() throws InterruptedException, IOException {
		HFIC_APP_Search.click();
		Thread.sleep(1000);
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
	@FindBy(name = "TaskELogSearchCriteria_pyDisplayHarness_223")
	WebElement TaskSearch;

	public void Task_Search_Type(int i) throws InterruptedException {
		Select tastatus = new Select(Task_Search_Type);
		tastatus.selectByIndex(i);
		Thread.sleep(1500);

	}

	

	public void task_status(int i) throws InterruptedException {
		Select tastatus = new Select(task_status);
		tastatus.selectByIndex(i);
		Thread.sleep(1200);
	}

	public void elog_type(int i) throws InterruptedException {
		Select etype = new Select(elog_type);
		etype.selectByIndex(i);
		Thread.sleep(1200);

	}

	

	public void TaskSearch() throws InterruptedException, IOException {
		TaskSearch.click();

		Thread.sleep(1200);
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

	@FindBy(xpath = "//*[@id='$PHFICSearchTasks$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_APP_Search_table;
	@FindBy(xpath = "//*[@id='$PHFICElogSearchTasks$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_TASK_Search_table;
	@FindBy(xpath = "//*[@id='$PHFICGroupSearchTasks$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_TASK_Search_grp_table;
	@FindBy(xpath = "//*[@id='$PHFICExceptionSearchTasks$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_TASK_Search_HPPaymentexception_table;
	@FindBy(xpath = "//*[@id='$PHFICSearchCR$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_TASK_Search_CR_table;
	@FindBy(xpath = "//*[@id='$PHFICElogSearchTasksHP$ppxResults$l1']/td[2]/div/span")
	WebElement HP_TASK_GRP_table;
	@FindBy(xpath = "//*[@id='$PpgHPReconCaseSearch$ppxResults$l1']/td[2]/div/span")
	WebElement HP_Reconcases_table;
	@FindBy(xpath = "//*[@id='$PHFICElogSearchTasks$ppxResults$l1']/td[2]/div/span")
	WebElement HFIC_PREMPTIVE_TRACKING;

	public void validate7() throws InterruptedException, IOException, AWTException {

		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_PREMPTIVE_TRACKING.isDisplayed()) {
			Helper.actions_class(HFIC_PREMPTIVE_TRACKING);
			Thread.sleep(1000);
			Helper.Handle_Window();
			Thread.sleep(1000);

		}
	}

	public void validate() throws InterruptedException, IOException, AWTException {

		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_APP_Search_table.isDisplayed()) {
			Helper.actions_class(HFIC_APP_Search_table);
			Helper.Handle_Window();

		}
	}

	public void validate6() throws InterruptedException, IOException, AWTException {

		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_TASK_Search_CR_table.isDisplayed()) {
			Thread.sleep(800);

			Helper.actions_class(HFIC_TASK_Search_CR_table);
			Helper.Handle_Window();
			Thread.sleep(800);

		}
	}

	public void validate1() throws InterruptedException, IOException, AWTException {
		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_TASK_Search_grp_table.isDisplayed()) {
			Helper.actions_class(HFIC_TASK_Search_grp_table);
			Thread.sleep(800);

			Helper.Handle_Window();
			Thread.sleep(800);
		}
	}

	public void validate2() throws InterruptedException, IOException, AWTException {
		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_TASK_Search_table.isDisplayed()) {
			Helper.actions_class(HFIC_TASK_Search_table);
			Thread.sleep(800);

			Helper.Handle_Window();
			Thread.sleep(800);

		}

	}

	public void validate3() throws InterruptedException, IOException, AWTException {
		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else if (HFIC_TASK_Search_HPPaymentexception_table.isDisplayed()) {
			Helper.actions_class(HFIC_TASK_Search_HPPaymentexception_table);
			Thread.sleep(800);

			Helper.Handle_Window();
			Thread.sleep(800);
		}
	}

	// HP Table group
	public void validate4() throws InterruptedException, IOException, AWTException {
		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		}

		else if (HP_TASK_GRP_table.isDisplayed()) {
			Helper.actions_class(HP_TASK_GRP_table);
			Thread.sleep(1000);

			Helper.Handle_Window();
			Thread.sleep(1000);
		}
	}

	// HP Recon cases
	public void validate5() throws InterruptedException, IOException, AWTException {
		if (Helper.checkWebElementDisplayed(error_message)) {
			Assert.assertEquals(error_message.getText(), "No matching data found");
			System.out.println("Error message succssfully Validated");
		} else {
			Helper.actions_class(HP_Reconcases_table);
			Thread.sleep(1000);

			Helper.Handle_Window();
			Thread.sleep(1000);

		}

	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement mhs_subid;

	public void mhs_subid(String sub) {
		mhs_subid.sendKeys(sub);
	}

	// input[@id='65bee56e']//following::input[2]
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement Application_ID_Task;

	public void Application_ID_Task(String app) {
		Application_ID_Task.sendKeys(app);
	}

	@FindBy(xpath = "//button[@name='TaskELogSearchCriteriaHP_pyDisplayHarness_61']")
	WebElement CR_Search;

	public void CR_Search() throws InterruptedException, IOException {
		CR_Search.click();

		Thread.sleep(1000);
	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[3]")
	WebElement Appname_ID_Task;

	public void Appname_ID_Task(String appname) {
		Appname_ID_Task.sendKeys(appname);
	}

	@FindBy(xpath = "//input[@id='a7962bc5']")
	WebElement HealthPass_Subscriber_ID;

	public void HealthPass_Subscriber_ID(String id) {
		HealthPass_Subscriber_ID.sendKeys(id);
	}

	@FindBy(xpath = "//input[@id='a7962bc5']//preceding::input[1]")
	WebElement HealthPass_Group_ID;

	public void HealthPass_Group_ID(String id) {
		HealthPass_Group_ID.sendKeys(id);
	}

	@FindBy(xpath = "//input[@id='a7962bc5']//preceding::input[2]")
	WebElement Group_ID_Recon;

	public void Group_ID_Recon(String id1) {
		Group_ID_Recon.sendKeys(id1);
	}

	@FindBy(xpath = "//input[@id='a7962bc5']//preceding::input[3]")
	WebElement MHS_Subscriber_ID_recon;

	public void MHS_Subscriber_ID_recon(String id) throws InterruptedException {
		MHS_Subscriber_ID_recon.sendKeys(id);
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[1]")
	WebElement groupid;

	public void groupid(String id) {
		groupid.sendKeys(id);
	}

	@FindBy(xpath = "//input[@id='2b1160eb']")
	WebElement groupname;

	public void groupname(String id) {

		groupname.sendKeys(id);
	}

	@FindBy(xpath = "//*[@id='65bee56e']//following::input[3]")
	WebElement GRPID_CR;

	public void GRPID_CR(String grp) {
		GRPID_CR.sendKeys(grp);
	}

	@FindBy(xpath = "//*[@id='65bee56e']//following::input[1]")
	WebElement Created_On;

	public void Created_On(String grp) {
		Created_On.sendKeys(grp);
	}

	// Methods
	public void HFIC_App_Search(int i, int j, int k, String bid, String appid, String transid, String grp_id,
			String taxid, String appname, String subid) throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_APPLICATION_SEARCH();
		Requesttype(i);
		Applicationtyp(j);
		Application_status(k);
		Broker_id(bid);
		Application_id(appid);
		Transaction_ID_Appl(transid);
		Group_id_appli(grp_id);
		taxid(taxid);
		Group_OR_App_name(appname);
		MHS_Subscriber_id(subid);
		// Thread.sleep(800);
		HFIC_APP_Search();
		validate();

	}
//Billing Task Search Methods and Elements
	public void Task_CR_id_billing(String id) throws InterruptedException {
		Task_CR_id.sendKeys(id);
		Thread.sleep(1200);

	}
	public void Transaction_ID_Task_billing(String appl) throws InterruptedException {
		Transaction_ID_Task_billing.sendKeys(appl);

	}
	public void Group_id_task_billing(String grp) throws InterruptedException {
		Group_id_task_billing.click();
		Group_id_task_billing.sendKeys(grp);
		Thread.sleep(1000);
	}
	public void account_num_Billing(String accnum) throws InterruptedException {

		account_num.sendKeys(accnum);
	}
	
	public void HFIC_BTask_Search(String id, String transid, String grp_id, String num)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(1);
		Task_CR_id_billing(id);
		Transaction_ID_Task_billing(transid);
		Group_id_task_billing(grp_id);
		Group_id_task_billing(grp_id);
		account_num_Billing(num);
		Thread.sleep(1000);

		account_num_Billing(num);
		TaskSearch();
		validate2();
	}

	public void HFIC_MTask_Search(String task, String id, String app)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(2);
		Task_CR_id_billing(task);
		MHS_Subscriber_id_Task(id);
		Application(app);
		Thread.sleep(1000);

		Application(app);

		Thread.sleep(800);
		TaskSearch();
		validate2();
	}
//Group related method and elements
		@FindBy(xpath="//input[@id='65bee56e']//following::input[1]") WebElement Groupid_grp;
		@FindBy(xpath="//input[@id='65bee56e']//following::input[2]") WebElement appid_grp;
		@FindBy(xpath="//input[@id='65bee56e']//following::input[3]") WebElement apname_grp;
	public void Groupid_grp(String grpid) {
		Groupid_grp.sendKeys(grpid);
	}
	public void appid_grp(String appid) {
		appid_grp.sendKeys(appid);
	}
	public void apname_grp(String appname) {
		apname_grp.sendKeys(appname);
	}


	
	public void HFIC_GTask_Search(String grp, String appid, String appname)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(3);
		//Task_CR_id(task);
		Groupid_grp(grp);
		Thread.sleep(800);

		appid_grp(appid);
		Thread.sleep(800);
		appid_grp(appid);
		Thread.sleep(800);

		apname_grp(appname);
		Thread.sleep(800);
		apname_grp(appname);

		TaskSearch();
		validate1();
	}
//
	@FindBy(xpath="//input[@id='65bee56e']//following::input[1]") WebElement acountnum_paymexce;
	@FindBy(xpath="//input[@id='65bee56e']//following::input[2]") WebElement acountname_paymexce;
	public void acountnum_paymexce(String num) {
		acountnum_paymexce.sendKeys(num);
	}
	public void acountname_paymexce(String name) {
		acountname_paymexce.sendKeys(name);
	}

	//input[@id='65bee56e']//following::input[1]
	public void HFIC_Paymentexcetion_Task_Search(String task, String acnum,String accname)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(4);
		Task_CR_id_billing(task);
		acountnum_paymexce(acnum);
		acountname_paymexce(accname);

		// Thread.sleep(800);
		TaskSearch();
		validate3();
	}
//
	public void HFIC_COB_Task_Search(String task, String mhsmemid, String sub, String app)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(5);
		Task_CR_id_billing(task);
		MHS_Member_id(mhsmemid);
		mhs_subid(sub);
		Application(app);
		Thread.sleep(800);
		Application(app);

		TaskSearch();
		validate2();
	}
//
	public void HFIC_QLE_Tracking_Search(String task, String mhsmemid, String sub, String app)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(6);
		Task_CR_id_billing(task);
		MHS_Member_id(mhsmemid);
		mhs_subid(sub);
		Application(app);
		Thread.sleep(800);
		Application(app);

		TaskSearch();
		validate2();
	}
//
	@FindBy(xpath="//input[@id='65bee56e']//following::input[1]") WebElement grp_id_penrolltracking;
	 
	public void grp_id_penrolltracking(String grp) {
		grp_id_penrolltracking.sendKeys(grp);
		
	}
	public void HFIC_Presumptive_Search(String task, String grp, String appid, String appname)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(7);
		Task_CR_id_billing(task);
		

		grp_id_penrolltracking(grp);

		Thread.sleep(800);
		Application_ID_Task(appid);
		Thread.sleep(800);
		Application_ID_Task(appid);

		Appname_ID_Task(appname);
		Thread.sleep(800);
		Appname_ID_Task(appname);
		Thread.sleep(800);

		TaskSearch();
		validate7();
	}
//
	public void HFIC_ChangeRequest_Search(String task, String date, String grp)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(9);
		Task_CR_id_billing(task);
		Created_On(date);
		GRPID_CR(grp);
		Thread.sleep(800);
		TaskSearch();
		validate6();
	}
//
	public void HP_Reconciliation_Search(String task, String id ,String grpid,String id2, String id3)
			throws InterruptedException, IOException, AWTException {
		Search_Link();
		HEALTHPASS_TASK_SEARCH();
		Task_Search_Type(3);
		Task_CR_id_billing(task);
		MHS_Subscriber_ID_recon(id);
		Thread.sleep(800);
		Group_ID_Recon(grpid);
		Thread.sleep(800);
		Group_ID_Recon(grpid);

		HealthPass_Group_ID(id2);
		Thread.sleep(800);
		HealthPass_Group_ID(id2);

		Thread.sleep(800);
		HealthPass_Subscriber_ID(id3);
		Thread.sleep(1000);
		CR_Search();
		validate5();
	}

	public void HP_GroupTask_Search(String task, String grp,String gname) throws InterruptedException, IOException, AWTException {
		Search_Link();
		HEALTHPASS_TASK_SEARCH();
		Task_Search_Type(1);
		Task_CR_id_billing(task);
		groupid(grp);
		Thread.sleep(800);

		groupname(gname);
		Thread.sleep(800);

		groupname(gname);

		Thread.sleep(800);
		CR_Search();
		validate4();
	}

}