package COM.HFIC.Pages;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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
//
	@FindBy(xpath="//input[@type='file']") WebElement File;
	public void Document_Upload() throws InterruptedException, AWTException{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("scroll(0, 250);");
		Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("Q:\\Smutchumilli\\upload.docx");
		Thread.sleep(5000);
		js.executeScript("scroll(0, 500);");
		Thread.sleep(3000);
		file2.click();
		Thread.sleep(2000);
		nys45.click();
		Thread.sleep(1000);
	  	nyscnt.click();
		Thread.sleep(4000);
		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@name='file1']")).sendKeys("Q:\\Smutchumilli\\upload.docx");
	    Thread.sleep(2000);
	    js.executeScript("scroll(0, 650);");
	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//input[@name='file2']")).sendKeys("Q:\\Smutchumilli\\upload.docx");
	   	Thread.sleep(3000);
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Continue);
	     Thread.sleep(3000);
	     Continue.click();
	     Thread.sleep(3000);

}
	
	}
	



