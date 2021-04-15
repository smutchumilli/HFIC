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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class Uploaddocument {
	public WebDriver driver;
	
	public Uploaddocument(WebDriver driver){
		this.driver= driver;
	}
	@FindBy(xpath="//*[@class='hf-browse-btn' and  @file-type='Group_Application']") WebElement file1;
	@FindBy(xpath="//*[@class='hf-browse-btn' and  @file-type='NYS-45']") WebElement file2;
	@FindBy(xpath="//label[@class='hf-browse-btn' and  @file-type='Payment_Authorization_Form']") WebElement file3;
	//@FindBy(xpath="[name='selected_file_type'][value='Form-K-1']") WebElement nys45;
	@FindBy(xpath="//*[@id='nysFileType']") WebElement nys45;
	@FindBy(css="button.hf-continue-to-browse-btn") WebElement nyscnt;
	@FindBy(xpath="//*[@class='hf-go-back-btn']//following::a[2]") WebElement Continue;

	

	public void Document_Upload() throws InterruptedException, AWTException{
	
		try {
			Robot robot= new Robot();
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection stringSelection = new StringSelection("Q:\\Smutchumilli\\upload.docx");
			clipboard.setContents(stringSelection, null);
			JavascriptExecutor js= (JavascriptExecutor)driver;
			Thread.sleep(5000);
			js.executeScript("scroll(0, 250);");

//			js.executeScript("arguments[0].scrollIntoView(true);",file1);
			Thread.sleep(4000);
			file1.click();
			Thread.sleep(4000);
			//robot.mouseMove(5, 10);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			
			//file 2
			js.executeScript("scroll(0, 500);");
			Thread.sleep(5000);
//			js.executeScript("arguments[0].scrollIntoView(true);",file2);
			file2.click();
			Thread.sleep(3500);
			nys45.click();
			Thread.sleep(3500);
			nyscnt.click();
			Thread.sleep(2000);
			//robot.mouseMove(5, 10);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);

//File3:	
			
			js.executeScript("scroll(0, 630);");
		   Thread.sleep(5000);
		   file3.click();
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
			Thread.sleep(3200);
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Continue);
	      Thread.sleep(4000);
		Continue.click();
	      Thread.sleep(3000);

}
	
	}
	



