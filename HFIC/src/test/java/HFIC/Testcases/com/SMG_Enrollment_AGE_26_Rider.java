package HFIC.Testcases.com;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import COM.HFIC.Pages.AddEmployee;
import COM.HFIC.Pages.Agreement;
import COM.HFIC.Pages.BrokerGeneralAgentInformation;
import COM.HFIC.Pages.COBRA_Coverage;
import COM.HFIC.Pages.Get_Quotepage;
import COM.HFIC.Pages.GroupInformationPage;
import COM.HFIC.Pages.Group_Administration;
import COM.HFIC.Pages.HealthInsurencePlans;
import COM.HFIC.Pages.Lamp_Homepage;
import COM.HFIC.Pages.Lamploginpage;
import COM.HFIC.Pages.ReviewApplicationDetails;
import COM.HFIC.Pages.Uploaddocument;
import Pages.com.Baseclass;
import Pages.com.PEGA_SMG_Process;
import Utilities.com.Helper;

public class SMG_Enrollment_AGE_26_Rider extends Baseclass { 
	@Test(invocationCount=1)
	public void Lamp_SMG_Application_Submissionn() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("HFIC SMG Enrollment");
		Lamploginpage Lamploginpage = PageFactory.initElements(driver, Lamploginpage.class);
		Lamploginpage.login_to_Lamp();
		Lamp_Homepage Lamp_Homepage = PageFactory.initElements(driver, Lamp_Homepage.class);
		Lamp_Homepage.LampHomepage();
		Get_Quotepage Get_Quotepage = PageFactory.initElements(driver, Get_Quotepage.class);
		Get_Quotepage.GetQuotepage();
		HealthInsurencePlans HealthInsurencePlans = PageFactory.initElements(driver, HealthInsurencePlans.class);
		HealthInsurencePlans.Health_Insurence_Plans();
		GroupInformationPage GroupInformationPage = PageFactory.initElements(driver, GroupInformationPage.class);
		GroupInformationPage.Group_Information_Page();
		Group_Administration Group_Administration = PageFactory.initElements(driver, Group_Administration.class);
		Group_Administration.GroupAdministration();
		COBRA_Coverage COBRA_Coverage = PageFactory.initElements(driver, COBRA_Coverage.class);
		COBRA_Coverage.COBRA_Coverage1();
		BrokerGeneralAgentInformation BrokerGeneral_AgentInformation = PageFactory.initElements(driver,BrokerGeneralAgentInformation.class);
		BrokerGeneral_AgentInformation.BrokerGeneral_AgentInformation();
		AddEmployee AddEmployee = PageFactory.initElements(driver, AddEmployee.class);
		AddEmployee.Add_Emp();
		Uploaddocument Uploaddocument = PageFactory.initElements(driver, Uploaddocument.class);
		Uploaddocument.Document_Upload();
		ReviewApplicationDetails ReviewApplicationDetails = PageFactory.initElements(driver,ReviewApplicationDetails.class);
		ReviewApplicationDetails.Review_ApplicationDetails();
		Agreement Agreement = PageFactory.initElements(driver, Agreement.class);
		Agreement.Agreement1();
		Thread.sleep(10000);
		PEGA_SMG_Process PEGA_SMG_Process = PageFactory.initElements(driver, PEGA_SMG_Process.class);
		PEGA_SMG_Process.PEGA_process();	
	}
}
