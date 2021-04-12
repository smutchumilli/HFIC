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
	for(int i=1;i<=8;i++)
			{
				Search.HFIC_App_Search(1,2, 5,data.getstringdata("Search", i, 0),
				data.getstringdata("Search", i, 1),
				data.getstringdata("Search", i, 2), 
				data.getstringdata("Search", i, 3), 
				data.getstringdata("Search", i, 4), 
				data.getstringdata("Search", i, 5), 
				data.getstringdata("Search", i, 6)); 
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
			}
		Thread.sleep(2000);
		for(int i=9;i<=16;i++) {
		Search.HFIC_App_Search(2, 2, 5, 
				data.getstringdata("Search", i, 0),
				data.getstringdata("Search", i, 1), 
				data.getstringdata("Search", i, 2), 
				data.getstringdata("Search", i, 3), 
				data.getstringdata("Search", i, 4), 
				data.getstringdata("Search", i, 5), 
				data.getstringdata("Search", i, 6));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
}	
		Thread.sleep(2000);
		for(int i=17;i<=24;i++) {
		Search.HFIC_App_Search(3, 2, 5, 
				data.getstringdata("Search", i, 0),
				data.getstringdata("Search", i, 1), 
				data.getstringdata("Search", i, 2), 
				data.getstringdata("Search", i, 3), 
				data.getstringdata("Search", i, 4), 
				data.getstringdata("Search", i, 5), 
				data.getstringdata("Search", i, 6));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
}	
		Thread.sleep(2000);
}
	@Test
	public void Task_B_Search() throws IOException, InterruptedException {
		test=extent.createTest("HFIC Billing Task Search");
		Search Search=PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i=1;i<=5;i++) {
		Search.HFIC_Task_Search(data.getstringdata("Task", i, 0),
				data.getstringdata("Task", i, 1),
				data.getstringdata("Task", i, 2),
				data.getstringdata("Task", i, 3));
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}	
	@Test
	public void Task_M_Search() throws IOException, InterruptedException {
		test=extent.createTest("HFIC Membership Task Search");
		Search Search=PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i=7;i<=10;i++) {
		Search.HFIC_MTask_Search(data.getstringdata("Task", i, 0),
				data.getstringdata("Task", i, 1),
				data.getstringdata("Task", i, 2));
				
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}
	
@Test
public void Task_G_Search() throws IOException, InterruptedException {
	test=extent.createTest("HFIC Group Task Search");
	Search Search=PageFactory.initElements(driver, Search.class);
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	for (int i=13;i<=15;i++) {
	Search.HFIC_GTask_Search(
			data.getstringdata("Task", i, 0),
			data.getstringdata("Task", i, 1),
			data.getstringdata("Task", i, 2));
			
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	}
}
@Test
public void Task_Payment_Exception_Search() throws IOException, InterruptedException {
	test=extent.createTest("HFIC payment Exception Task Search");
	Search Search=PageFactory.initElements(driver, Search.class);
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	for (int i=17;i<=19;i++) {
	Search.HFIC_Paymentexcetion_Task_Search(data.getstringdata("Task", i, 0),data.getstringdata("Task", i, 1));
		//	data.getstringdata("Task", i, 2));
			
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	}
}
}
