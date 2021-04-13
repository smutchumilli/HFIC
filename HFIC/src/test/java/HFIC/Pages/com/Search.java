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
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[1]")
	WebElement Group_id_task;
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement Transaction_ID_Task;

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

	public void Group_id_task(String appl) throws InterruptedException {
		Group_id_task.sendKeys(appl);
	}

	public void Transaction_ID_Task(String appl) throws InterruptedException {
		Transaction_ID_Task.sendKeys(appl);

	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[1]")
	WebElement Group_id_task1;

	public void Grp_id_task(String grp) {
		Group_id_task.sendKeys(grp);
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
		Thread.sleep(1200);
	}

	public void HFIC_APP_Search() throws InterruptedException, IOException {
		HFIC_APP_Search.click();
//		if (error_message.isDisplayed()==true)
//		{
//			Assert.assertEquals(error_message.getText(), "No matching data found");
//		}  else	if (Search_Result.isDisplayed()==true)
//		{
//			Search_Result();
//		} 						
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

	public void Task_CR_id(String id) throws InterruptedException {
		Task_CR_id.sendKeys(id);
		Thread.sleep(1200);

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

	public void account_num(String accnum) throws InterruptedException {
		Thread.sleep(700);

		account_num.sendKeys(accnum);
	}

	public void TaskSearch() throws InterruptedException, IOException {
		TaskSearch.click();
//		 boolean i=Search_Result.isDisplayed();
//			if (i=true)
//		{
//			Search_Result();
//		} 		
//			
//		{
//			Assert.assertEquals(error_message.getText(), "No matching data found");
//		} 
//			
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

	public void validate() throws InterruptedException, IOException {
		SoftAssert asrt= new SoftAssert();

		if (error_message.isDisplayed()==true) {
			System.out.println( "Error message is displaying as expected");

		} else {
				Search_Result();	
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
		Transaction_ID_Appl(transid);
		Group_id_appli(grp_id);
		taxid(taxid);
		Group_OR_App_name(appname);
		MHS_Subscriber_id(subid);
		Thread.sleep(800);
		HFIC_APP_Search();
		validate();
		
	}
	public void HFIC_Task_Search(String id, String transid, String grp_id, String num)
			throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(1);
		Task_CR_id(id);
		task_status(4);
		elog_type(1);
		Transaction_ID_Task(transid);
		Group_id_task(grp_id);
		account_num(num);
		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	public void HFIC_MTask_Search(String task, String id, String app) throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(2);
		Task_CR_id(task);
		MHS_Subscriber_id_Task(id);
		Application(app);
		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	// input[@id='65bee56e']//following::input[2]
	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement Application_ID_Task;

	public void Application_ID_Task(String app) {
		Application_ID_Task.sendKeys(app);
	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[3]")
	WebElement Appname_ID_Task;

	public void Appname_ID_Task(String appname) {
		Appname_ID_Task.sendKeys(appname);
	}

	public void HFIC_GTask_Search(String grp, String appid, String appname) throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(3);
		// Task_CR_id(task);
		Grp_id_task(grp);
		Application_ID_Task(appid);
		Appname_ID_Task(appname);
		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	public void HFIC_Paymentexcetion_Task_Search(String task, String acnum) throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(4);
		Task_CR_id(task);
		account_num(acnum);
		// Account_name(accname);

		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	@FindBy(xpath = "//input[@id='65bee56e']//following::input[2]")
	WebElement mhs_subid;

	public void mhs_subid(String sub) {
		mhs_subid.sendKeys(sub);
	}

	public void HFIC_COB_Task_Search(String task, String mhsmemid, String sub, String app)
			throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(5);
		Task_CR_id(task);
		MHS_Member_id(mhsmemid);
		mhs_subid(sub);
		Application(app);
		Thread.sleep(800);
		TaskSearch();
	//	validate();
	}

	public void HFIC_QLE_Tracking_Search(String task, String mhsmemid, String sub, String app)
			throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(6);
		Task_CR_id(task);
		MHS_Member_id(mhsmemid);
		mhs_subid(sub);
		Application(app);
		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	public void HFIC_Presumptive_Search(String task, String grp, String appid, String appname)
			throws InterruptedException, IOException {
		Search_Link();
		HFIC_TASK_SEARCH();
		Task_Search_Type(7);
		Task_CR_id(task);
		Grp_id_task(grp);
		Application_ID_Task(appid);
		Appname_ID_Task(appname);
		Thread.sleep(800);
		TaskSearch();
		//validate();
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

	public void HFIC_ChangeRequest_Search(String task, String date, String grp)
			throws InterruptedException, IOException {
		Search_Link();
		HEALTHPASS_TASK_SEARCH();
		Task_Search_Type(9);
		Task_CR_id(task);
		Created_On(date);
		GRPID_CR(grp);
		Thread.sleep(800);
		TaskSearch();
		//validate();
	}

	@FindBy(xpath = "//button[@name='TaskELogSearchCriteriaHP_pyDisplayHarness_61']")
	WebElement CR_Search;

	public void CR_Search() throws InterruptedException, IOException {
		CR_Search.click();
//	 boolean i=Search_Result.isDisplayed();
//		if (i=true)
//	{
//		Search_Result();
//	} 		
//		
//	{
//		Assert.assertEquals(error_message.getText(), "No matching data found");
//	} 
//		
		Thread.sleep(1200);
	}
	public void HP_Reconciliation_Search(String task, String id, String id1, String id2, String id3)
			throws InterruptedException, IOException {
		Search_Link();
		HEALTHPASS_TASK_SEARCH();
		Task_Search_Type(3);
		Task_CR_id(task);
		MHS_Subscriber_ID_recon(id);
		Group_ID_Recon(id1);
		HealthPass_Group_ID(id2);
		HealthPass_Subscriber_ID(id3);

		Thread.sleep(800);
		CR_Search();
		//validate();
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

	public void Group_ID_Recon(String id) {
		Group_ID_Recon.sendKeys(id);
	}

	@FindBy(xpath = "//input[@id='a7962bc5']//preceding::input[3]")
	WebElement MHS_Subscriber_ID_recon;

	public void MHS_Subscriber_ID_recon(String id) {
		MHS_Subscriber_ID_recon.sendKeys(id);
	}

	@FindBy(xpath = "//*[@id='headerlabel3384']//preceding::input[2]")
	WebElement groupid;

	public void groupid(String id) {
		groupid.sendKeys(id);
	}

	@FindBy(xpath = "//*[@id='headerlabel3384']//preceding::input[1]")
	WebElement groupname;

	public void groupname(String id) {
		groupname.sendKeys(id);
	}

	public void HP_GroupTask_Search(String task, String grp, String name) throws InterruptedException, IOException {
		Search_Link();
		HEALTHPASS_TASK_SEARCH();
		Task_Search_Type(1);
		Task_CR_id(task);
		groupid(grp);
		groupname(name);
		Thread.sleep(800);
		CR_Search();
		//validate();
	}

}