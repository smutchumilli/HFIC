package Pages.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;

import Utilities.com.Helper;
import Utilities.com.TestDataProvider;


public class ChangeRequest_Uplodedocuments extends Baseclass {

	public ChangeRequest_Uplodedocuments(WebDriver ldriver) {
		this.driver = ldriver;

	}
	
	TestDataProvider data= new TestDataProvider();

	@FindBy(id = "555e7955")
	WebElement Title;
	@FindBy(xpath = "//a[contains(text(),'Change Requests')]")
	WebElement Chnagerequest_Link;
	@FindBy(xpath = "//button[contains(text(),'Create Change Request')]")
	WebElement Create_Change_Request;
	@FindBy(id = "5c58224c")
	WebElement CR_Type;
	@FindBy(id = "5933568a")
	WebElement grp_id;
	@FindBy(id = "fd28b87d")
	WebElement grp_name;
	@FindBy(id = "eba1601d")
	WebElement grp_effectivedate;
	@FindBy(id = "1bd959e7")
	WebElement grp_tax;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement search_btn;
	@FindBy(name = "HFICGroup360SearchResults_Group360Search.pxResults(1)_67")
	WebElement Search_result;
	@FindBy(name = "DocumentUploadUI_pyWorkPage_42")
	WebElement DocumentUploadUI;
	@FindBy(id = "253bc4da")
	WebElement DOCtype;
	@FindBy(name = "HFICCaseHeader_pyWorkPage_17")
	WebElement Notes;
	@FindBy(name = "$PpyAttachmentPage$ppxAttachName")
	WebElement Chosefile;
	@FindBy(xpath = "//*[contains(text(),'ADD A GENERAL NOTE?')]")
	WebElement General_Note;
	@FindBy(id = "2bc4e467")
	WebElement Add_Notes_Text;
	@FindBy(css = "div.pzbtn-mid")
	WebElement Notes_Add;
	@FindBy(xpath = "//*[contains(text(),'OK')]")
	WebElement OK;
	@FindBy(xpath = "//*[contains(text(),'Submit Documents')]")
	WebElement Submit;
	@FindBy(id = "c5286a50Primary")
	WebElement Other;
	@FindBy(id = "c8d78892")
	WebElement docsubtype;
	@FindBy(xpath="//input[@type='file']") WebElement File;
	@FindBy(xpath="//button[@id='ModalButtonSubmit']") WebElement ok;
	@FindBy(id="2bc4e467") WebElement textarea;
	@FindBy(xpath="//*[@id='2bc4e467']//following::button[1]") WebElement add;
	@FindBy(xpath="//*[@id='2bc4e467']//following::button[3]") WebElement ok1;
	



	public void Adit_Document_Upload() throws InterruptedException, AWTException, IOException {
		for(int i=1;i<=3;i++) 
		{
		Thread.sleep(1500);
		Chnagerequest_Link.click();
		Thread.sleep(1000);
		Create_Change_Request.click();
		Thread.sleep(500);
		Select s = new Select(CR_Type);
		s.selectByIndex(7);
		grp_id.sendKeys(data.getstringdata("CR", i, 1));
		Thread.sleep(500);
		grp_name.sendKeys(data.getstringdata("CR", i, 2));
		Thread.sleep(500);
		grp_effectivedate.sendKeys(data.getstringdata("CR", i, 3));
		Thread.sleep(500);
		grp_tax.sendKeys(data.getstringdata("CR", i, 4));
		Thread.sleep(1200);
		search_btn.click();
		Thread.sleep(1200);
		Search_result.click();
		Thread.sleep(1000);
		DocumentUploadUI.click();
		Thread.sleep(1500);
		Select s1 = new Select(DOCtype);
		s1.selectByIndex(i);
		Thread.sleep(2000);
		File.sendKeys("Q:\\Myfile.docx");
		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		Notes.click();
		Thread.sleep(1000);
		General_Note.click();
		Thread.sleep(1000);
		textarea.sendKeys(data.getstringdata("CR", i, 5));
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		ok1.click();
		Thread.sleep(2000);
		test.info(data.getstringdata("CR", i, 0));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(2000);

		Submit.click();
		}
		
	}

	public void Other_Document_Upload() throws InterruptedException, AWTException, IOException {
		for(int j=1;j<=5;j++) {

		Thread.sleep(1500);
		Chnagerequest_Link.click();
		Thread.sleep(1000);
		Create_Change_Request.click();
		Thread.sleep(500);
		Select s = new Select(CR_Type);
		s.selectByIndex(7);
		grp_id.sendKeys(data.getstringdata("CR", j, 8));
		Thread.sleep(500);
		grp_name.sendKeys(data.getstringdata("CR", j, 9));
		Thread.sleep(500);
		grp_effectivedate.sendKeys(data.getstringdata("CR", j, 10));
		Thread.sleep(500);
		grp_tax.sendKeys(data.getstringdata("CR", j, 11));
		Thread.sleep(1200);
		search_btn.click();
		Thread.sleep(1200);
		Search_result.click();
		Thread.sleep(1200);
		Other.click();
		Thread.sleep(1000);
		DocumentUploadUI.click();
		Thread.sleep(1500);
		Select s1 = new Select(DOCtype);
		s1.selectByIndex(j);

		if (j==4) 
		{
		Select n = new Select(docsubtype);
		n.selectByIndex(j);
		Thread.sleep(2000);
		File.sendKeys("Q:\\Myfile.docx");

		}
		else if (j==5)
		{
			Thread.sleep(2000);
			Title.sendKeys("Other Documents");
			Thread.sleep(2000);
			File.sendKeys("Q:\\Myfile.docx");

		}
		Thread.sleep(2000);

		File.sendKeys("Q:\\Myfile.docx");

		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		Notes.click();
		Thread.sleep(1000);
		General_Note.click();
		Thread.sleep(1000);
		textarea.sendKeys(data.getstringdata("CR", j, 12));
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		ok1.click();
		Thread.sleep(1000);
		test.info(data.getstringdata("CR", j, 7));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		Thread.sleep(2000);

		Submit.click();
		
	}

	}
}
