package HFIC.Testcases.com;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Enrollment360;
import Utilities.com.Helper;

public class Enrollment_360_new extends Baseclass {
	
	@Test(priority=1)
	public void HFIC_Group_Number_Search() throws InterruptedException, IOException {
		
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);

		for(int i=0;i<=4;i++) {
			test=extent.createTest(data.getstringdata("Enroll360", i, 0));

		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.groupnum(data.getstringdata("Enroll360", i, 1));
		Enrollment360.Grpname(data.getstringdata("Enroll360", i, 2));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", i, 3));
		Enrollment360.Grptaxid(data.getstringdata("Enroll360", i, 4));
		Enrollment360.Search();
		test.info(" Group Search completed, Please find the below screenshot for your reference");
		Enrollment360.verification();
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
		
		
	}

	@Test(priority=2)
	public void HP_Group_Search() throws InterruptedException, IOException {
		
		test.log(Status.INFO, "Group details entered successfully");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);

		for(int i=0;i<=3;i++) {
			test=extent.createTest(data.getstringdata("Enroll360", i, 5));

		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.hpassradiobutton();
		Enrollment360.groupnum(data.getstringdata("Enroll360", i, 6));
		Enrollment360.Healthpass_Group_ID(data.getstringdata("Enroll360", i, 7));
		Enrollment360.grp_eff(data.getstringdata("Enroll360", i, 8));
		Enrollment360.Search();
		test.info(" Member Search completed, Please find the below screenshot for your reference");

		Enrollment360.verification();
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
}
	
	
	@Test(priority=3)
	public void MemberSearch() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		for(int i=0;i<=5;i++) {
			test=extent.createTest(data.getstringdata("Enroll360",i, 9));

		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.MHS_MEMBERID(data.getstringdata("Enroll360", i, 10));
		Enrollment360.MHS_Effectivedate(data.getstringdata("Enroll360", i, 11));
		Enrollment360.Member_Search();
		Enrollment360.verification();
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

	}
	}

	
	@Test(priority=4)
	public void Member_Search_Otherinfo() throws InterruptedException, IOException {
		test=extent.createTest("Enrollment 360 HFIC and Healthpass Other Member details Search");
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		for(int i=0;i<=7;i++) {
		test=extent.createTest(data.getstringdata("Enroll360",i, 12));
		Enrollment360.Enrollment360_HFIC_GRP_Member_Search();
		Enrollment360.Member360_Search();
		Enrollment360.Member_other_info();
		Enrollment360.MEM_fname(data.getstringdata("Enroll360", i, 13));
		Enrollment360.lanme(data.getstringdata("Enroll360", i, 14));
		Enrollment360.DOB(data.getstringdata("Enroll360", i, 15));
		Enrollment360.SSN(data.getstringdata("Enroll360", i, 16));
		Enrollment360.Member_Search();
		Enrollment360.verification();
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}		
	}
	

}
