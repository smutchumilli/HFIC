package COM.HFIC.Pages;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Utilities.com.Helper;



public class Lamp_Homepage extends Baseclass {
	
	//WebDriver driver;
	public Lamp_Homepage(WebDriver driver){
		this.driver=driver;
	}

@FindBy(xpath="//a[contains(text(),'Applications')]") WebElement App_tab;
@FindBy(xpath="//*[contains(@class,'hf-start-new-application-btn')]") WebElement Start_Application;

public void LampHomepage() throws IOException{
	test.log( Status.INFO,"Clicking on Application tab and click on start aplication");

	JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", App_tab);
	js1.executeScript("arguments[0].click();", Start_Application);

}

}
