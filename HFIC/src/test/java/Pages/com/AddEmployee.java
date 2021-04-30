package Pages.com;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AddEmployee {
	WebDriver driver;
	public AddEmployee(WebDriver driver){
		this.driver=driver;
	}
	

	@FindBy(xpath="//*[contains(text(),'Drag and drop the completed spreadsheet or')]//following::label[1]") WebElement dragdropzone;
	@FindBy(className="hf-application-roster-continue-btn") WebElement cnt;
	@FindBy(id="premiumPopupCloseBtn") WebElement premiumPopupCloseBtn;
	@FindBy(xpath="//*[@class='hf-go-back-btn']//following::a[1]") WebElement link;
	@FindBy(xpath="//input[@type='file']") WebElement file;

	

	public void Add_Emp() throws InterruptedException, AWTException{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("scroll(0,400)");
		Thread.sleep(3000);
		file.sendKeys("C:\\Users\\smutchumilli\\git\\HFIC\\HFIC\\TestData\\Emp.csv");

			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView(true);",cnt);
			Thread.sleep(3000);
			cnt.click();
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", premiumPopupCloseBtn);

			} 
		


	

}
