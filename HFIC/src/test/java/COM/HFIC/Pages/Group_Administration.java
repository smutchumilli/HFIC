package COM.HFIC.Pages;

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
	@FindBy(id="class1WaivedIfRehiredWithinYes")WebElement class1WaivedIfRehiredWithinYes;
	@FindBy(id="class2EligibilityOptionYes")WebElement class2EligibilityOptionYes;
	@FindBy(id="isCoverageActiveOrTerminatedYes")WebElement isCoverageActiveOrTerminatedYes;
	@FindBy(id="isEmployerOfferingMedicalRadioBtnYes")WebElement isEmployerOfferingMedicalRadioBtnYes;
	@FindBy(className="hf-group-administration-continue-btn") WebElement Continu;
	
	@FindBy(id="class1WaivedIfRehiredWithin60Days") WebElement class1WaivedIfRehiredWithin60Days;
	//class2
	@FindBy(xpath="//input[@id='class2EligibilityOptionNo']//following::input[1]") WebElement class2;
	@FindBy(id="class2AsOfDate") WebElement class2AsOfDate;
	@FindBy(id="class2NewHire0Days") WebElement class2NewHire0Days;

	@FindBy(id="class2RehireWaitingPeriodYes") WebElement class2RehireWaitingPeriodYes;
	@FindBy(id="class2RehireWaitingPeriod30Days") WebElement class2RehireWaitingPeriod30Days;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[2]") WebElement insnsame;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[3]") WebElement coveragetype;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[4]") WebElement streetaddress;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[5]") WebElement straddr2;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[6]") WebElement city;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[7]") WebElement zip;;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[8]") WebElement polocyeffdate;
	@FindBy(xpath="//input[@id='isCoverageActiveOrTerminatedYes']//following::input[9]") WebElement polocytermdate;
	@FindBy(xpath="//input[@id='isEmployerOfferingMedicalRadioBtnYes']//following::input[2]") WebElement current_past_group_coverage;

	
	
	public void GroupAdministration(
			String FTE1,
			String SERVICEAEA1,
			String ACTIVEEMPLOYEES1,
			String COBRA1,
			String COVERAGE1,
			String valid_waviers1,
			String class1Def1,
			String class2def,
			String insnsame1,
			String coveragetype1,
			String streetaddress1,
			String straddr21,
			String city1,
			String zip1,
			String polocyeffdate1,
			String polocytermdate1,
			String pastgrpcoverage)
	{
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
		js.executeScript("arguments[0].click();", class1WaivedIfRehiredWithinYes);
		js.executeScript("arguments[0].click();", class1WaivedIfRehiredWithin60Days);

		js.executeScript("arguments[0].click();", class2EligibilityOptionYes);
		class2.sendKeys(class2def);
		js.executeScript("arguments[0].click();", class2AsOfDate);
		js.executeScript("arguments[0].click();", class2NewHire0Days);
		js.executeScript("arguments[0].click();", class2RehireWaitingPeriodYes);

		js.executeScript("arguments[0].click();", class2RehireWaitingPeriod30Days);

		
		
		
		
		js.executeScript("arguments[0].click();", class2RehireWaitingPeriodYes);
		js.executeScript("arguments[0].click();", class2RehireWaitingPeriod30Days);
	
		js.executeScript("arguments[0].click();", isCoverageActiveOrTerminatedYes);
		insnsame.sendKeys(insnsame1);
		coveragetype.sendKeys(coveragetype1);
		streetaddress.sendKeys(streetaddress1);
		straddr2.sendKeys(straddr21);
		city.sendKeys(city1);
		zip.sendKeys(zip1);
		polocyeffdate.sendKeys(polocyeffdate1);
		polocytermdate.sendKeys(polocytermdate1);
		
		
		js.executeScript("arguments[0].click();", isEmployerOfferingMedicalRadioBtnYes);
		current_past_group_coverage.sendKeys(pastgrpcoverage);
		js.executeScript("arguments[0].click();", Continu);
	}
}

