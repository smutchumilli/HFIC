package Pages.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.sun.corba.se.spi.orbutil.fsm.Action;

import Utilities.com.Helper;
import Utilities.com.TestDataProvider;

public class CR_Mem_add extends Baseclass {

	public CR_Mem_add(WebDriver driver) {
		this.driver = driver;
	}

	TestDataProvider data = new TestDataProvider();
	@FindBy(linkText = "Change Requests")
	WebElement Change_Requests;
	@FindBy(name = "HFICMyChangeRequests_pyDisplayHarness_2")
	WebElement Add_Change_Requests;

	@FindBy(id = "5c58224c")
	WebElement Change_Request_Type;
	@FindBy(id = "fd28b87d")
	WebElement fname;
	@FindBy(id = "9091f465")
	WebElement lname;
	@FindBy(id = "020083bf")
	WebElement dob;
	@FindBy(id = "3bbb60bf")
	WebElement ssn;
	@FindBy(id = "fdf7474e")
	WebElement gnender;
	@FindBy(id = "5933568a")
	WebElement grpid;
	@FindBy(name = "MemberSearch_pyWorkPage_41")
	WebElement Search;
	@FindBy(name = "MemberSearchResults_pyWorkPage_1752")
	WebElement Add_New_Faily;
	@FindBy(id = "64259450")
	WebElement email;
	@FindBy(id = "143bfe0f")
	WebElement phone;
	@FindBy(id = "fdc8dfd2")
	WebElement wphone;
	@FindBy(id = "b8322915")
	WebElement otherphone;
	@FindBy(id = "1c686669")
	WebElement efdate;
	@FindBy(id = "d2a42752")
	WebElement addr1;
	@FindBy(id = "4bad76e8")
	WebElement addr2;
	@FindBy(id = "20109000")
	WebElement city;
	@FindBy(id = "b508ba7d")
	WebElement zip;
	@FindBy(xpath = "//input[@id='1c686669']//following::select[1]")
	WebElement state;
	@FindBy(xpath = "//input[@id='de113204No']")
	WebElement radiono;

	@FindBy(xpath = "//input[@id='388866b0']")
	WebElement laungaugae;
	@FindBy(id = "3333af98")
	WebElement Langproficiency;
	@FindBy(xpath = "//select[@id='3333af98']//following::button[3]")
	WebElement next;
	@FindBy(xpath = "//button[@name='AddMemberEnrollInfo_pyWorkPage.AddMember_4']")	WebElement planselect;
	@FindBy(xpath = "(//input[@id='$PGroupPlans$ppxResults$l$ppySelected'])[4]")	WebElement single_radio;
	@FindBy(xpath = "(//input[@id='$PGroupPlans$ppxResults$l$ppySelected'])[4]//following::button[2]")	WebElement Review;
	@FindBy(name = "ListGroupPlansCR_pyWorkPage.Application.EmployerGroup_61")	WebElement submit;
	@FindBy(id = "b71896b6")	WebElement hiredate;
	@FindBy(id = "7caa91f6")	WebElement hsa;
	@FindBy(id = "2c2bc081")	WebElement eclass;
	@FindBy(id = "90c8467f")	WebElement ttype;
	@FindBy(id = "e9271363")	WebElement life_event;
	@FindBy(xpath = "//select[@id='e9271363']//following::button[3]")	WebElement next1;
	@FindBy(name = "AddMemberDetails_pyWorkPage.AddMember_7")	WebElement next2;

	

	@FindBy(id = "7417589f")	WebElement other_ins;
	@FindBy(name = "HFICCaseHeader_pyWorkPage_17") WebElement Notes;
	@FindBy(xpath = "//*[contains(text(),'ADD A GENERAL NOTE?')]")WebElement gtext;
	@FindBy(id = "2bc4e467")WebElement Add_Notes_Text;
	@FindBy(css = "div.pzbtn-mid")WebElement Notes_Add;
	@FindBy(xpath = "//*[contains(text(),'OK')]")WebElement OK;
	@FindBy(xpath = "//select[@id='7417589f']//following::button[1]")	WebElement save;	
	@FindBy(name = "AddMemberUI_pyWorkPage_47")	WebElement update_family;	

	
	
