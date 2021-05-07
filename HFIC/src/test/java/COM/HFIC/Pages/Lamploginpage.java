package COM.HFIC.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
import Utilities.com.Helper;
import Utilities.com.TestDataProvider;

public class Lamploginpage extends Baseclass{
	//WebDriver driver;
	public Lamploginpage(WebDriver driver){
		this.driver= driver;
	}
	
	public TestDataProvider data ;

	@FindBy(name="username")@CacheLookup  WebElement username;
	@FindBy(name="npn-tax-id")@CacheLookup  WebElement npn;
	@FindBy(name="password")@CacheLookup  WebElement password;

public void login_to_Lamp( ) throws IOException{
	


	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
		
	}
	
	data= new TestDataProvider();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	username.sendKeys(data.getstringdata("Login", 0, 0));
	npn.sendKeys(data.getstringdata("Login", 1, 0));
	password.sendKeys(data.getstringdata("Login", 2, 0));
	WebElement SignIn= driver.findElement(By.xpath("//*[@id='login-wrapper']/div[7]/div[1]/div/div/div[5]/button"));
	js.executeScript("arguments[0].click();", SignIn);
	test.log( Status.INFO," Entered Valid GA user id and password and NPN and clicked on signin button");
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

}
}
