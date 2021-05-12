package HFIC.Testcases.com;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.com.Baseclass;
import Pages.com.CR_Mem_add;

public class CR_Member_Add extends Baseclass {
	@Test
	public void Memberadd() throws IOException, InterruptedException {
		test=extent.createTest("Change Request Member Add");
		CR_Mem_add CR_Mem_add=PageFactory.initElements(driver, CR_Mem_add.class);
		CR_Mem_add.Add_Member();
		
	}

}
