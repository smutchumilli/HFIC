package HFIC.Testcases.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.Search;

public class PEGA_Search extends Baseclass {
	@Test
	public void Application_Search_Initial() throws InterruptedException {
		
		Search Search=PageFactory.initElements(driver, Search.class);
		Search.search_icon();
		Search.Request_type();
		Search.Application_type();
		Search.Application_status();
		Search.Broker(data.getstringdata("Search", 0, 1));
		Search.Application_id(data.getstringdata("Search", 1, 1));
		Search.Transaction_id(data.getstringdata("Search", 2, 1));
		Search.grpid(data.getstringdata("Search", 3, 1));
		Search.taxid(data.getstringdata("Search", 4, 1));
		Search.grpname(data.getstringdata("Search", 5, 1));
		Search.Subscriber(data.getstringdata("Search", 6, 1));
		Search.CEFrom();
		Search.CETo();
//		Search.ARfrom(data.getstringdata("Search", 9, 1));
//		Search.ARto(data.getstringdata("Search", 10, 1));
		Search.search_Button();
		Search.search_result();
	}

}
