package HFIC.Testcases.com;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;

public class tets extends Baseclass {
	@Test
	public void test12() {
	JavascriptExecutor js=(JavascriptExecutor)driver; 

    js.executeScript("window.scrollBy(0,500)");
	}

}
