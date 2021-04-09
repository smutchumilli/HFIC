package HFIC.Testcases.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Enrollment360;

public class Enrollment_360 extends Baseclass {
	
	@Test(priority=1)
	public void HFIC_InValid_GRPnumSearch() throws InterruptedException {
		
		test=extent.createTest("Enrollment 360 HFIC invalid  Group Number Search");
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		for(int i=0;i<5;i++) {
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", i, 0));
		Enrollment360.Grpname(data.getstringdata("Enroll360", i, 1));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", i, 2));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", i, 3));
		Enrollment360.Search();
		test.info("error message is succssfully validated");
		//Enrollment360.verification();
		}	
		}
	
	
//	@Test(priority=2)
//	public void HFIC_InValid_GRPnameSearch() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 HFIC invalid Group name Search");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
//		Enrollment360.Grpname(data.getstringdata("Enroll360", 5, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
//		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
//			Enrollment360.Search();
//			test.info("error message is succssfully validated");
//
//		Enrollment360.verification();
//		
//
//	}
//	@Test(priority=3)
//	public void HFIC_InValid_EffdateSearch() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 HFIC  incorrect Group Effective date");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
//		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 5, 2));
//		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
//			Enrollment360.Search();
//			test.info("error message is succssfully validated");
//
//		Enrollment360.verification();
//		
//
//	}
//	@Test(priority=4)
//	public void HFIC_InValid_taxSearch() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 HFIC incorrect Tax ID");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
//		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
//		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 5, 3));
//		Enrollment360.Search();
//		test.info("error message is succssfully validated");
//
//		Enrollment360.verification();
//		
//
//	}
//	@Test(priority=5)
//	public void HFIC_Valid_GRPSearch() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 HFIC_Valid_GRPSearch");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 0, 0));
//		Enrollment360.Grpname(data.getstringdata("Enroll360", 0, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 0, 2));
//		Enrollment360.Grptaxid(data.getstringdata("Enroll360", 0, 3));
//		test.info("Search results are diplaying as expected");
//		Enrollment360.Search();
//		Enrollment360.HFIC_Searchresult();
//		Enrollment360.Homepage();
//
//		
//
//	}
//
//	@Test(priority=5)
//	public void invalid_Group_Healthpass_Group_ID_Search() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 Invalid_Group_Healthpass_Group_ID_Search");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.hpassradiobutton();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 7, 0));
//		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 5, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 7, 2));
//		Enrollment360.Search();
//		Enrollment360.verification();
//		
//
//	}
//	@Test(priority=6)
//	public void HP_invalid_Group_Eff_Search() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360   invalid HP Group Effdate Search");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.hpassradiobutton();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 7, 0));
//		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 7, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 5, 2));
//		Enrollment360.Search();
//		Enrollment360.verification();
//		
//
//	}
//	@Test(priority=7)
//	public void HP_Group_Search() throws InterruptedException {
//		
//		test=extent.createTest("Enrollment 360 Valid HP Group Search");
//		test.log(Status.INFO, "Group details entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.hpassradiobutton();
//		Enrollment360.groupnum(data.getstringdata("Enroll360", 7, 0));
//		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", 7, 1));
//		Enrollment360.grp_eff(data.getstringdata("Enroll360", 7, 2));
//		Enrollment360.Search();
//		Enrollment360.HP_Searchresult();
//
//}
//	
//	
//	@Test(priority=8)
//	public void InvalidHFICMember360() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 22, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 13, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}
//	@Test(priority=9)
//	public void InvalidHFICMembereffectdate() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member effective dateSearch");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 13, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 22, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}
//	@Test(priority=10)
//	public void ValidHFIC_MemberSearch() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 Valid HFIC  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 13, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 13, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.member_Search_Result();
//	}
//	@Test(priority=11)
//	public void InvalidHPMembereffectdate() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member effective dateSearch");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 26, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 22, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}
//	
//
//	@Test(priority=12)
//	public void InvalidHPMember360() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 22, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 26, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//	}
//	@Test(priority=13)
//	public void Valid_HP_MemberSearch() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 Valid HP  Member Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", 26, 0));
//		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", 26, 1));
//		Enrollment360.Member_Search();
//		Enrollment360.member_Search_Result();
//	}
//	
//	@Test(priority=14)
//	public void OMI_Invalid_Fname() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member first name Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 22, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 13, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 13, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 13, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}
//	@Test(priority=15)
//	public void OMI_Invalid_Lname() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member Last name Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 13, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 22, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 13, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 13, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=16)
//	public void OMI_Invalid_DOB() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member DOB  Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 13, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 13, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 22, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 13, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=17)
//	public void OMI_Invalid_SSN() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member SSN Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 13, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 13, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 13, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 22, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=18)
//	public void OMI_valid_MemberSearch() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HFIC  Member first name Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 13, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 13, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 13, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 13, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.member_Search_Result();;
//		
//	}
//	
//	@Test(priority=19)
//	public void OMI_Invalid_HP_Fname() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member first name Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 22, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 26, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 26, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 26, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}
//	@Test(priority=20)
//	public void OMI_Invalid_HP_Lname() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member Last name Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 26, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 22, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 26, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 26, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=21)
//	public void OMI_Invalid_HP_DOB() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member DOB  Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 26, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 26, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 22, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 26, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=22)
//	public void OMI_Invalid_HP_SSN() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member SSN Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 26, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 26, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 26, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 22, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.merror();
//		
//	}@Test(priority=23)
//	public void OMI_valid_HP_MemSearch() throws InterruptedException {
//		test=extent.createTest("Enrollment 360 inValid HP  Member  Search");
//		test.log(Status.INFO, "Member  details are entered successfully");
//		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
//		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
//		Enrollment360.Member360_Search();
//		Enrollment360.Member_other_info();
//		Enrollment360.MEM_fname(data.getstringdata("Enroll360", 26, 2));
//		Enrollment360.lanme(data.getstringdata("Enroll360", 26, 3));
//		Enrollment360.DOB(data.getstringdata("Enroll360", 26, 4));
//		Enrollment360.SSN(data.getstringdata("Enroll360", 26, 5));
//		Enrollment360.Member_Search();
//		Enrollment360.member_Search_Result();;
//		
//	}


}
