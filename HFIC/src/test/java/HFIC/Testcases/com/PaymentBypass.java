package HFIC.Testcases.com;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.com.Baseclass;
import Pages.com.PEGA_SMG_Process;
@Test
public class PaymentBypass extends Baseclass {
	public void Payment_Bypass() throws InterruptedException, AWTException {
		
		PEGA_SMG_Process PEGA_SMG_Process=PageFactory.initElements(driver, PEGA_SMG_Process.class);
		PEGA_SMG_Process.Payment_Bypass("HFA7394","12345,12","123");
	}

}
