package HFIC.Pages.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ChangeRequest_Uplodedocuments extends Baseclass {
	WebDriver driver;
	public Robot rb;

	public ChangeRequest_Uplodedocuments(WebDriver ldriver) {
		this.driver = ldriver;

	}

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
	@FindBy(name = "HFICCaseHeader_pyWorkPage_16")
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

	public void Chnagerequest_Link() throws InterruptedException {
		Thread.sleep(2000);
		Chnagerequest_Link.click();
		Thread.sleep(1500);

	}

	public void Create_Change_Request() throws InterruptedException {
		Thread.sleep(1000);
		Create_Change_Request.click();
	}

	public void CR_Type() throws InterruptedException {
		Thread.sleep(500);

		Select s = new Select(CR_Type);
		s.selectByIndex(7);
	}

	public void grp_id(String grpid) {
		grp_id.sendKeys(grpid);
	}

	public void grp_name(String grpname) {
		grp_name.sendKeys(grpname);
	}

	public void grp_effectivedate(String effdate) {
		grp_effectivedate.sendKeys(effdate);
	}

	public void grp_tax(String gtax) {
		grp_tax.sendKeys(gtax);
	}

	public void search_btn() throws InterruptedException {
		Thread.sleep(1500);

		search_btn.click();
		Thread.sleep(1500);

	}

	public void Search_result() throws InterruptedException {
		Thread.sleep(1500);

		Search_result.click();
		Thread.sleep(1000);

	}

	public void Adit_DocumentType_Select(int i) throws InterruptedException, AWTException {
		//Thread.sleep(1500);

		Select s1 = new Select(DOCtype);
		s1.selectByIndex(i);
		if (i != 3) {

			Tab();
			Enter();	

			control();
			V();
			
			Tab();
			Tab();
			Enter();

			Tab();
			Enter();


		} else {

			// Robert class for Upload documents
			//Thread.sleep(4000);
			Tab();
			Tab();
			Enter();	

			control();
			V();
			
			Tab();
			Tab();
			Enter();

			Tab();
			Enter();

			//Thread.sleep(3500);
		}
	}
	public void Other_DocumentType_Select(int i, String s) throws InterruptedException, AWTException {

		//Thread.sleep(2000);

		Select s1 = new Select(DOCtype);
		s1.selectByIndex(i);
		//Thread.sleep(2000);

		if (i == 5)
{			Tab();
			Doc_Title(s);
			Tab();
			Enter();

			control();
			V();
			Tab();
			Tab();
			Enter();

			Tab();
			Enter();

}	else if (i==4){
	Tab();

	Doc_subtype(1);
	Tab();
	Tab();
	Enter();
	control();
	V();
	Tab();
	Tab();
	Enter();

	Tab();
	Enter();

	
}else  {
	Tab();
	Tab();
	Enter();	

	control();
	V();
	
	Tab();
	Tab();
	Enter();

	Tab();
	Enter();

}

		
	}		
	public void Enter() throws AWTException, InterruptedException {
		Thread.sleep(1000);
			rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1800);
			
		}
		public void Tab() throws AWTException, InterruptedException {
			rb = new Robot();
			Thread.sleep(500);

			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1800);

			
		}
		public void V() throws AWTException, InterruptedException {
			rb = new Robot();

		
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1800);

			}
		public void control() throws AWTException, InterruptedException {
			rb = new Robot();

			rb.keyPress(KeyEvent.VK_CONTROL);		
			rb.keyPress(KeyEvent.VK_V);
			Thread.sleep(1800);

		}		
		
			
		
	public void DocumentUploadUI() throws InterruptedException {

		DocumentUploadUI.click();
		Thread.sleep(1000);

	}

	public void copy() {
		String myString = "Q:\\Myfile.docx";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}



	public void Notes() throws InterruptedException   {
		Thread.sleep(500);

		Notes.click();
		Thread.sleep(500);


	}

	public void General_Note() throws InterruptedException {
		General_Note.click();
		//Thread.sleep(2000);

	}

	public void Add_Notes_Text(String gtext) throws InterruptedException {
		Add_Notes_Text.sendKeys(gtext);
		//Thread.sleep(1500);

	}

	public void Notes_Add() throws InterruptedException {
		Notes_Add.click();
		//Thread.sleep(2500);

	}

	public void OK() throws InterruptedException {
		OK.click();
		//Thread.sleep(2800);

	}

	public void submit() throws InterruptedException {
		Submit.click();
		Thread.sleep(1000);

	}

	public void Document_Purpose() throws InterruptedException {
		Other.click();
		
		//Thread.sleep(2000);


	}

	public void Doc_Title(String Text) throws InterruptedException {
		Title.sendKeys(Text);
		//Thread.sleep(1500);


	}

	public void Doc_subtype(int i) throws InterruptedException {
		//Thread.sleep(1000);

		Select n = new Select(docsubtype);
		n.selectByIndex(i);
		//Thread.sleep(1000);

	}
	
	public void CR_Upload_document(String grp_id,String grpname,String eff,String gtx,int i,String text) throws InterruptedException, AWTException {
		Chnagerequest_Link();
		Create_Change_Request();
		CR_Type();
		grp_id(grp_id);
		grp_name(grpname);
		grp_effectivedate(eff);
		grp_tax(gtx);
		search_btn();
		Search_result();
		DocumentUploadUI();
		copy();
		Adit_DocumentType_Select(i);
		Notes();
		General_Note();
		Add_Notes_Text(text);
		Notes_Add();
		OK();
		
			
	}
	public void CR_Upload_document_Other(String grp_id,String grpname,String eff,String gtx,int i,String text1 ,String text) throws InterruptedException, AWTException {
		Chnagerequest_Link();
		Create_Change_Request();
		CR_Type();
		grp_id(grp_id);
		grp_name(grpname);
		grp_effectivedate(eff);
		grp_tax(gtx);
		search_btn();
		Search_result();
		Document_Purpose();
		DocumentUploadUI();
		copy();
		Other_DocumentType_Select(i, text1);
		Notes();
		General_Note();
		Add_Notes_Text(text);
		Notes_Add();
		OK();
		
			
	}
	

}
