package HFIC.Pages.com;

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
	
	//-----
	@FindBy(id = "13679d3a")
	WebElement Memberid;
	@FindBy(id = "fd28b87d")
	WebElement fname;
	@FindBy(id = "9091f465")
	WebElement lname;
	@FindBy(name = "HSASearch_pyWorkPage_36")
	WebElement search;
	@FindBy(name = "HSASearchResults_HSAMemberSearch.pxResults(1)_168")
	WebElement searchresult;
	@FindBy(name="HSAMemberUpdateWrapper_pyWorkPage_4")
	WebElement edit;
	@FindBy(id="538a86f9")
	WebElement mfname;
	@FindBy(id="e3c53a8d")
	WebElement mlname;
	@FindBy(id="42ced4b2")
	WebElement dob;
	@FindBy(id="20a01c0f")
	WebElement ssn;
	
	@FindBy(id="dcd479c2")
	WebElement addr1;
	@FindBy(id="a84e83f8")
	WebElement city;
	@FindBy(id="32ac8114")
	WebElement zip;
	@FindBy(id="45dd2878")
	WebElement addr2;
	
	@FindBy(name="HSAMemberUpdateWrapper_pyWorkPage_22")
	WebElement save;
	
	//Notes
	
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
	
	//Group
	
	@FindBy(xpath = "//*[text()='Group Details']")
	WebElement grpdetails;
	@FindBy(id = "5933568a")
	WebElement grpid;
	@FindBy(id = "ee523990")
	WebElement gname;
	@FindBy(id = "1bd959e7")
	WebElement taxid;
	@FindBy(name="HSASearchResults_HSAGroupSearch.pxResults(1)_67")
	WebElement GRP_Searchresults;
	
	@FindBy(id="1f43152a")
	WebElement cnt_person;
	@FindBy(id="0d78be5e")
	WebElement addrl1;
	@FindBy(id="cc175e66")
	WebElement city1 ;
	@FindBy(id="00d9df0d")
	WebElement zip1;
	@FindBy(id="9471efe4")
	WebElement addrl2;
	@FindBy(id="eb948332")
	WebElement pnum;
	@FindBy(id="4849689b")
	WebElement email;	
	
	public void HSA_MemberUpdate(String mid,String fnam,
			String lnam,String dob1,String ssn1,String addrs1,String city1,
			String zip1,String aAddrs,String gtext) throws InterruptedException {
		
		Chnagerequest_Link.click();
		Create_Change_Request.click();
		Select s= new Select(CR_Type);
		s.selectByIndex(8);
			
		Memberid.sendKeys(mid);
//		fname.sendKeys(fnam);
//		lname.sendKeys(lnam);
		search.click();
		searchresult.click();
		edit.click();
		
//		mfname.clear();
//		mlname.clear();
		dob.clear();
		ssn.clear();
		addr1.clear();
		city.clear();
		zip.clear();
		addr2.clear();
		
//		mfname.sendKeys(fna);
//		mlname.sendKeys(lna);
		dob.sendKeys(dob1);
		ssn.sendKeys(ssn1);
		addr1.sendKeys(addrs1);
		city.sendKeys(city1);
		zip.sendKeys(zip1);
		addr2.sendKeys(aAddrs);
		save.click();
		Thread.sleep(3000);
		Notes.click();
		Thread.sleep(2800);
		General_Note.click();
		Add_Notes_Text.sendKeys(gtext);
		Thread.sleep(2000);
		Notes_Add.click();
		Thread.sleep(2000);
		OK.click();
		Thread.sleep(2000);		
		submit.click();

		
	}
	
	public void HSA_GrpUpdate(String grp_id,String grp_name,String Grp_tax,
			String c_person,String G_addr1,String G_city1,String grp_zip,
			String grp_Addr2,String grp_pnum,String grp_email,String GRP_Notes) throws InterruptedException
	{	
		Thread.sleep(7000);
		Chnagerequest_Link.click();
		Thread.sleep(2000);
		Create_Change_Request.click();
		Select s= new Select(CR_Type);
		s.selectByIndex(8);
		grpdetails.click(); 
		grpid.sendKeys(grp_id);
//		gname.sendKeys(grp_name);
//		taxid.sendKeys(Grp_tax);
		search.click();
		GRP_Searchresults.click();
		edit.click();
		Thread.sleep(2000);
		cnt_person.clear();
		addrl1.clear();
		city1.clear();
		zip1.clear();
		addrl2.clear();
		pnum.clear();
		email.clear();	
		Thread.sleep(2000);

		
		cnt_person.sendKeys(c_person);
		addrl1.sendKeys(G_addr1);
		city1.sendKeys(G_city1);
		zip1.sendKeys(grp_zip);
		addrl2.sendKeys(grp_Addr2);
		pnum.sendKeys(grp_pnum);
		email.sendKeys(grp_email);
		save.click();
		Thread.sleep(3000);
		Notes.click();
		Thread.sleep(2800);
		General_Note.click();
		Add_Notes_Text.sendKeys(GRP_Notes);
		Thread.sleep(2000);
		Notes_Add.click();
		Thread.sleep(2000);
		OK.click();
		Thread.sleep(2000);		
		submit.click();
		
	}
	
	
	
	
	
	

	
	
	

}
