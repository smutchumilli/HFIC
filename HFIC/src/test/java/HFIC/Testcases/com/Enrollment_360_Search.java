package HFIC.Testcases.com;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Pages.com.Enrollment360;
import Utilities.com.Helper;

public class Enrollment_360_Search extends Baseclass {
	@Test(priority=1)
	public void HFIC_Group_Number_Search() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		test=extent.createTest("Enrollment 360 group Search");
		for(int i=3;i<=4;i++) {
		test.info(data.getstringdata("Enroll360", i, 0));
		Enrollment360.HFIC_Group_Search_Method((data.getstringdata("Enroll360", i, 1)),
		(data.getstringdata("Enroll360", i, 2)),
		(data.getstringdata("Enroll360", i, 3)),
		(data.getstringdata("Enroll360", i, 4)));
		test.info(" Group Search completed, Please find the below screenshot for your reference");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}	
	}

@Test(priority=2)
	public void HP_Group_Search() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		test=extent.createTest("HealthPass Group Search");
		for(int i=0;i<=3;i++) {
		test.info(data.getstringdata("Enroll360", i, 5));
		Enrollment360.Hp_Group_Search_Method(
		(data.getstringdata("Enroll360", i, 6)),
		(data.getstringdata("Enroll360", i, 7)),
		(data.getstringdata("Enroll360", i, 8)));
		test.info(" Member Search completed, Please find the below screenshot for your reference");

		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
}

@Test(priority=3)
	public void MemberSearch() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		test=extent.createTest("HFIC and HP Member Search");
		for(int i=0;i<=5;i++) {
		test.info(data.getstringdata("Enroll360",i, 9));
		Enrollment360.HFIC_HP_Member_Search_Method(
		(data.getstringdata("Enroll360", i, 10)),
		(data.getstringdata("Enroll360", i, 11)));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	}
	}
	@Test(priority=4)
	public void Member_Search_Otherinfo() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		test=extent.createTest("Enrollment 360 HFIC and Healthpass Other Member details Search");
		for(int i=0;i<=7;i++) {
			test.info(data.getstringdata("Enroll360",i, 12));
		Enrollment360.HFIC_HP_Member_Detail_Search_Method(
		(data.getstringdata("Enroll360", i, 13)),
		(data.getstringdata("Enroll360", i, 14)),
		(data.getstringdata("Enroll360", i, 15)),
		(data.getstringdata("Enroll360", i, 16)));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}		
	}
}
