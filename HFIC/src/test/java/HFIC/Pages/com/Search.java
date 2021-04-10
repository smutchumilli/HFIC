package HFIC.Pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends Baseclass{
	
	public  Search(WebDriver driver) {
		this.driver=driver;
		
	}
	//HFIC Application Search
	@FindBy(id="60caa79c") WebElement Requesttype;
	@FindBy(id="50d8717b") WebElement Applicationtyp;
	@FindBy(id="21800331") WebElement Application_status;
	@FindBy(id="6839a3e1") WebElement Broker_id;
	@FindBy(id="cfdc9e7d") WebElement Application_id;
	@FindBy(id="d1600a6") WebElement Transaction_id;
	@FindBy(id="874fdaa4") WebElement Group_id;
	@FindBy(id="d4000d46") WebElement taxid;
	@FindBy(id="5bb2922d") WebElement Groupname ;
	@FindBy(id="1f1bdbe") WebElement Subscriber_id;
	@FindBy(name="HFICSearchCriteria_pyDisplayHarness_63") WebElement Search;
	
//HFIC Task Search	
	@FindBy(xpath="//*[contains(text(),'HFIC TASK SEARCH')]") WebElement HFIC_TASK_SEARCH ;
	@FindBy(id="64142ad6") WebElement Task_Search_Type;
	@FindBy(id="65bee56e") WebElement task_id;
	@FindBy(id="5a403f22") WebElement task_status;
	@FindBy(id="dc3086c6") WebElement elog_type;
	@FindBy(id="d1600a6") WebElement Transaction_id;
	@FindBy(id="874fdaa4") WebElement  group_id;
	@FindBy(id="d9073ef5") WebElement account_num;
	@FindBy(name="TaskELogSearchCriteria_pyDisplayHarness_223") WebElement Search1;
	
	//Membership 
	@FindBy(id="1f1bdbe") WebElement mhs_sub_id;
	@FindBy(id="cc107979") WebElement application;
	@FindBy(id="853f4173") WebElement req_type;
	@FindBy(id="5bb2922d") WebElement application_name;
	@FindBy(id="a42dbd22") WebElement Account_name


;



}
