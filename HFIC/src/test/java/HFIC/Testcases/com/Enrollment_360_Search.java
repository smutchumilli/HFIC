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
	@Test
	public void HFIC_Group_Number_Search() throws InterruptedException, IOException {
		Enrollment360 Enrollment360 = PageFactory.initElements(driver,Enrollment360.class);
		test=extent.createTest("Enrollment 360 group Search");
		Enrollment360.HFIC_Group_Search_Method();
		Enrollment360.Hp_Group_Search_Method();	
		Enrollment360.HFIC_HP_Member_Search_Method();
		Enrollment360.HFIC_HP_Member_Detail_Search_Method();

}
}

