package COM.HFIC.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewApplicationDetails {
	public WebDriver driver;
	public ReviewApplicationDetails(WebDriver driver){
		this.driver=driver;
	}
@FindBy(className="hf-submit-enrollment-btn") WebElement conti;


public void Review_ApplicationDetails(){
	conti.click();
}
}