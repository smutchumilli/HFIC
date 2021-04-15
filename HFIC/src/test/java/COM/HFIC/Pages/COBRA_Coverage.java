package COM.HFIC.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class COBRA_Coverage {
	WebDriver driver;
	public COBRA_Coverage(WebDriver driver){
		this.driver=driver;
	}
 @FindBy(id="isCoveredByCobraNo") WebElement isCoveredByCobraNo;
 @FindBy(id="isDisabledInHospitalNo") WebElement isDisabledInHospitalNo;
 @FindBy(xpath="//*[@id='applicationModalContainer']/div/div[2]/div[6]/div/div/button")WebElement cnt;
 public void COBRACoverage(){
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", isCoveredByCobraNo);
	js.executeScript("arguments[0].click();", isDisabledInHospitalNo);
	js.executeScript("arguments[0].click();", cnt);
 
 }

}
