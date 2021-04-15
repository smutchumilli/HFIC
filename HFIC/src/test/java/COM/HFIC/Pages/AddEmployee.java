package COM.HFIC.Pages;

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
import org.openqa.selenium.support.FindBy;


public class AddEmployee {
	WebDriver driver;
	public AddEmployee(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(id="csv-form") WebElement dragdropzone;
	@FindBy(className="hf-application-roster-continue-btn") WebElement cnt;
	@FindBy(id="premiumPopupCloseBtn") WebElement premiumPopupCloseBtn;

	
	public void Add_Emp() throws InterruptedException, AWTException{
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			Robot robot= new Robot();
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection("Q:\\Smutchumilli\\Automation\\HFIC_LAMP\\TestData\\Emp.csv");
			clipboard.setContents(stringSelection, null);
			dragdropzone.click();
			robot.mouseMove(5, 10);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			//Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			cnt.click();
			js.executeAsyncScript("arguments[0].click();", premiumPopupCloseBtn);
			} catch (HeadlessException e) {
			e.getCause();
			e.printStackTrace();
			e.getMessage();
		}
	}

}
