package HFIC.Testcases.com;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Search;
import Utilities.com.Helper;

public class PEGA_Search extends Baseclass {
//	@Test(priority=1)
//	public void Application_Search_Initial() throws InterruptedException, AWTException {
//		test= extent.createTest("Initial Application Search");
//		Search Search=PageFactory.initElements(driver, Search.class);
//		Search.search_icon();
//		Search.Request_type(1);
//		Search.Application_type(2);
//		Search.Application_status(5);
//		Search.Broker(data.getstringdata("Search", 0, 1));
//		Search.Application_id(data.getstringdata("Search", 1, 1));
//		Search.Transaction_id(data.getstringdata("Search", 2, 1));
//		Search.grpid(data.getstringdata("Search", 3, 1));
//		Search.taxid(data.getstringdata("Search", 4, 1));
//		Search.grpname(data.getstringdata("Search", 5, 1));
//		Search.Subscriber(data.getstringdata("Search", 6, 1));
////		Search.CEFrom();
////		Search.CETo();
////		Search.ARfrom();
////		Search.ARto();
//		Search.search_Button();
//		Search.search_result();
//		Helper.Handle_Window();
//
//	}
//	@Test(priority=2)
//	public void Application_Search_Maintenance() throws InterruptedException, AWTException {
//		test= extent.createTest("Maintenance Application Search");
//
//		Search Search=PageFactory.initElements(driver, Search.class);
//		Search.search_icon();
//		Search.Request_type(2);
//		Search.Application_type(2);
//		Search.Application_status(5);
//		Search.Broker(data.getstringdata("Search", 0, 4));
//		Search.Application_id(data.getstringdata("Search", 1, 4));
//		Search.Transaction_id(data.getstringdata("Search", 2, 4));
//		Search.grpid(data.getstringdata("Search", 3, 4));
//		Search.taxid(data.getstringdata("Search", 4, 4));
//		Search.grpname(data.getstringdata("Search", 5, 4));
//		Search.Subscriber(data.getstringdata("Search", 6, 4));
////		Search.CEFrom();
////		Search.CETo();
////		Search.ARfrom();
////		Search.ARto();
//		Search.search_Button();
//		Search.search_result();
//		Helper.Handle_Window();
//	}
//	
//	@Test(priority=3)
//	public void Application_Search_Active_Renewal() throws InterruptedException, AWTException {
//		test= extent.createTest("Active Renewal Application Search");
//
//		Search Search=PageFactory.initElements(driver, Search.class);
//		Search.search_icon();
//		Search.Request_type(3);
//		Search.Application_type(2);
//		Search.Application_status(5);
//		//Search.Broker(data.getstringdata("Search", 0, 7));
//		Search.Application_id(data.getstringdata("Search", 1, 7));
//		Search.Transaction_id(data.getstringdata("Search", 2, 7));
//		Search.grpid(data.getstringdata("Search", 3, 7));
//		Search.taxid(data.getstringdata("Search", 4, 7));
//		Search.grpname(data.getstringdata("Search", 5, 7));
//		Search.Subscriber(data.getstringdata("Search", 6, 7));
////		Search.CEFrom();
////		Search.CETo();
////		Search.ARfrom();
////		Search.ARto();
//		Search.search_Button();
//		Search.search_result();
//		Helper.Handle_Window();
//	}
	@Test(priority=4)
	public void HFIC_TASK_Search() throws InterruptedException {
		test= extent.createTest("HFIC  Task  Search");

		Search Search=PageFactory.initElements(driver, Search.class);
		Search.search_icon();
		Search.HFIC_TaskSearch_TAB();
		for (int i=1 ;i<10;i++){
			Search.Task_Search_Type(i);

			if(i==1) {
				for (int j=1; j>3;j++) {
					for(int k=1;k>3;k++) {
				
				Search.billing_task_status(j);
				Search.billing_elog_type(k);
				}	
				}
			}else if(i==8) 
			{
				i=9;
			} 
			
//		Search.billing_task_id1(data.getstringdata("Search", i, 9));
//		Search.billing_Transcation_id1(data.getstringdata("Search", i, 9));
//		Search.billing_Group_id1(data.getstringdata("Search", i, 9));
//		Search.billing_Account_num1(data.getstringdata("Search", i, 9));
		Search.Task_Search();
		Search.Elog_Search_Result();
		Helper.Handle_Window();
		}
		
	}

}
