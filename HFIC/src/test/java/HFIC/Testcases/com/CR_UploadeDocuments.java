package HFIC.Testcases.com;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_Uplodedocuments;

public class CR_UploadeDocuments extends Baseclass {
	@Test
	public void CR_UploadeDocument() throws InterruptedException, AWTException {
		
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments=PageFactory.initElements(driver, ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument(
				(data.getstringdata("CR", 0, 0)),
				(data.getstringdata("CR", 0, 1)), 
				(data.getstringdata("CR", 0, 2)), 
				(data.getstringdata("CR", 0, 3)), 
				(data.getstringdata("CR", 0, 5)));
}

}
