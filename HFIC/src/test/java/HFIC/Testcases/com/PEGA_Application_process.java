package HFIC.Testcases.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.com.Baseclass;
import Pages.com.PEGA_SMG_Process;

public class PEGA_Application_process  extends Baseclass{
@Test
public void PEGA_App_process() throws InterruptedException
{
	
	PEGA_SMG_Process PEGA_SMG_Process=PageFactory.initElements(driver, PEGA_SMG_Process.class);
	PEGA_SMG_Process.HFIC_Manager_Login(data.getstringdata("Pega", 0, 0),
			data.getstringdata("Pega", 0, 1),
			data.getstringdata("Pega", 2, 0),
			data.getstringdata("Pega", 0, 2));
	PEGA_SMG_Process.HFIC_Superuser_login(data.getstringdata("Pega", 1, 0),
			data.getstringdata("Pega", 1, 1), 
			data.getstringdata("Pega", 2, 0));
}

}
