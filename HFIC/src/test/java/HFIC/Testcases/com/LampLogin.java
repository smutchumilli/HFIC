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
import Pages.com.Baseclass;
import Pages.com.PEGA_SMG_Process;

public class LampLogin extends Baseclass {
	@Test(invocationCount=3)
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
		GroupInformationPage.Group_Information_Page(data.getstringdata("Login", 1, 6),
				data.getstringdata("Login", 2,6), data.getstringdata("Login", 3, 6), 
				data.getstringdata("Login", 4, 6),data.getstringdata("Login", 5, 6),
				data.getstringdata("Login", 6, 6),
				data.getstringdata("Login", 7, 6), data.getstringdata("Login", 8, 6),
				data.getstringdata("Login", 9, 6), data.getstringdata("Login", 10, 6),
				data.getstringdata("Login", 11, 6), data.getstringdata("Login", 12, 6),
				data.getstringdata("Login", 13, 6), data.getstringdata("Login", 14, 6),
				data.getstringdata("Login", 15, 6),		
				data.getstringdata("Login", 16, 6),data.getstringdata("Login", 17, 6),
				data.getstringdata("Login", 18, 6),data.getstringdata("Login", 19, 6),
				data.getstringdata("Login", 20, 6),data.getstringdata("Login", 21, 6),
				data.getstringdata("Login", 22, 6),data.getstringdata("Login", 23, 6),
				data.getstringdata("Login", 24, 6),data.getstringdata("Login", 25, 6),
				data.getstringdata("Login", 26, 6),data.getstringdata("Login", 27, 6),
				
				data.getstringdata("Login", 28, 6),data.getstringdata("Login", 29, 6),
				data.getstringdata("Login", 30, 6),data.getstringdata("Login", 31, 6));

		Group_Administration Group_Administration = PageFactory.initElements(driver, Group_Administration.class);
		Group_Administration.GroupAdministration(data.getstringdata("Login", 1, 4), data.getstringdata("Login", 2, 4),
				data.getstringdata("Login", 3, 4), data.getstringdata("Login", 4, 4), data.getstringdata("Login", 5, 4),
				data.getstringdata("Login", 6, 4), data.getstringdata("Login", 7, 4),
				data.getstringdata("Login", 8 ,4),
				data.getstringdata("Login", 9 ,4),
				data.getstringdata("Login", 10 ,4),
				data.getstringdata("Login", 11 ,4),
				data.getstringdata("Login", 12 ,4),
				data.getstringdata("Login", 13 ,4),
				data.getstringdata("Login", 14 ,4),
				data.getstringdata("Login", 15 ,4),
				data.getstringdata("Login", 16 ,4),
				data.getstringdata("Login", 17 ,4));
				
				
				

		COBRA_Coverage COBRA_Coverage = PageFactory.initElements(driver, COBRA_Coverage.class);
		COBRA_Coverage.COBRA_Coverage1(data.getstringdata("Login", 0, 1),data.getstringdata("Login", 0, 1));
		BrokerGeneralAgentInformation BrokerGeneral_AgentInformation = PageFactory.initElements(driver,
				BrokerGeneralAgentInformation.class);
		BrokerGeneral_AgentInformation.BrokerGeneral_AgentInformation(data.getstringdata("Login", 1, 5),
				data.getstringdata("Login", 2, 5), data.getstringdata("Login", 3, 5), 
				data.getstringdata("Login", 4, 5),
				data.getstringdata("Login", 5, 5),
				data.getstringdata("Login", 6, 5),
				data.getstringdata("Login", 7, 5));

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
//		
//payment bypass
		Thread.sleep(15000);
		PEGA_SMG_Process PEGA_SMG_Process=PageFactory.initElements(driver, PEGA_SMG_Process.class);
		PEGA_SMG_Process.Payment_Bypass();
		
	//PEGA Submission

			PEGA_SMG_Process.HFIC_Manager_Login(data.getstringdata("Pega", 0, 0),
					data.getstringdata("Pega", 0, 1),
					Agreement.appnum,
					data.getstringdata("Pega", 0, 2));
			
			PEGA_SMG_Process.HFIC_Superuser_login(data.getstringdata("Pega", 1, 0),
					data.getstringdata("Pega", 1, 1), 
					Agreement.appnum);
		}
	}

