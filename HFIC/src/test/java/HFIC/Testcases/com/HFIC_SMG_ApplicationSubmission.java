package HFIC.Testcases.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.HFIC_SigninPage;

public class HFIC_SMG_ApplicationSubmission extends Baseclass {
	@Test
	public void HFIC_ApplicationSubmission() throws InterruptedException {
		//This is Test
		extent.createTest("MyFirstTest");
	
		HFIC_SigninPage HFIC_SigninPage=PageFactory.initElements(driver, HFIC_SigninPage.class);
		HFIC_SigninPage.HFIC_Login("srikanth@get365.tk", "659828", "Passw0rd#12");
		test.pass("Login to HFIC Application is success");
		test.log(Status.PASS, "Login to HFIC Application is success");

	}

}
