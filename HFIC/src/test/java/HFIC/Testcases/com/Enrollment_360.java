package HFIC.Testcases.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Enrollment360;

public class Enrollment_360 extends Baseclass {
	@Test
	public void HFIC_Valid_GRPSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 Valid HFIC Group Search");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
		test.info("Search results are diplaying as expected");
		Enrollment360.Search();
		Enrollment360.HFIC_Searchresult();

		

	}
	@Test
	public void HFIC_InValid_GRPnumSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 in correct Group Number");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 5));
		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
		Enrollment360.Search();
		test.info("error message is succssfully validated");
		Enrollment360.verification();
		

	}
	
	@Test
	public void HFIC_InValid_GRPnameSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 in correct Group name");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 6));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
			Enrollment360.Search();
			test.info("error message is succssfully validated");

		Enrollment360.verification();
		

	}
	@Test
	public void HFIC_InValid_effdateSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 in correct Group Effective date");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 7));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
			Enrollment360.Search();
			test.info("error message is succssfully validated");

		Enrollment360.verification();
		

	}
	@Test
	public void HFIC_InValid_taxSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 in correct Tax ID");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 8));
		Enrollment360.Search();
		test.info("error message is succssfully validated");

		Enrollment360.verification();
		

	}
	@Test
	public void HP_Group_Search() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 Valid HP Group Search");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.hpassradiobutton();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 3, 5));
		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 3, 6));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 3, 7));
		Enrollment360.Search();
		Enrollment360.HP_Searchresult();
		

	}
	@Test
	public void HP_invalid_Group_Healthpass_Group_ID_Search() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 HP_invalid_Group_Healthpass_Group_ID_Search");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.hpassradiobutton();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 3, 5));
		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 0, 6));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 3, 7));
		Enrollment360.Search();
		Enrollment360.verification();
		

	}
	@Test
	public void HP_invalid_Group_Eff_Search() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 Valid HP invalid Group Number Search");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.hpassradiobutton();
		Enrollment360.groupnum(data.getstringdata("Enroll360", 3, 5));
		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 3, 6));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 7));
		Enrollment360.Search();
		Enrollment360.verification();
		

	}
	
	@Test
	public void VALIDHFICMember360() throws InterruptedException {
		test=extent.createTest("Enrollment 360 Valid HFIC  Member Search");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 9));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 10));
		Enrollment360.Member_Search();
		Enrollment360.member_Search_Result();
	}
	@Test
	public void InvalidHFICMember360() throws InterruptedException {
		test=extent.createTest("Enrollment 360 inValid HFIC  Member Search");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 12));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 10));
		Enrollment360.Member_Search();
		Enrollment360.merror();
	}
	@Test
	public void InvalidHFICMembereffectdate() throws InterruptedException {
		test=extent.createTest("Enrollment 360 inValid HFIC  Member effective dateSearch");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 9));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 13));
		Enrollment360.Member_Search();
		Enrollment360.merror();
	}
	
	@Test
	public void VALIDHPMember360() throws InterruptedException {
		test=extent.createTest("Enrollment 360 Valid HP  Member Search");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 15));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 16));
		Enrollment360.Member_Search();
		Enrollment360.member_Search_Result();
	}
	@Test
	public void InvalidHPMember360() throws InterruptedException {
		test=extent.createTest("Enrollment 360 inValid HP  Member Search");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 12));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 16));
		Enrollment360.Member_Search();
		Enrollment360.merror();
	}
	@Test
	public void InvalidHPMembereffectdate() throws InterruptedException {
		test=extent.createTest("Enrollment 360 inValid HFINDA  Member effective dateSearch");
		test.log(Status.INFO, "Member  details are entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 15));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 13));
		Enrollment360.Member_Search();
		Enrollment360.merror();
	}
//	@Test
//	public void VALIDHFINDAMember360() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 Valid HFINDA  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 15));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 16));
//		Enrollment360.Member_Search();
//		Enrollment360.member_Search_Result();
//	}
//	@Test
//	public void InvalidHFINDAMember360() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFINDA  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 12));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 16));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}
//	@Test
//	public void InvalidHFINDAMembereffectdate() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member effective dateSearch");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 0, 15));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 0, 13));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}

}
