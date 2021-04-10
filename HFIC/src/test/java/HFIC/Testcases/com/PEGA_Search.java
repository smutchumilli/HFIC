package HFIC.Testcases.com;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Search;
import Utilities.com.Helper;

public class PEGA_Search  extends Baseclass {
	@Test
	public void Application_Search() throws InterruptedException, IOException {
		test=extent.createTest("HFIC Application Search");
		Search Search=PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
for(int i=1;i<=8;i++) {
		Search.HFIC_App_Search(1, 2, 5, 
				data.getstringdata("Search", i, 0),
				data.getstringdata("Search", i, 1), 
				data.getstringdata("Search", i, 2), 
				data.getstringdata("Search", i, 3), 
				data.getstringdata("Search", i, 4), 
				data.getstringdata("Search", i, 5), 
				data.getstringdata("Search", i, 6));
	}
	

}
}
