package HFIC.Testcases.com;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_HSA;

public class CR_HSA extends Baseclass {
	@Test
	public void CR_Member_update() throws InterruptedException, AWTException {
		
		test = extent.createTest("Change Request HSA Member");
		ChangeRequest_HSA ChangeRequest_HSA = PageFactory.initElements(driver,
				ChangeRequest_HSA.class);
		
		ChangeRequest_HSA.HSA_MemberUpdate(data.getstringdata("HSA", 0, 0),
				data.getstringdata("HSA", 0, 1), 
				data.getstringdata("HSA", 0, 2), 
//				data.getstringdata("HSA", 0, 3),
//				data.getstringdata("HSA", 1, 3), 
				data.getstringdata("HSA", 2, 3),
				data.getstringdata("HSA", 3, 3),
				data.getstringdata("HSA", 4, 3),
				data.getstringdata("HSA", 5, 3),
				data.getstringdata("HSA", 6, 3),
				data.getstringdata("HSA", 7, 3),
				data.getstringdata("HSA", 8, 3));
	}
		//Group details Update
	@Test
		public void CR_HSA_Groupupdate() throws InterruptedException, AWTException {
			
			test = extent.createTest("Change Request HSA Group");
			ChangeRequest_HSA ChangeRequest_HSA = PageFactory.initElements(driver,
					ChangeRequest_HSA.class);
		ChangeRequest_HSA.HSA_GrpUpdate(data.getstringdata("HSA", 0, 7),
				data.getstringdata("HSA", 0, 8), 
				data.getstringdata("HSA", 0, 9), 
				data.getstringdata("HSA", 0, 11), 
				data.getstringdata("HSA", 1, 11),
				data.getstringdata("HSA", 2, 11), 
				data.getstringdata("HSA", 3, 11), 
				data.getstringdata("HSA", 4, 11), 
				data.getstringdata("HSA", 5, 11), 
				data.getstringdata("HSA", 6, 11), 
				data.getstringdata("HSA", 7, 11));

	}

}