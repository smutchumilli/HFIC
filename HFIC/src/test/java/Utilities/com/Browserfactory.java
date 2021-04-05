package Utilities.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browserfactory {
	public  WebDriver driver;

	public static WebDriver Start_Application(WebDriver driver, String URL, String Browser) {

		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}  else if (Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}  else if (Browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverserver.exe");
			driver = new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void Quit_Browser(WebDriver driver) {
		driver.quit();
		
		
	}

}
