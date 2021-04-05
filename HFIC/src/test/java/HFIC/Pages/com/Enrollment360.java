package HFIC.Pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment360 extends Baseclass{
	
	public Enrollment360(WebDriver driver) {
		this.driver= driver;
	}


@FindBy(name="HFICHFManagerNavContent_pyPortalHarness_58") WebElement enroll360;
@FindBy(id="874fdaa4") WebElement grpid;
@FindBy(id="2b1160eb") WebElement grpname;
@FindBy(id="65e93d58") WebElement effdate;
@FindBy(id="d4000d46") WebElement taxid;
@FindBy(name="HFIC360SearchGroup_pyDisplayHarness_1148") WebElement Search;
@FindBy(name="HFICGroup360SearchResults_Group360Search.pxResults(1)_151") WebElement searchresut;


//healthpass

@FindBy(id="ce44cadbHealthPassPortal") WebElement hpassradiobutton;
@FindBy(id="874fdaa4") WebElement hgrpid;
@FindBy(id="5c8ec601") WebElement hp_grpid;
@FindBy(id="65e93d58") WebElement hp_effec;
@FindBy(name="HPGroup360SearchResults_HPGroup360Search.pxResults(1)_140") WebElement HPsearchresut;






}