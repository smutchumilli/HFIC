package HFIC.Testcases.com;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Pages.com.ChangeRequest_HSA;
import Utilities.com.Helper;

public class CR_UpdateHSA_Group_Member extends Baseclass {
	@Test
	public void CR_HSA_Member_update() throws InterruptedException, AWTException, IOException {
		test = extent.createTest("HSA Member details update");
		ChangeRequest_HSA ChangeRequest_HSA = PageFactory.initElements(driver,ChangeRequest_HSA.class);
		ChangeRequest_HSA.HSA_Member_Update();
		ChangeRequest_HSA.HSA_Group_Update(); 
			}			
	}
	