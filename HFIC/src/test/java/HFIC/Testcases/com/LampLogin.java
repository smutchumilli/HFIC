package HFIC.Testcases.com;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.PEGA_SMG_Process;

public class LampLogin extends Baseclass {
	@Test(invocationCount=1)
	public void Lamp_SMG_Application_Submissionn() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("HFIC SMG Enrollment");
		Lamploginpage Lamploginpage = PageFactory.initElements(driver, Lamploginpage.class);
		Lamploginpage.login_to_Lamp(data.getstringdata("Login", 0, 0), data.getstringdata("Login", 1, 0),
				data.getstringdata("Login", 2, 0));

		Lamp_Homepage Lamp_Homepage = PageFactory.initElements(driver, Lamp_Homepage.class);
		Lamp_Homepage.LampHomepage();

		Get_Quotepage Get_Quotepage = PageFactory.initElements(driver, Get_Quotepage.class);
		Get_Quotepage.GetQuotepage(data.getstringdata("Login", 3, 0), data.getstringdata("Login", 4, 0));

		HealthInsurencePlans HealthInsurencePlans = PageFactory.initElements(driver, HealthInsurencePlans.class);
		HealthInsurencePlans.Health_Insurence_Plans();

		GroupInformationPage GroupInformationPage = PageFactory.initElements(driver, GroupInformationPage.class);
		GroupInformationPage.Group_Information_Page(data.getstringdata("Login", 5, 0),
				data.getstringdata("Login", 6, 0), data.getstringdata("Login", 7, 0), data.getstringdata("Login", 8, 0),
				data.getstringdata("Login", 9, 0), data.getstringdata("Login", 10, 0),
				data.getstringdata("Login", 11, 0), data.getstringdata("Login", 12, 0),
				data.getstringdata("Login", 13, 0), data.getstringdata("Login", 14, 0),
				data.getstringdata("Login", 15, 0), data.getstringdata("Login", 16, 0),
				data.getstringdata("Login", 17, 0), data.getstringdata("Login", 18, 0),
				data.getstringdata("Login", 19, 0));

		Group_Administration Group_Administration = PageFactory.initElements(driver, Group_Administration.class);
		Group_Administration.GroupAdministration(data.getstringdata("Login", 0, 1), data.getstringdata("Login", 0, 1),
				data.getstringdata("Login", 0, 1), data.getstringdata("Login", 1, 1), data.getstringdata("Login", 0, 1),
				data.getstringdata("Login", 1, 1), data.getstringdata("Login", 1, 1));

		COBRA_Coverage COBRA_Coverage = PageFactory.initElements(driver, COBRA_Coverage.class);
		COBRA_Coverage.COBRACoverage();

		BrokerGeneralAgentInformation BrokerGeneral_AgentInformation = PageFactory.initElements(driver,
				BrokerGeneralAgentInformation.class);
		BrokerGeneral_AgentInformation.BrokerGeneral_AgentInformation(data.getstringdata("Login", 0, 2),
				data.getstringdata("Login", 1, 2), data.getstringdata("Login", 2, 2), data.getstringdata("Login", 3, 2),
				data.getstringdata("Login", 4, 2));

		AddEmployee AddEmployee = PageFactory.initElements(driver, AddEmployee.class);
		AddEmployee.Add_Emp();

		Uploaddocument Uploaddocument = PageFactory.initElements(driver, Uploaddocument.class);
		Uploaddocument.Document_Upload();

		ReviewApplicationDetails ReviewApplicationDetails = PageFactory.initElements(driver,
				ReviewApplicationDetails.class);
		ReviewApplicationDetails.Review_ApplicationDetails();

		Agreement Agreement = PageFactory.initElements(driver, Agreement.class);
		Agreement.Agreement1(data.getstringdata("Login", 20, 0), data.getstringdata("Login", 21, 0),
				data.getstringdata("Login", 22, 0), data.getstringdata("Login", 23, 0),
				data.getstringdata("Login", 24, 0), data.getstringdata("Login", 25, 0),
				data.getstringdata("Login", 26, 0));
		
			
			PEGA_SMG_Process PEGA_SMG_Process=PageFactory.initElements(driver, PEGA_SMG_Process.class);
			PEGA_SMG_Process.HFIC_Manager_Login(data.getstringdata("Pega", 0, 0),
					data.getstringdata("Pega", 0, 1),
					data.getstringdata("Pega", 2, 0),
					data.getstringdata("Pega", 0, 2));
			
			PEGA_SMG_Process.HFIC_Superuser_login(data.getstringdata("Pega", 1, 0),
					data.getstringdata("Pega", 1, 1), 
					data.getstringdata("Pega", 2, 0));
		}
	}

