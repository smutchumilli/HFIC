package HFIC.Testcases.com;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_Uplodedocuments;
import Utilities.com.Helper;
public class CR_UploadeDocuments extends Baseclass {
	@Test(priority=1)
	public void CR_Audit_UploadeDocument() throws InterruptedException, AWTException, IOException {
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
		for(int i=1;i<=3;i++) 
		{
		test = extent.createTest(data.getstringdata("CR", i, 0));
		ChangeRequest_Uplodedocuments.CR_Upload_document(data.getstringdata("CR", i, 1), data.getstringdata("CR", i, 2), data.getstringdata("CR", i, 3),data.getstringdata("CR", i, 4), i, data.getstringdata("CR", i, 5));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		ChangeRequest_Uplodedocuments.submit();
		}
	}
	@Test(priority=2)
	public void CR_Other_UploadeDocument() throws InterruptedException, AWTException, IOException {
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
		for(int j=1;j<=5;j++) 
		{
		test = extent.createTest(data.getstringdata("CR", j, 7));
		ChangeRequest_Uplodedocuments.CR_Upload_document_Other(data.getstringdata("CR", j, 8), data.getstringdata("CR", j, 9), data.getstringdata("CR", j, 10),data.getstringdata("CR", j, 11), j, data.getstringdata("CR", j, 13), data.getstringdata("CR", j, 12));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		ChangeRequest_Uplodedocuments.submit();

		}
	}
	

}