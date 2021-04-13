package HFIC.Testcases.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class tesrtt {
	public void john() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://hfic-portal-st.healthfirst.org/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	WebElement username=driver.findElement(By.id("username"));
	boolean i=username.isDisplayed(); 
	if(i=false) {
		System.out.println("Test pass");
	}else {
		System.out.println("Test fail");

	}
	

	
	}
	
}
