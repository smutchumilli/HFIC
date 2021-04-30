package Pages.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Group_Administration {
	WebDriver driver;
	public Group_Administration(WebDriver driver){
	this.driver=driver;
	}
	@FindBy(name="total_number_of_fte")WebElement FTE;
	@FindBy(name="total_number_of_employees_in_service_area")WebElement SERVICEAEA;
	@FindBy(name="total_number_of_active_employees_enrolling")WebElement ACTIVEEMPLOYEES;
	@FindBy(name="hf_employees_enrolling_cobra_or_state")WebElement COBRA;
	@FindBy(name="total_number_enrolling_into_coverage")WebElement COVERAGE;
	@FindBy(name="total_number_of_employees_with_valid_waviers")WebElement valid_waviers;
	@FindBy(id="isSubjectToCobraOrStateYes")WebElement isSubjectToCobraOrStateYes;
	@FindBy(id="isShopEligibilityRadioBtnNo")WebElement isShopEligibilityRadioBtnNo;
	@FindBy(id="isShopNeededRadioBtnNo")WebElement isShopNeededRadioBtnNo;
	@FindBy(name="class1Def")WebElement class1Def;
	@FindBy(name="class1EffectiveDateOfCoverageAndTermination")WebElement class1EffectiveDateOfCoverageAndTermination;
	@FindBy(id="class1AsOfDate0Days")WebElement class1AsOfDate0Days;
	@FindBy(id="class1WaivedIfRehiredWithinNo")WebElement class1WaivedIfRehiredWithinNo;
	@FindBy(id="class2EligibilityOptionNo")WebElement class2EligibilityOptionNo;
	@FindBy(id="isCoverageActiveOrTerminatedNo")WebElement isCoverageActiveOrTerminatedNo;
	@FindBy(id="isEmployerOfferingMedicalRadioBtnNo")WebElement isEmployerOfferingMedicalRadioBtnNo;
	@FindBy(className="hf-group-administration-continue-btn") WebElement Continu;

	public void GroupAdministration(String FTE1,String SERVICEAEA1,String ACTIVEEMPLOYEES1,String COBRA1,String COVERAGE1,String valid_waviers1,String class1Def1){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		FTE.sendKeys(FTE1);
		SERVICEAEA.sendKeys(SERVICEAEA1);
		ACTIVEEMPLOYEES.sendKeys(ACTIVEEMPLOYEES1);
		COBRA.sendKeys(COBRA1);
		COVERAGE.sendKeys(COVERAGE1);
		valid_waviers.sendKeys(valid_waviers1);
		js.executeScript("arguments[0].click();", isSubjectToCobraOrStateYes);
		js.executeScript("arguments[0].click();", isShopEligibilityRadioBtnNo);
		js.executeScript("arguments[0].click();", isShopNeededRadioBtnNo);
		js.executeScript("arguments[0].click();", class1EffectiveDateOfCoverageAndTermination);
		class1Def.sendKeys(class1Def1);
		js.executeScript("arguments[0].click();", class1AsOfDate0Days);
		js.executeScript("arguments[0].click();", class1WaivedIfRehiredWithinNo);
		js.executeScript("arguments[0].click();", class2EligibilityOptionNo);
		js.executeScript("arguments[0].click();", isCoverageActiveOrTerminatedNo);
		js.executeScript("arguments[0].click();", isEmployerOfferingMedicalRadioBtnNo);
		js.executeScript("arguments[0].click();", Continu);
	}
}

