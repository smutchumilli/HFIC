package Pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChangeRequest_HSA extends Baseclass {

	public ChangeRequest_HSA(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(text(),'Change Requests')]")
	WebElement Chnagerequest_Link;
	@FindBy(xpath = "//button[contains(text(),'Create Change Request')]")
	WebElement Create_Change_Request;
	@FindBy(id = "5c58224c")
	WebElement CR_Type;

	// -----
	@FindBy(id = "13679d3a")
	WebElement Memberid;
	@FindBy(id = "fd28b87d")
	WebElement fname;
	@FindBy(id = "9091f465")
	WebElement lname;
	@FindBy(name = "HSASearch_pyWorkPage_36")
	WebElement search;
	@FindBy(xpath = "//*[@id='PEGA_GRID_CONTENT']//tr[2]//td[1]//a[1]")
	WebElement searchresult;
	@FindBy(name = "HSAMemberUpdateWrapper_pyWorkPage_4")
	WebElement edit;
	@FindBy(id = "538a86f9")
	WebElement mfname;
	@FindBy(id = "e3c53a8d")
	WebElement mlname;
	@FindBy(id = "42ced4b2")
	WebElement dob;
	@FindBy(id = "20a01c0f")
	WebElement ssn;

	@FindBy(id = "dcd479c2")
	WebElement addr1;
	@FindBy(id = "a84e83f8")
	WebElement city;
	@FindBy(id = "32ac8114")
	WebElement zip;
	@FindBy(id = "45dd2878")
	WebElement addr2;

	@FindBy(name = "HSAMemberUpdateWrapper_pyWorkPage_22")
	WebElement save;

	// Notes

	@FindBy(name = "HFICCaseHeader_pyWorkPage_16")
	WebElement Notes;
	@FindBy(xpath = "//*[contains(text(),'ADD A GENERAL NOTE?')]")
	WebElement General_Note;
	@FindBy(id = "2bc4e467")
	WebElement Add_Notes_Text;
	@FindBy(css = "div.pzbtn-mid")
	WebElement Notes_Add;
	@FindBy(xpath = "//*[contains(text(),'OK')]")
	WebElement OK;
	@FindBy(name = "HSAMemberUpdateWrapper_pyWorkPage_29")
	WebElement submit;

	// Group

	@FindBy(xpath = "//*[text()='Group Details']")
	WebElement grpdetails;
	@FindBy(id = "5933568a")
	WebElement grpid;
	@FindBy(id = "ee523990")
	WebElement gname;
	@FindBy(id = "1bd959e7")
	WebElement taxid;
	@FindBy(name = "HSASearchResults_HSAGroupSearch.pxResults(1)_67")
	WebElement GRP_Searchresults;

	@FindBy(id = "1f43152a")
	WebElement cnt_person;
	@FindBy(id = "0d78be5e")
	WebElement addrl1;
	@FindBy(id = "cc175e66")
	WebElement city1;
	@FindBy(id = "00d9df0d")
	WebElement zip1;
	@FindBy(id = "9471efe4")
	WebElement addrl2;
	@FindBy(id = "eb948332")
	WebElement pnum;
	@FindBy(id = "4849689b")
	WebElement email;

	public void Chnagerequest_Link() throws InterruptedException {
		Chnagerequest_Link.click();
		Thread.sleep(2000);

	}

	public void Create_Change_Request() throws InterruptedException {
		Thread.sleep(2000);
		Create_Change_Request.click();
		Select s = new Select(CR_Type);
		s.selectByIndex(8);
	}

	public void search() {
		search.click();
	}

	public void searchresult() {
		searchresult.click();
	}

	public void edit() {
		edit.click();
	}

	public void Notes(String gtext) throws InterruptedException {
		Notes.click();
		Thread.sleep(1000);
		General_Note.click();
		Thread.sleep(1000);
		Add_Notes_Text.sendKeys(gtext);
		Thread.sleep(1000);
		Notes_Add.click();
		Thread.sleep(1000);
		OK.click();
		Thread.sleep(2000);
	}

	public void save() throws InterruptedException {
		save.click();
		Thread.sleep(3000);
	}

	public void submit() throws InterruptedException {
		
		submit.click();
		Thread.sleep(1000);

	}

	public void Memberid(String mid) {

		Memberid.sendKeys(mid);

	}

	public void HSA_MemberDetails(String dob1, String ssn1, String addrs1, String city1, String zip1, String aAddrs)
			throws InterruptedException {
		Thread.sleep(2000);
		// fname.sendKeys(fnam);
		// lname.sendKeys(lnam);
		// mfname.clear();
		// mlname.clear();
//		dob.clear();
//		ssn.clear();
//		addr1.clear();
//		city.clear();
//		zip.clear();
//		addr2.clear();
		// mfname.sendKeys(fna);
		// mlname.sendKeys(lna);
		dob.sendKeys(dob1);
		ssn.sendKeys(ssn1);
		addr1.sendKeys(addrs1);
		city.sendKeys(city1);
		zip.sendKeys(zip1);
		addr2.sendKeys(aAddrs);
	}

	public void grpdetails() {
		grpdetails.click();
	}

	public void GRP_Searchresults() {
		GRP_Searchresults.click();
	}

	public void HSA_GrpSearch(String grp_id)  {
		grpid.sendKeys(grp_id);
//		gname.sendKeys(grp_name);
//		taxid.sendKeys(Grp_tax);
	}

	public void HSA_Grpdetails(String c_person, String G_addr1, String G_city1, String grp_zip, String grp_Addr2,
			String grp_pnum, String grp_email) throws InterruptedException {
		Thread.sleep(5000);

//		cnt_person.clear();
//		addrl1.clear();
//		city1.clear();
//		zip1.clear();
//		addrl2.clear();
//		pnum.clear();
//		email.clear();

		cnt_person.sendKeys(c_person);
		addrl1.sendKeys(G_addr1);
		city1.sendKeys(G_city1);
		zip1.sendKeys(grp_zip);
		addrl2.sendKeys(grp_Addr2);
		pnum.sendKeys(grp_pnum);
		email.sendKeys(grp_email);
	}

	public void HSA_Member_Update(String mem, String dob1, String ssn1, String addrs1, String city1, String zip1,
			String aAddrs, String text) throws InterruptedException {
		Chnagerequest_Link();
		Create_Change_Request();
		Memberid(mem);
		search();
		searchresult();
		edit();
		HSA_MemberDetails(dob1, ssn1, addrs1, city1, zip1, aAddrs);
		save();
		Notes(text);
	

	}

	public void HSA_Group_Update(String grp_id,  String c_person, String G_addr1,
			String G_city1, String grp_zip, String grp_Addr2, String grp_pnum, String grp_email, String txt)
			throws InterruptedException {
		Chnagerequest_Link();
		Create_Change_Request();
		grpdetails();
		HSA_GrpSearch(grp_id);
		search();
		searchresult();
		edit();
		HSA_Grpdetails(c_person, G_addr1, G_city1, grp_zip, grp_Addr2, grp_pnum, grp_email);
		save();
		Notes(txt);
	

	}

}
