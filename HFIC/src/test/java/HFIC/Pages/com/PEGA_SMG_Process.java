package HFIC.Pages.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class PEGA_SMG_Process extends Baseclass {
	
	public PEGA_SMG_Process(WebDriver driver) {
		this.driver= driver;
	}
	
	//input[@id='txtUserID']
	@FindBy(xpath="//input[@id='txtUserID']") WebElement userid;
	@FindBy(xpath="//input[@id='txtPassword']") WebElement Password;
	@FindBy(xpath="//button[@id='sub']") WebElement Login_Button;
	@FindBy(xpath="//button[@name='HFICUnAssignedWorkBasket_pyDisplayHarness_67']//following::a[5]") WebElement appid_filter;
	@FindBy(xpath="//button[@name='HFICOperatorFirstReviewApplications_pyDisplayHarness_677']//following::a[5]") WebElement appid_filter_Suser;

	
	@FindBy(xpath="//input[@id='ef910d46']") WebElement appid_search_text;
	@FindBy(xpath="//input[@id='156a3c55']") WebElement appid_search_text_suser;

	@FindBy(xpath="//button[text()='Apply']") WebElement Apply_button;
	@FindBy(xpath="//*[contains(text(),'LOW')]//preceding::input[1]") WebElement checkbox;
	@FindBy(xpath="//button[text()='Assign Applications']") WebElement Assignbtton;
	@FindBy(xpath="//input[@id='19c272f1']") WebElement assign_id;
	@FindBy(xpath="//button[@name='HFICUnAssignedTask_pyDisplayHarness_41']") WebElement submit;
	@FindBy(css="img.pzbtn-img") WebElement image;
	@FindBy(xpath="//*[@id='pyNavigation1615791358304']/li[3]/a/span/span") WebElement logout;

 public void HFIC_Manager_Login(String uid,String pwd, String app_id,String user) throws InterruptedException {
	 
	 userid.sendKeys(uid);
	 Password.sendKeys(pwd);
	 Login_Button.click();
	 appid_filter.click();
	 appid_search_text.sendKeys(app_id);
	 Apply_button.click();
	 Thread.sleep(3000);
	 checkbox.click();
	 Assignbtton.click();
	 assign_id.sendKeys(user);
	 submit.click();
	 image.click();
	 logout.click();
	 
	 
 }
 
	@FindBy(xpath="//*[@id='PEGA_GRID_CONTENT']//tr[2]//td[1]") WebElement Results;
	//@FindBy(xpath="//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG1)_429']") WebElement confirm1;
	@FindBy(linkText="CONFIRM") WebElement confirm;

	@FindBy(xpath="//a[@name='ActionButtons_pyWorkPage_2']") WebElement next;
	@FindBy(xpath="//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG2)_430']") WebElement confirm2;

	@FindBy(xpath="//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG3)_430']") WebElement confirm3;
	@FindBy(xpath="//img[@name='Approval_pyWorkPage.Application.ReviewApplication(Group).ReviewScreen(PG4)_430']") WebElement confirm4;
	@FindBy(xpath="//a[@name='ActionButtons_pyWorkPage_7']") WebElement review_mship;;

	
	
public void HFIC_Superuser_login(String uid,String pwd,String app_id) throws InterruptedException {
	

	userid.sendKeys(uid);
	 Password.sendKeys(pwd);
	 Login_Button.click();
	 appid_filter_Suser.click();
	 appid_search_text_suser.sendKeys(app_id);
	 Apply_button.click();
	 Results.click();
	 Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm);

	confirm.click();
	 Thread.sleep(3000);

	 next.click();
	 Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm2);

		confirm.click();
	 Thread.sleep(3000);

	 next.click();
	 Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm3);

		confirm.click();
	 Thread.sleep(3000);

	 next.click();
	 Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirm4);

		confirm.click();
	 Thread.sleep(3000);

	 next.click();
	 Thread.sleep(3000);

	 review_mship.click();


	
}
	
}
