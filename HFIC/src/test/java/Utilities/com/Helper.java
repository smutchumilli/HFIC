package Utilities.com;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.MediaEntityBuilder;

import HFIC.Pages.com.Baseclass;

public class Helper extends Baseclass {
public static String  Get_Screenshot(WebDriver driver) throws IOException  {
	File Src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"/TestResults/PEGA_"+Get_CurrentTime()+".png";
	FileHandler.copy(Src, new File(path));
	return path;
}
public static String Get_CurrentTime() {
	
	DateFormat format= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date dt= new Date();
	return format.format(dt);
	
	
}
//Handle window
public static void Handle_Window() throws InterruptedException, IOException {	 
	String parent=driver.getWindowHandle();	 
	Set<String>s1=driver.getWindowHandles();
	Iterator<String> I1= s1.iterator();	 
	while(I1.hasNext())
	{		 
	   String child_window=I1.next();		 
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window); 
	driver.manage().window().maximize();
	Thread.sleep(5000);
	test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());
	Thread.sleep(5000);

	driver.close();
	}		 
	}
	driver.switchTo().window(parent);	
	//driver.navigate().refresh();
	}

//Actions class

public static void actions_class(WebElement ele) throws InterruptedException {
	
	Actions act= new Actions(driver);
	act.doubleClick(ele).perform();
	Thread.sleep(4000);
}
public static boolean checkWebElementDisplayed(WebElement webElement) {
	boolean elementDisplayed;
	try {
		webElement.isDisplayed();
		elementDisplayed = true;
	} catch (NoSuchElementException e) {
		elementDisplayed = false;
		System.out.println("Unable to find the WebElement: " + e.getMessage());
	}
	return elementDisplayed;
}

}
