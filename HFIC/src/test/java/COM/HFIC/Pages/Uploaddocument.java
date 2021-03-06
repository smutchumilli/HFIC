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

import com.aventstack.extentreports.Status;

import Pages.com.Baseclass;
public class Uploaddocument extends Baseclass {
	//public WebDriver driver;
	
	public Uploaddocument(WebDriver driver){
		this.driver= driver;
	}
	@FindBy(xpath="//input[@name='file']") WebElement file1;
	@FindBy(xpath="//*[@class='hf-browse-btn' and  @file-type='NYS-45']") WebElement file2;

	
	
	
	@FindBy(xpath="//*[@id='nysFileType']") WebElement nys45;
	@FindBy(css="button.hf-continue-to-browse-btn") WebElement nyscnt;
	
	@FindBy(xpath="//a[text()='Continue']") WebElement Continue;
//
	
	public void Document_Upload() throws InterruptedException, AWTException{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("scroll(0, 250);");
		Thread.sleep(500);
		file1.sendKeys("Q:\\Smutchumilli\\upload.docx");
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
	   	Thread.sleep(5000);
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Continue);
	     Thread.sleep(5000);
	     Continue.click();
	     Thread.sleep(3000);
	 	test.log( Status.INFO," Required documents are uploded succssfully");

}
	
	}
	



