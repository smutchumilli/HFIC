package HFIC.Testcases.com;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_HSA;
import Utilities.com.Helper;

public class CR_UpdateHSA_Group_Member extends Baseclass {
	@Test(priority=1)
	public void CR_HSA_Member_update() throws InterruptedException, AWTException, IOException {

		ChangeRequest_HSA ChangeRequest_HSA = PageFactory.initElements(driver,
				ChangeRequest_HSA.class);
		for(int i=1;i<=1;i++) {

			test = extent.createTest(data.getstringdata("HSA",i,1));
			test.info(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		ChangeRequest_HSA.HSA_Member_Update(
				data.getstringdata("HSA",i,2), 
				data.getstringdata("HSA",i,7), 
				data.getstringdata("HSA",i,8), 
				data.getstringdata("HSA",i,9),
				data.getstringdata("HSA",i,10), 
				data.getstringdata("HSA",i,11),
				data.getstringdata("HSA",i,12),data.getstringdata("HSA",i,13)); 
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		ChangeRequest_HSA.submit();
				}			
	}	
	@Test(priority=2)
	public void CR_HSA_Group_update() throws InterruptedException, AWTException, IOException {

		ChangeRequest_HSA ChangeRequest_HSA = PageFactory.initElements(driver,
				ChangeRequest_HSA.class);
		for(int i=6;i<7;i++) {
			test = extent.createTest(data.getstringdata("HSA",i,1));

			test.info(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

			ChangeRequest_HSA.HSA_Group_Update(
					data.getstringdata("HSA",i,2), 
					data.getstringdata("HSA",i,3), 
					data.getstringdata("HSA",i,4), 
					data.getstringdata("HSA",i,5),
					data.getstringdata("HSA",i,6), 
					data.getstringdata("HSA",i,7),
					data.getstringdata("HSA",i,8),
					data.getstringdata("HSA",i,9),data.getstringdata("HSA",i,10)); 
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
			ChangeRequest_HSA.submit();

				}			
	}
	}