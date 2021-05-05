package COM.HFIC.Pages;

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
	public void BrokerGeneral_AgentInformation(String name,String bnpn,String cname,String cnpn,String agentname,String GAnpn,
			String GAREP){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		nameofpayee.sendKeys(name);
		broker_npn.sendKeys(bnpn);
		js.executeScript("arguments[0].click();",isBenefitsAdministratorYes);
		js.executeScript("arguments[0].click();",isCoBrokerYes);
		cobrokername.sendKeys(cname);
		cobroker_npn.sendKeys(cnpn);
		isCoBrokerBenefitAdminstratorYes.click();
		agaentnameofpayee.sendKeys(agentname);
		generalagentNPN.sendKeys(GAnpn);
		generalagentrep.sendKeys(GAREP);
		js.executeScript("arguments[0].click();",isAuthorizeBenefitAdminstratorYes);
		brokercommision.sendKeys("80");
		cobrokercommision.sendKeys("20");
		js.executeScript("arguments[0].click();",policy);
		js.executeScript("arguments[0].click();",Continue1);
			
	}

}
