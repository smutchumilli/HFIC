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

public class ChangeRequest_Uplodedocuments {
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

	public void CR_Uplodedocument_Search(String grpid, String grpname, String effdate, String gtax)
			throws InterruptedException, AWTException {

		Chnagerequest_Link.click();
		Thread.sleep(3000);
		Create_Change_Request.click();
		Thread.sleep(3800);

		Select s = new Select(CR_Type);
		s.selectByIndex(7);
		Thread.sleep(3000);
		grp_id.sendKeys(grpid);
		grp_name.sendKeys(grpname);
		grp_effectivedate.sendKeys(effdate);
		grp_effectivedate.sendKeys(gtax);
		Thread.sleep(3000);
		search_btn.click();
		Thread.sleep(3000);
		Search_result.click();
		Thread.sleep(3800);

	}

	public void DocumentType_Select(int i) throws InterruptedException, AWTException {
		Thread.sleep(3800);

		DocumentUploadUI.click();
		Thread.sleep(3800);
		Select s1 = new Select(DOCtype);
		s1.selectByIndex(i);
		Thread.sleep(3800);
		String myString = "Q:\\Myfile.docx";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

	}

	public void Rober1() throws AWTException, InterruptedException {
		// Robert class for Upload documents
		rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);

	}

	public void Rober2() throws AWTException, InterruptedException {
		// Robert class for Upload documents
		rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3800);
	}

	// Adding Notes
	public void Notes(String gtext) throws InterruptedException {
		Notes.click();
		Thread.sleep(3000);
		General_Note.click();
		Thread.sleep(3000);
		Add_Notes_Text.sendKeys(gtext);
		Thread.sleep(3000);
		Notes_Add.click();
		Thread.sleep(3000);
		OK.click();
		Thread.sleep(3000);
		Submit.click();
	}

	public void Document_Purpose() {
		Other.click();

	}
	public void Doc_Title(String Text) {
		Title.sendKeys(Text);

	}

}
