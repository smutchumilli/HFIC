package HFIC.Pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Enrollment360 extends Baseclass {

	public Enrollment360(WebDriver driver) {
		this.driver = driver;
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
	@FindBy(name = "HFICGroup360SearchResults_Group360Search.pxResults(1)_151")
	WebElement hficsearchresut;
	@FindBy(xpath = "//*[contains(text(),'Group was not found, try again using different search combination')]")
	WebElement errormessage;
	@FindBy(xpath = "//*[contains(text(),'VIEW MHS GROUP DETAILS')]")
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
	@FindBy(name = "Member360SearchResults_Member360Search.pxResults(1)_36")
	WebElement member_Search_Result;
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
	@FindBy(name = "HPGroup360SearchResults_HPGroup360Search.pxResults(1)_140")
	WebElement HPsearchresut;

	public void Rest_button() throws InterruptedException {
		Rest_button.click();
		Thread.sleep(2000);
	}

	public void Gender() {
		Select s = new Select(Gender);
		s.selectByIndex(1);
	}

	public void merror() {
		Assert.assertTrue(merror.isDisplayed(), "Testpass");
	}

	public void MEMBER_DETAILS_IN_MHS() {
		Assert.assertTrue(MEMBER_DETAILS_IN_MHS.isDisplayed(), "Testpass");
	}

	public void member_Search_Result() throws InterruptedException {

		member_Search_Result.click();
		Thread.sleep(2500);
	}

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

	public void Enrollment360_HFIC_GRP_Member_Search() throws InterruptedException {
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
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(2000);
	}

	public void verification() {
		Assert.assertTrue(errormessage.isDisplayed(), "Error mesage is displayed as expected");
	}

	public void Healthpass_Group_ID(String hp_grp) {

		hp_grpid.sendKeys(hp_grp);
	}

	public void hpassradiobutton() throws InterruptedException {
		hpassradiobutton.click();
		Thread.sleep(2000);

	}

	public void HP_Searchresult() throws InterruptedException {
		HPsearchresut.click();
		Thread.sleep(1000);
		Homepage.isDisplayed();

	}

	public void HFIC_Searchresult() throws InterruptedException {
		hficsearchresut.click();
		Thread.sleep(1000);

		Homepage.isDisplayed();

	}

	public void Homepage() throws InterruptedException {

		Homepage.click();
		Thread.sleep(2000);

	}

}