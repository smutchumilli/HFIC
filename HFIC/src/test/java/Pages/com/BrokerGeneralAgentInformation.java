package Pages.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokerGeneralAgentInformation {
	WebDriver driver;
	public BrokerGeneralAgentInformation(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(name="name-of-payee") WebElement nameofpayee;
	@FindBy(name="broker_npn") WebElement broker_npn;
	@FindBy(id="isBenefitsAdministratorNo")WebElement isBenefitsAdministratorNo;
	@FindBy(id="isCoBrokerNo") WebElement isCoBrokerNo;
	@FindBy(name="agent-name-of-payee") WebElement agaentnameofpayee;
	@FindBy(name="general-agent-npn")WebElement generalagentNPN;
	@FindBy(name="general-agent-representative")WebElement generalagentrep;
	@FindBy(id="isAuthorizeBenefitAdminstratorYes") WebElement isAuthorizeBenefitAdminstratorYes;
	@FindBy(id="enrollment-policy")WebElement policy;
	@FindBy(className="hf-broker-continue-btn")WebElement Continue1;
	
	public void BrokerGeneral_AgentInformation(String name,String bnpn,String agentname,String GAnpn,String GAREP){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		nameofpayee.sendKeys(name);
		broker_npn.sendKeys(bnpn);
		js.executeScript("arguments[0].click();",isBenefitsAdministratorNo);
		js.executeScript("arguments[0].click();",isCoBrokerNo);
		agaentnameofpayee.sendKeys(agentname);
		generalagentNPN.sendKeys(GAnpn);
		generalagentrep.sendKeys(GAREP);
		js.executeScript("arguments[0].click();",isAuthorizeBenefitAdminstratorYes);
		js.executeScript("arguments[0].click();",policy);
		js.executeScript("arguments[0].click();",Continue1);
			
	}

}
