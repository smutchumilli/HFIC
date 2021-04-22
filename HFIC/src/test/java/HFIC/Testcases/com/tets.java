package HFIC.Testcases.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;

public class tets extends Baseclass {
	@Test
	public void test12() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pegaenbst.healthfirst.org/prweb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtUserID']")).sendKeys("HFIC_SuperUser");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("install");
		driver.findElement(By.xpath("//button[@id='sub']")).click();	
		driver.findElement(By.xpath("//*[@ID='PEGA_GRID_CONTENT']//tr[2]//td[1]")).click();
		driver.findElement(By.linkText("Step 2: Review Membership")).click();
		List<WebElement> el = driver.findElements(By.xpath("//*[@id='PEGA_GRID_CONTENT']//tr[2]//td"));
		System.out.println(el.size());
		for(int i=0;i<el.size();i++) {
		System.out.println(el.get(i).getText());
		}

	}

}
