package Pages.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Utilities.com.Helper;
import Utilities.com.TestDataProvider;

public class ChangeRequest_HSA extends Baseclass {

	public ChangeRequest_HSA(WebDriver driver) {
		this.driver = driver;
	}
TestDataProvider data= new TestDataProvider();
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

	@FindBy(name = "HFICCaseHeader_pyWorkPage_17")
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

	

	public void HSA_Member_Update() throws InterruptedException, IOException {

		Chnagerequest_Link.click();
		Create_Change_Request.click();
		Select s = new Select(CR_Type);
		s.selectByIndex(8);
		Memberid.sendKeys(data.getstringdata("HSA",0,0));
		fname.sendKeys(data.getstringdata("HSA",0,1));
		lname.sendKeys(data.getstringdata("HSA",0,2));
		search.click();
		test.log( Status.INFO," Searching for HSA member");

		searchresult.click();
		edit.click();
		dob.clear();
		ssn.clear();
		addr1.clear();
		city.clear();
		zip.clear();
		addr2.clear();
		dob.sendKeys(data.getstringdata("HSA",0,4));
		ssn.sendKeys(data.getstringdata("HSA",1,4));
		addr1.sendKeys(data.getstringdata("HSA",2,4)+Helper.Get_CurrentdateandTimesec());
		city.sendKeys(data.getstringdata("HSA",3,4));
		zip.sendKeys(data.getstringdata("HSA",4,4));
		addr2.sendKeys(data.getstringdata("HSA",5,4));	
		save.click();
		test.log( Status.INFO," group details  Updated succssfully and clicked on save");

		Thread.sleep(1000);
		Notes.click();
		Thread.sleep(1000);
		General_Note.click();
		Thread.sleep(1000);
		Add_Notes_Text.sendKeys("HSA Member details has been updated succssfully");
		Thread.sleep(1000);
		Notes_Add.click();
		Thread.sleep(1000);
		OK.click();
		test.log( Status.INFO," Notes Updated succssfully");

		Thread.sleep(2000);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		submit.click();	
	}

	public void HSA_Group_Update() throws InterruptedException, IOException {
		test.log( Status.INFO," HSA Group details Update");

		Chnagerequest_Link.click();
		Create_Change_Request.click();
		Select s = new Select(CR_Type);
		s.selectByIndex(8);		
		grpdetails.click();
		test.log( Status.INFO," Searching for HSA group");

		grpid.sendKeys(data.getstringdata("HSA",6,0));
		gname.sendKeys(data.getstringdata("HSA",6,1));
		taxid.sendKeys(data.getstringdata("HSA",6,2));
		search.click();
		GRP_Searchresults.click();

		edit.click();
		cnt_person.clear();
		addrl1.clear();
		city1.clear();
		zip1.clear();
		addrl2.clear();
		pnum.clear();
		email.clear();
		email.clear();
		test.log( Status.INFO," Updating HSA group details");

		cnt_person.sendKeys(data.getstringdata("HSA",6,4)+Helper.Get_CurrentdateandTimesec());
		addrl1.sendKeys(data.getstringdata("HSA",7,4));
		city1.sendKeys(data.getstringdata("HSA",8,4));
		zip1.sendKeys(data.getstringdata("HSA",9,4));
		addrl2.sendKeys(data.getstringdata("HSA",10,4));
		pnum.sendKeys(data.getstringdata("HSA",11,4));
		email.sendKeys(data.getstringdata("HSA",12,4));
		save.click();

		Notes.click();
		Thread.sleep(1000);
		General_Note.click();
		Thread.sleep(1000);
		Add_Notes_Text.sendKeys("HSA Group details has been updated succssfully");
		Thread.sleep(1000);
		Notes_Add.click();
		test.log( Status.INFO," Notes Updated succssfully");

		Thread.sleep(1000);
		OK.click();
		Thread.sleep(2000);	
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		submit.click();	
	}

}
