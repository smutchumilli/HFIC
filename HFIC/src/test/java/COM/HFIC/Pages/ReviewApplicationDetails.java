package COM.HFIC.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewApplicationDetails {
	public WebDriver driver;

	public ReviewApplicationDetails(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "button.hf-submit-enrollment-btn")
	WebElement conti;

	public void Review_ApplicationDetails() throws InterruptedException {
		
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", conti);
		Thread.sleep(2000);

		conti.click();
		Thread.sleep(2000);
	}
}