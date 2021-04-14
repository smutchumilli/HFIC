package HFIC.Testcases.com;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.aventstack.extentreports.MediaEntityBuilder;
import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Search;
import Utilities.com.Helper;

public class PEGA_Search extends Baseclass {
	@Test(priority = 1)
	public void HFIC_Initial_Application_Search() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("HFIC Initial Application Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		for (int i = 1; i <= 8; i++) {
			Search.HFIC_App_Search(1, 2, 5, data.getstringdata("Search", i, 0), data.getstringdata("Search", i, 1),
					data.getstringdata("Search", i, 2), data.getstringdata("Search", i, 3),
					data.getstringdata("Search", i, 4), data.getstringdata("Search", i, 5),
					data.getstringdata("Search", i, 6));
			test.info(data.getstringdata("Search", i, 7));
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}
	@Test(priority = 2)
	public void HFIC_Maintenance_Application_Search() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("HFIC Maintenance Application Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		Thread.sleep(2000);
		for (int i = 9; i <= 16; i++) {

			Search.HFIC_App_Search(2, 2, 5, data.getstringdata("Search", i, 0), data.getstringdata("Search", i, 1),
					data.getstringdata("Search", i, 2), data.getstringdata("Search", i, 3),
					data.getstringdata("Search", i, 4), data.getstringdata("Search", i, 5),
					data.getstringdata("Search", i, 6));
			test.info(data.getstringdata("Search", i, 7));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		
	}
	}
	@Test(priority = 3)
	public void HFIC_Renewal_Application_Search() throws InterruptedException, IOException, AWTException {
		test = extent.createTest("HFIC Renewal Application Search");
		Search Search = PageFactory.initElements(driver, Search.class);
	
		Thread.sleep(2000);
		for (int i = 17; i <= 24; i++) {

			Search.HFIC_App_Search(3, 2, 5, data.getstringdata("Search", i, 0), data.getstringdata("Search", i, 1),
					data.getstringdata("Search", i, 2), data.getstringdata("Search", i, 3),
					data.getstringdata("Search", i, 4), data.getstringdata("Search", i, 5),
					data.getstringdata("Search", i, 6));
			test.info(data.getstringdata("Search", i, 7));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
	}

	@Test(priority = 4)
	public void Task_B_Search() throws IOException, InterruptedException, AWTException {
		Thread.sleep(2000);

		test = extent.createTest("HFIC Billing Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 1; i <= 4; i++) {
			Search.HFIC_BTask_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2), data.getstringdata("Task", i, 3));
			test.info(data.getstringdata("Task", i, 4));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 5)
	public void Task_M_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC Membership Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 7; i <= 10; i++) {
			Search.HFIC_MTask_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2));
			test.info(data.getstringdata("Task", i, 3));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 6)
	public void Task_G_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC Group Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 13; i <= 11; i++) {
			Search.HFIC_GTask_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2));
			test.info(data.getstringdata("Task", i, 3));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 7)
	public void Task_Payment_Exception_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC Payment Exception Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 17; i <= 19; i++) {
			Search.HFIC_Paymentexcetion_Task_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1));
			test.info(data.getstringdata("Task", i, 2));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 8)
	public void Task_COBTask_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC COB  Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 21; i <= 25; i++) {
			Search.HFIC_COB_Task_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2), data.getstringdata("Task", i, 3));
			test.info(data.getstringdata("Task", i, 4));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 9)
	public void Task_QLETrack_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC QLE  Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		for (int i = 28; i <= 32; i++) {
			Search.HFIC_QLE_Tracking_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2), data.getstringdata("Task", i, 3));
			test.info(data.getstringdata("Task", i, 4));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 10)
	public void Task_Presumptive_Search() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HFIC Presumptive  Task Search");
		Search Search = PageFactory.initElements(driver, Search.class);
		for (int i = 35; i <= 40; i++) {
			Search.HFIC_Presumptive_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2), data.getstringdata("Task", i, 3));
			test.info(data.getstringdata("Task", i, 4));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}

	@Test(priority = 11)
	public void HP_Group_Task_Serach() throws IOException, InterruptedException, AWTException {
		test = extent.createTest("HP Group  Task Search");
				Search Search = PageFactory.initElements(driver, Search.class);
		for (int i = 48; i <= 51; i++) {
			Search.HP_GroupTask_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2));
			test.info(data.getstringdata("Task", i, 3));

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}
	}
		@Test(priority = 12)
		public void HP_Reconciliation_Task_Serach() throws IOException, InterruptedException, AWTException {
			test = extent.createTest("HP Reconciliation  Task Search");
			Search Search = PageFactory.initElements(driver, Search.class);	
			for (int i = 54; i <= 59; i++) {

			Search.HP_Reconciliation_Search(data.getstringdata("Task", i, 0), data.getstringdata("Task", i, 1),
					data.getstringdata("Task", i, 2), data.getstringdata("Task", i, 3),
					data.getstringdata("Task", i, 4));
			test.info(data.getstringdata("Task", i, 5));

		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
		}

	}
	
}
