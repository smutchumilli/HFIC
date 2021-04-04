package PEGA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utilities.com.TestDataProvider;

public class Changerequest2 {
	public TestDataProvider data;

	@Test
	public void uplod_Documents() throws InterruptedException, AWTException {
		data= new TestDataProvider();

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pegaenbst.healthfirst.org/prweb/sso");
		driver.findElement(By.xpath("//a[contains(text(),'Change Requests')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Create Change Request')]")).click();
		Thread.sleep(3000);

		WebElement CRtype = driver.findElement(By.id("5c58224c"));
		Thread.sleep(3000);

		Select S = new Select(CRtype);
		S.selectByVisibleText("Document Upload");
		driver.findElement(By.id("5933568a")).sendKeys(data.getstringdata("CR", 1, 0));
		driver.findElement(By.id("fd28b87d")).sendKeys(data.getstringdata("CR", 1, 1));
		driver.findElement(By.id("eba1601d")).sendKeys(data.getstringdata("CR", 1, 2));
		driver.findElement(By.id("1bd959e7")).sendKeys(data.getstringdata("CR", 1, 3));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("HFICGroup360SearchResults_Group360Search.pxResults(1)_67")).click();

		driver.findElement(By.name("DocumentUploadUI_pyWorkPage_42")).click();

		WebElement DOCtype = driver.findElement(By.id("253bc4da"));
		Select S1 = new Select(DOCtype);
		S1.selectByIndex(2);
		Thread.sleep(2000);
		
		String myString = "Q:\\Myfile.docx";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.TAB).build().perform();

		builder.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

		
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER );
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER );
		rb.keyRelease(KeyEvent.VK_ENTER);

driver.findElement(By.name("HFICCaseHeader_pyWorkPage_16")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[contains(text(),'ADD A GENERAL NOTE?')]")).click();


driver.findElement(By.id("2bc4e467")).sendKeys("This is simple tEST");
Thread.sleep(2000);
driver.findElement(By.cssSelector("div.pzbtn-mid")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[contains(text(),'OK')]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//*[contains(text(),'Submit Documents')]")).click();

Thread.sleep(2000);

driver.quit();





}

}
