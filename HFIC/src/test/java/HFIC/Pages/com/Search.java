package HFIC.Pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Search extends Baseclass {

	public Search(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement Search_icon;
	@FindBy(id = "60caa79c")
	WebElement Request_type;
	@FindBy(id = "50d8717b")
	WebElement Application_type;
	@FindBy(id = "21800331")
	WebElement Application_status;
	@FindBy(id = "6839a3e1")
	WebElement Broker;
	@FindBy(id = "cfdc9e7d")
	WebElement Application_id;
	@FindBy(id = "d1600a6")
	WebElement Transaction_id;
	@FindBy(id = "874fdaa4")
	WebElement grpid;
	@FindBy(id = "d4000d46")
	WebElement taxid;
	@FindBy(id = "5bb2922d")
	WebElement grpname;
	@FindBy(id = "1f1bdbe")
	WebElement Subscriber;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[1]")
	WebElement CEFrom;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[2]")
	WebElement CETo;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[3]")
	WebElement ARfrom;
	@FindBy(xpath = "//*[@id='5bb2922d']//following::img[4]")
	WebElement ARto;
	@FindBy(name = "HFICSearchCriteria_pyDisplayHarness_63")
	WebElement search;
	//
	@FindBy(xpath = "//tr[@id='$PHFICSearchTasks$ppxResults$l1']")
	WebElement search_result;

	// date select
	@FindBy(xpath = "//*[@id='controlCalBody']//tr[1]//td[1]")
	WebElement DTFromselect;
	@FindBy(css = "input.spinner-input")
	WebElement DTFromMonth;
	@FindBy(xpath = "//*[@id='yearSpinner']")
	WebElement DTFromYear;

	public void Request_type() {
		Select ReqType = new Select(Request_type);
		ReqType.selectByIndex(1);

	}

	public void Application_type() {
		Select APPTYPE = new Select(Application_type);
		APPTYPE.selectByIndex(2);

	}

	public void Application_status() {
		Select APPstatus = new Select(Application_status);
		APPstatus.selectByIndex(5);

	}

	public void Broker(String broker) {
		Broker.sendKeys(broker);
	}

	public void Application_id(String appid) {
		Application_id.sendKeys(appid);
	}

	public void Transaction_id(String trid) {
		Transaction_id.sendKeys(trid);
	}

	public void grpid(String grp_id) {
		grpid.sendKeys(grp_id);

	}

	public void taxid(String tax_id) {
		taxid.sendKeys(tax_id);

	}

	public void grpname(String grp_name) {
		grpname.sendKeys(grp_name);

	}

	public void Subscriber(String subs) throws InterruptedException {
		Subscriber.sendKeys(subs);
		Thread.sleep(3000);

	}

	public void CEFrom() {
		CEFrom.click();
		DTFromMonth.sendKeys("D");
		DTFromYear.sendKeys("2019");
		DTFromselect.click();

	}

	public void CETo() {
		CETo.click();
		DTFromMonth.sendKeys("D");
		DTFromYear.sendKeys("2019");
		DTFromselect.click();

	}

	public void ARfrom(String AR_from) {
		ARfrom.sendKeys(AR_from);

	}

	public void ARto(String AR_to) {
		ARto.sendKeys(AR_to);

	}

	public void search_Button() {
		search.click();

	}

	public void search_result() {
		Actions act = new Actions(driver);
		act.doubleClick(search_result).perform();
	}

	public void search_icon() {
		Search_icon.click();

	}

}
