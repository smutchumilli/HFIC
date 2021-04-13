package HFIC.Testcases.com;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class tesrtt {
	public void john() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://hfic-portal-st.healthfirst.org/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("srikanth@get365.tk");
	driver.findElement(By.id("npn-tax-id")).sendKeys("659828");
	driver.findElement(By.id("password")).sendKeys("Passw0rd#12");
	Thread.sleep(5000);
	
	WebElement button=driver.findElement(By.cssSelector("button.btn"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",button );
	
	driver.findElement(By.xpath("//a[contains(text(),'Employer Groups')]")).click();
	WebElement search_type= driver.findElement(By.id("empGroupSearchType"));
	
	
	
Select s= new Select(search_type);
s.selectByIndex(2);
driver.findElement(By.name("employerGroupsSearch")).sendKeys("CG4935");;
driver.findElement(By.cssSelector("button.hf-search-btn")).click();



Thread.sleep(5000);
List<WebElement> s1=driver.findElements(By.xpath("//*[@id='employerGroupsTable']//tr"));
System.out.println(s1.size());
for(int i=0;i<=s1.size();i++) {
System.out.println (s1.get(i).getText());
}
//=driver.findElement(By.xpath("//*[@class='hf-panel-body col-md-12']//label[1]")).getText();
//System.out.println(s1);
 Thread.sleep(5000);;
driver.quit();

	
	}
	

	
	}
	

