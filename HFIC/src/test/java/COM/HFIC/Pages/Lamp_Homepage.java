package COM.HFIC.Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Lamp_Homepage {
	
	WebDriver driver;
	public Lamp_Homepage(WebDriver driver){
		this.driver=driver;
	}

@FindBy(xpath="//a[contains(text(),'Applications')]") WebElement App_tab;
@FindBy(xpath="//*[contains(@class,'hf-start-new-application-btn')]") WebElement Start_Application;

public void LampHomepage(){
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", App_tab);
	js1.executeScript("arguments[0].click();", Start_Application);
}

}
