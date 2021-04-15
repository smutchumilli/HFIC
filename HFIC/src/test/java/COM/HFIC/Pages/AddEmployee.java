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

	//*[@class='hf-go-back-btn']//following::a[1]
	public void Add_Emp() throws InterruptedException, AWTException{
		try {
			
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection("C:\\Users\\smutchumilli\\git\\HFIC\\HFIC\\TestData\\Emp.csv");
		
			
			clipboard.setContents(stringSelection, null);
			
			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("scroll(0,400)");
//		    js.executeScript("window.scrollTo(1000,1500);");
//		    Actions act= new Actions(driver);
//			act.moveToElement(dragdropzone).perform();
			Robot robot= new Robot();
			
			
//			Thread.sleep(5000);
			//*[contains(text(),'Download Spreadsheet Template')]//following::label[1]

			dragdropzone.click();
			Thread.sleep(5000);
			robot.mouseMove(5, 10);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			//Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);

			js.executeScript("arguments[0].scrollIntoView(true);",cnt);
			Thread.sleep(5000);

			cnt.click();
			Thread.sleep(5000);

			js.executeAsyncScript("arguments[0].click();", premiumPopupCloseBtn);

			} catch (HeadlessException e) {
			e.getCause();
			e.printStackTrace();
			e.getMessage();
		}
		//Thread.sleep(8000);


	}

}
