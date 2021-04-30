package Pages.com;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Enrollment360 extends Baseclass {

	public Enrollment360(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath = "//a[contains(text(),'Enrollment 360')]")
	WebElement enroll360;
	@FindBy(id = "874fdaa4")
	WebElement grpid;
	@FindBy(id = "2b1160eb")
	WebElement grpname;
	@FindBy(id = "65e93d58")
	WebElement effdate;
	@FindBy(id = "d4000d46")
	WebElement taxid;
	@FindBy(name = "HFIC360SearchGroup_pyDisplayHarness_1148")
	WebElement Search;
	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[2]//td[1]//a[1]")
	WebElement Search_Result;
	@FindBy(xpath = "//*[contains(text(),'Group was not found, try again using different search combination')]")
	WebElement errormessage;
	@FindBy(xpath = "//*[text()='VIEW MHS GROUP DETAILS']")
	WebElement Homepage;
	@FindBy(xpath = "//*[contains(text(),'MEMBER 360 SEARCH')]")
	WebElement Member360;
	@FindBy(id = "cd1b1114")
	WebElement MHS_MEMBERID;
	@FindBy(id = "547f1e96")
	WebElement MHS_Effectivedate;
	@FindBy(name = "DisplayMember360Search_pyDisplayHarness_130")
	WebElement Member_Search;
	@FindBy(id = "c2ca143bUPID")
	WebElement other_mem_info;
	@FindBy(id = "386be106")
	WebElement fname;
	@FindBy(id = "69f331dd")
	WebElement lanme;
	@FindBy(id = "1b30b3f2")
	WebElement DOB;
	@FindBy(id = "748591fe")
	WebElement SSN;
	@FindBy(id = "3ae5aca3")
	WebElement Gender;
//	@FindBy(name = "Member360SearchResults_Member360Search.pxResults(1)_36")
//	WebElement member_Search_Result;
	@FindBy(xpath = "//*[contains(text(),'MEMBER DETAILS IN MHS')]")
	WebElement MEMBER_DETAILS_IN_MHS;

	@FindBy(xpath = "//*[contains(text(),'Member not found, try again using a different search combination')]")
	WebElement merror;
	@FindBy(name = "DisplayMember360Search_pyDisplayHarness_131")
	WebElement Rest_button;

	// healthpass

	@FindBy(id = "ce44cadbHealthPassPortal")
	WebElement hpassradiobutton;
	@FindBy(id = "5c8ec601")
	WebElement hp_grpid;
//	@FindBy(name = "HPGroup360SearchResults_HPGroup360Search.pxResults(1)_140")
//	WebElement HPsearchresut;

	public void Rest_button() throws InterruptedException {
		Rest_button.click();
		Thread.sleep(2000);
	}

	public void Gender() {
		Select s = new Select(Gender);
		s.selectByIndex(1);
	}

	public void merror1() {
		Assert.assertTrue(merror.isDisplayed(), "Testpass");
	}

	public void MEMBER_DETAILS_IN_MHS() {
		Assert.assertTrue(MEMBER_DETAILS_IN_MHS.isDisplayed(), "Testpass");
	}

//	public void member_Search_Result() throws InterruptedException {
//
//		member_Search_Result.click();
//		Thread.sleep(2500);
//	}

	public void MHS_MEMBERID(String mid) {
		MHS_MEMBERID.sendKeys(mid);
	}

	public void MHS_Effectivedate(String date) {
		MHS_Effectivedate.sendKeys(date);
	}

	public void Member_Search() throws InterruptedException {
		Member_Search.click();
		Thread.sleep(2500);
	}

	public void Member360_Search() throws InterruptedException {
		Member360.click();
		Thread.sleep(2000);
	}

	public void Member_other_info() throws InterruptedException {
		other_mem_info.click();
		Thread.sleep(2000);

	}

	public void SSN(String SSN1) {
		SSN.sendKeys(SSN1);
	}

	public void DOB(String DOB1) {
		DOB.sendKeys(DOB1);
	}

	public void lanme(String lanme1) {
		lanme.sendKeys(lanme1);
	}

	public void MEM_fname(String fname1) {
		fname.sendKeys(fname1);
	}

	public void enroll360() throws InterruptedException {
		Thread.sleep(1000);
		enroll360.click();
		Thread.sleep(1000);
	}

	public void groupnum(String grpnum) {
		grpid.sendKeys(grpnum);
	}

	public void Grpname(String GRP_name) {

		grpname.sendKeys(GRP_name);
	}

	public void grp_eff(String grp_eff) {

		effdate.sendKeys(grp_eff);
	}

	public void Grptaxid(String grp_taxid) {

		taxid.sendKeys(grp_taxid);
	}

	public void Search() throws InterruptedException {
		Search.click();
		Thread.sleep(3000);
	}
	@FindBy(xpath="//span[text()='ME 1032']") WebElement ME1032;
	public void ME1032() {
		ME1032.click();
	}
	@FindBy(xpath="//span[text()='ME 1033']") WebElement ME1033;
	public void ME1033() {
		ME1033.click();
	}@FindBy(xpath="//span[text()='ME 1034']") WebElement ME1034;
	public void ME1034() {
		ME1034.click();
	}@FindBy(xpath="//span[text()='Active Members']") WebElement Active_members;
	public void Active_members() {
		Active_members.click();
	}
	@FindBy(xpath="//span[text()='Enrollment Info']") WebElement Enrollment_Info;
	public void Enrollment_Info() {
		Enrollment_Info.click();
	}
	@FindBy(xpath="//span[text()='PCP Info']") WebElement PCP_Info;
	public void PCP_Info() {
		PCP_Info.click();
	}

	public void GRP_Verification() throws InterruptedException {

		if (errormessage.isDisplayed()) 
		{
			
			Assert.assertEquals(errormessage.getText(), "Group was not found, try again using different search combination");
			System.out.println(" Group Error message Validated Successfully");
		} 
		else 
		{

			Actions act = new Actions(driver);
			act.doubleClick(Search_Result).perform();
			Thread.sleep(4000);
		
				Thread.sleep(3000);
				Homepage.click();
				Thread.sleep(5000);
				ME1032();
				Thread.sleep(5000);
				ME1033();
				Thread.sleep(5000);
				ME1034();
				Thread.sleep(5000);
				Active_members();
				Thread.sleep(5000);
			}
		
	
	}	
	
	
	
	

	public void MEM_Verification() throws InterruptedException {

		 if (merror.isDisplayed())
		{
			SoftAssert asrt= new SoftAssert();
			asrt.assertEquals(merror.getText(), "Member not found, try again using a different search combination");
			System.out.println("Member Error message validated  succesfully");

		}  else if (Search_Result.isDisplayed())
		{

			Actions act = new Actions(driver);
			act.doubleClick(Search_Result).perform();
			Thread.sleep(3000);
				Enrollment_Info();
				Thread.sleep(3000);
				PCP_Info();
				
			}
		else {
			System.out.println("System error");
		}

		}
	

	
	@FindBy(xpath="//*[text()='Personal Info']") WebElement personal_info;
	

	public void Healthpass_Group_ID(String hp_grp) {

		hp_grpid.sendKeys(hp_grp);
	}

	public void hpassradiobutton() throws InterruptedException {
		hpassradiobutton.click();
		Thread.sleep(2000);

	}

//	public void HP_Searchresult() throws InterruptedException {
//		HPsearchresut.click();
//		Thread.sleep(1000);
//		Homepage.isDisplayed();
//
//	}

	public void Searchresult() throws InterruptedException {
		Search_Result.click();
		Thread.sleep(1000);

		Homepage.isDisplayed();

	}

	public void Homepage() throws InterruptedException {

		Homepage.click();
		Thread.sleep(2000);

	}
	public void HFIC_Group_Search_Method(String Gnum,String gname,String effdt,String tax) throws InterruptedException {
		enroll360();
		
		groupnum(Gnum);
		Grpname(gname);
		grp_eff(effdt);
		Grptaxid(tax);
		Search();
		GRP_Verification();
		
		
	}
public void Hp_Group_Search_Method(String Gnum,String hp_grp_id,String eff) throws InterruptedException {
	enroll360();
	hpassradiobutton();
	groupnum(Gnum);
	Healthpass_Group_ID(hp_grp_id);
	grp_eff(eff);
	Search();
	GRP_Verification();
		
	}
public void HFIC_HP_Member_Search_Method(String mid,String Effdt) throws InterruptedException {
	enroll360();
	Member360_Search();
	MHS_MEMBERID(mid);
	MHS_Effectivedate(Effdt);
	Member_Search();
	MEM_Verification();
	
}
public void HFIC_HP_Member_Detail_Search_Method(String fname ,String lname,String dob,String ssn) throws InterruptedException {
	enroll360();
	Member360_Search();
	Member_other_info();
	MEM_fname(fname);
	lanme(lname);
	DOB(dob);
	SSN(ssn);
	Member_Search();
	MEM_Verification();
	
}

}