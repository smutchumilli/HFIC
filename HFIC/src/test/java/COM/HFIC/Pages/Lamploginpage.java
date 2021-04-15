package COM.HFIC.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Lamploginpage {
	WebDriver driver;
	public Lamploginpage(WebDriver driver){
		this.driver= driver;
	}
	@FindBy(name="username")@CacheLookup  WebElement username;
	@FindBy(name="npn-tax-id")@CacheLookup  WebElement npn;
	@FindBy(name="password")@CacheLookup  WebElement password;

public void login_to_Lamp(String user_name,String NPN,String pass_word ){
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
		
	}
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	username.sendKeys(user_name);
	npn.sendKeys(NPN);
	password.sendKeys(pass_word);
	WebElement SignIn= driver.findElement(By.xpath("//*[@id='login-wrapper']/div[7]/div[1]/div/div/div[5]/button"));
	js.executeScript("arguments[0].click();", SignIn);
}
}
