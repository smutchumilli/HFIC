package COM.HFIC.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Utilities.com.TestDataProvider;

public class BrokerGeneralAgentInformation extends Baseclass{
	//WebDriver driver;
	public BrokerGeneralAgentInformation(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(name="name-of-payee") WebElement nameofpayee;
	@FindBy(name="broker_npn") WebElement broker_npn;
	@FindBy(id="isBenefitsAdministratorYes")WebElement isBenefitsAdministratorYes;
	@FindBy(id="isCoBrokerYes") WebElement isCoBrokerYes;
	@FindBy(name="agent-name-of-payee") WebElement agaentnameofpayee;
	@FindBy(name="general-agent-npn")WebElement generalagentNPN;
	@FindBy(name="general-agent-representative")WebElement generalagentrep;
	@FindBy(id="isAuthorizeBenefitAdminstratorYes") WebElement isAuthorizeBenefitAdminstratorYes;
	@FindBy(id="enrollment-policy")WebElement policy;
	@FindBy(className="hf-broker-continue-btn")WebElement Continue1;
	
	@FindBy(name="cobroker-name-of-payee")WebElement cobrokername;
	@FindBy(name="cobroker_npn")WebElement cobroker_npn;
	@FindBy(id="isCoBrokerBenefitAdminstratorYes")WebElement isCoBrokerBenefitAdminstratorYes;
	@FindBy(name="commission-split-broker")WebElement brokercommision;
	@FindBy(name="commission-split-cobroker")WebElement cobrokercommision;
	public void BrokerGeneral_AgentInformation() {
		
	
	TestDataProvider data= new TestDataProvider();
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		nameofpayee.sendKeys(data.getstringdata("Login", 1, 5));
		broker_npn.sendKeys(data.getstringdata("Login", 2, 5));
		js.executeScript("arguments[0].click();",isBenefitsAdministratorYes);
		js.executeScript("arguments[0].click();",isCoBrokerYes);
		cobrokername.sendKeys(data.getstringdata("Login", 3, 5));
		cobroker_npn.sendKeys(data.getstringdata("Login", 4, 5));
		isCoBrokerBenefitAdminstratorYes.click();
		agaentnameofpayee.sendKeys(data.getstringdata("Login", 5, 5));
		generalagentNPN.sendKeys(data.getstringdata("Login", 6, 5));
		generalagentrep.sendKeys(data.getstringdata("Login", 7, 5));
		js.executeScript("arguments[0].click();",isAuthorizeBenefitAdminstratorYes);
		brokercommision.sendKeys("80");
		cobrokercommision.sendKeys("20");
		js.executeScript("arguments[0].click();",policy);
		js.executeScript("arguments[0].click();",Continue1);
		test.log( Status.INFO,"Broker and General agent information entered succssfully");
	
	}

}
