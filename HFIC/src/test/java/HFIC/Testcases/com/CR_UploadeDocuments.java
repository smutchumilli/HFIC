package HFIC.Testcases.com;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Pages.com.ChangeRequest_Uplodedocuments;
import Utilities.com.Helper;
public class CR_UploadeDocuments extends Baseclass {
	@Test
	public void CR_Audit_UploadeDocument() throws InterruptedException, AWTException, IOException {
		test = extent.createTest("Change Request Upload Documents Test");
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.Adit_Document_Upload();
		ChangeRequest_Uplodedocuments.Other_Document_Upload();
		}
	}