	public void Add_Member() throws IOException, InterruptedException {
		
		
		
		
		Thread.sleep(5000);
		// test.log( Status.INFO," Add new member to the group");
		Change_Requests.click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("HCR-30117")).click();
		Add_Change_Requests.click();
		Select s = new Select(Change_Request_Type);
		s.selectByIndex(4);
		fname.sendKeys(data.getstringdata("CR_AddMem", 0, 0));
		lname.sendKeys(data.getstringdata("CR_AddMem", 0, 1));
		dob.sendKeys(data.getstringdata("CR_AddMem", 0, 2));
		ssn.sendKeys(data.getstringdata("CR_AddMem", 0, 3));
		Select gen = new Select(gnender);
		gen.selectByIndex(1);
		grpid.sendKeys(data.getstringdata("CR_AddMem", 0, 4));
		Search.click();
		Thread.sleep(2000);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(3000);
		Add_New_Faily.click();
		Thread.sleep(6000);

		email.sendKeys(data.getstringdata("CR_AddMem", 0, 5));
		Thread.sleep(1000);

		phone.sendKeys(data.getstringdata("CR_AddMem", 0, 6));
		Thread.sleep(1000);
		phone.sendKeys(data.getstringdata("CR_AddMem", 0, 6));
		Thread.sleep(1000);

		wphone.sendKeys(data.getstringdata("CR_AddMem", 0, 13));
		Thread.sleep(1000);
		wphone.sendKeys(data.getstringdata("CR_AddMem", 0, 13));
		Thread.sleep(1000);

		otherphone.sendKeys(data.getstringdata("CR_AddMem", 0, 14));
		Thread.sleep(1000);

		efdate.sendKeys(data.getstringdata("CR_AddMem", 0, 7));
		Thread.sleep(1000);

		addr1.sendKeys(data.getstringdata("CR_AddMem", 0, 8));
		Thread.sleep(1000);

		addr2.sendKeys(data.getstringdata("CR_AddMem", 0, 9));
		Thread.sleep(1000);

		city.sendKeys(data.getstringdata("CR_AddMem", 0, 10));
		Thread.sleep(1000);

		zip.sendKeys(data.getstringdata("CR_AddMem", 0, 11));
		Thread.sleep(1000);
		zip.sendKeys(data.getstringdata("CR_AddMem", 0, 11));
		Thread.sleep(1000);

		Select st = new Select(state);
		st.selectByVisibleText("NY");
		Thread.sleep(2000);

		radiono.click();
		Thread.sleep(2000);

		laungaugae.sendKeys(data.getstringdata("CR_AddMem", 0, 12));
		Select LP = new Select(Langproficiency);
		LP.selectByIndex(2);
		Thread.sleep(2000);

		next.click();
		Thread.sleep(5000);
		
		planselect.click();
		Thread.sleep(2000);

		single_radio.click();
		Thread.sleep(2000);

		Review.click();
		Thread.sleep(5000);

		submit.click();
		Thread.sleep(2000);

		hiredate.sendKeys("01/01/2021");
		Thread.sleep(2000);
		
	if (driver.findElements(By.id("7caa91f6")).size()!=0) {

		Select hs= new Select(hsa);
		hs.selectByIndex(1);
		Thread.sleep(2000);
		}
		
		
		Select ec= new Select(eclass);
		ec.selectByIndex(1);
		Thread.sleep(2000);

		Select tt= new Select(ttype);
		tt.selectByIndex(1);
		Thread.sleep(2000);

		Select le= new Select(life_event);
		le.selectByIndex(1);
		Thread.sleep(2000);

		next1.click();
		Thread.sleep(2000);

		next2.click();
		Thread.sleep(2000);

		Select oi= new Select(other_ins);
		oi.selectByVisibleText("No");
		Thread.sleep(2000);
		Notes.click();
		Thread.sleep(2000);

		gtext.click();
		Thread.sleep(2000);

		Add_Notes_Text.sendKeys("Member succssfully Added");
		Thread.sleep(2000);

		Notes_Add.click();
		Thread.sleep(2000);

		OK.click();
		Thread.sleep(2000);

		save.click();
		Thread.sleep(2000);

		update_family.click();

		}	
		
	

}
