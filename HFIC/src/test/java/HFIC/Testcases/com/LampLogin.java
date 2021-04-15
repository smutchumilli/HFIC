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
import HFIC.Pages.com.Baseclass;
import Utilities.com.Helper;

	 
public class LampLogin extends Baseclass  {
	@Test(priority=1)
	public void Lamp_Login() throws InterruptedException, IOException {
		test = extent.createTest("HFIC SMG Enrollment");
		Lamploginpage Lamploginpage= PageFactory.initElements(driver, Lamploginpage.class);
		Lamploginpage.login_to_Lamp(data.getstringdata("Login",0,0),data.getstringdata("Login",1,0),data.getstringdata("Login",2,0));

	}
	@Test(priority=2)
	public void Lamp_Homepage1() throws InterruptedException {
		Lamp_Homepage Lamp_Homepage=PageFactory.initElements(driver, Lamp_Homepage.class);
		Lamp_Homepage.LampHomepage();
	}
	@Test(priority=3)
	public void Get_Quotepage1() throws InterruptedException {
		Get_Quotepage Get_Quotepage=PageFactory.initElements(driver, Get_Quotepage.class);
		Get_Quotepage.GetQuotepage(data.getstringdata("Login",3,0), data.getstringdata("Login",4,0));
	}
	@Test(priority=4)
	public void HealthInsurencePlans1() throws InterruptedException {
		HealthInsurencePlans HealthInsurencePlans=PageFactory.initElements(driver, HealthInsurencePlans.class);
		HealthInsurencePlans.Health_Insurence_Plans();
	}
	@Test(priority=5)
	public void GroupInformationPage1() throws InterruptedException {
		GroupInformationPage GroupInformationPage=PageFactory.initElements(driver, GroupInformationPage.class);
		GroupInformationPage.Group_Information_Page(data.getstringdata("Login",5,0),data.getstringdata("Login",6,0),data.getstringdata("Login",7,0),data.getstringdata("Login",8,0),data.getstringdata("Login",9,0),data.getstringdata("Login",10,0),data.getstringdata("Login",11,0),data.getstringdata("Login",12,0),data.getstringdata("Login",13,0),data.getstringdata("Login",14,0),data.getstringdata("Login",15,0),data.getstringdata("Login",16,0),data.getstringdata("Login",17,0),data.getstringdata("Login",18,0),data.getstringdata("Login",19,0));
	}
	@Test(priority=6)
	public void Group_Administration1() {
		Group_Administration Group_Administration=PageFactory.initElements(driver, Group_Administration.class);
		Group_Administration.GroupAdministration(data.getstringdata("Login",0,1), data.getstringdata("Login",0,1), data.getstringdata("Login",0,1), data.getstringdata("Login",1,1), data.getstringdata("Login",0,1), data.getstringdata("Login",1,1), data.getstringdata("Login",1,1));
	}
	@Test(priority=7)
	public void COBRA_Coverage1() {
		COBRA_Coverage COBRA_Coverage=PageFactory.initElements(driver, COBRA_Coverage.class);
		COBRA_Coverage.COBRACoverage();
	}
	@Test(priority=8)
	public void BrokerGeneral_AgentInformation1() {
		BrokerGeneralAgentInformation BrokerGeneral_AgentInformation=PageFactory.initElements(driver, BrokerGeneralAgentInformation.class);
		BrokerGeneral_AgentInformation.BrokerGeneral_AgentInformation(data.getstringdata("Login",0,2), data.getstringdata("Login",1,2), data.getstringdata("Login",2,2), data.getstringdata("Login",3,2), data.getstringdata("Login",4,2));

	}
	@Test(priority=9)
	public void AddEmployee1() throws InterruptedException, AWTException {
		AddEmployee AddEmployee=PageFactory.initElements(driver, AddEmployee.class);
		AddEmployee.Add_Emp();
		Thread.sleep(45000);
	}
	@Test(priority=10)
	public void Uploaddocument13() throws Exception {
	Uploaddocument Uploaddocument=PageFactory.initElements(driver, Uploaddocument.class);
	Uploaddocument.Document_Upload();
}
	@Test(priority=11)
	public void ReviewApplication_Details() throws InterruptedException  {
		ReviewApplicationDetails ReviewApplicationDetails=PageFactory.initElements(driver, ReviewApplicationDetails.class);
		ReviewApplicationDetails.Review_ApplicationDetails();
	}
		
	@Test(priority=12)
	public void Agreement1() throws InterruptedException  {
		Agreement Agreement=PageFactory.initElements(driver, Agreement.class);
		Agreement.Agreement1(data.getstringdata("Login",20,0), data.getstringdata("Login",21,0), data.getstringdata("Login",22,0), data.getstringdata("Login",23,0), data.getstringdata("Login",24,0),  data.getstringdata("Login",25,0), data.getstringdata("Login",26,0));
	}
}
