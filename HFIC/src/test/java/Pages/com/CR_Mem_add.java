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

	public void Add_Member() throws IOException, InterruptedException {
		Thread.sleep(5000);
		// test.log( Status.INFO," Add new member to the group");
		Change_Requests.click();
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
		Thread.sleep(2000);

		email.sendKeys(data.getstringdata("CR_AddMem", 0, 5));
		phone.sendKeys(data.getstringdata("CR_AddMem", 0, 6));
		phone.sendKeys(data.getstringdata("CR_AddMem", 0, 6));
		otherphone.sendKeys(data.getstringdata("CR_AddMem", 0, 6));
		efdate.sendKeys(data.getstringdata("CR_AddMem", 0, 7));
		addr1.sendKeys(data.getstringdata("CR_AddMem", 0, 8));
		addr2.sendKeys(data.getstringdata("CR_AddMem", 0, 9));
		city.sendKeys(data.getstringdata("CR_AddMem", 0, 10));
		zip.sendKeys(data.getstringdata("CR_AddMem", 0, 11));
		Select st = new Select(state);
		st.selectByVisibleText("NY");
		radiono.click();
		Thread.sleep(2000);

		laungaugae.sendKeys(data.getstringdata("CR_AddMem", 0, 12));
		Select LP = new Select(Langproficiency);
		LP.selectByIndex(2);
		Thread.sleep(2000);

		next.click();
		
	}

}
