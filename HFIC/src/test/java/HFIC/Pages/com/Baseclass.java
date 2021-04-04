package HFIC.Pages.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.com.Browserfactory;
import Utilities.com.Configuration;
import Utilities.com.Helper;
import Utilities.com.TestDataProvider;

public class Baseclass {
	public WebDriver driver;
	public Configuration config;
	public TestDataProvider data;
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeSuite
	public void Start_up() {
		//Start method
		config = new Configuration();
		data = new TestDataProvider();
		spark = new ExtentSparkReporter("./Reports/HFIC_Report_"+Helper.Get_CurrentTime()+".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	@BeforeClass
	public void Application_Start() {
		driver = Browserfactory.Start_Application(driver, config.getPEGAURL(), config.getBrowser());

	}

	@AfterMethod
	public void Tear_Down(ITestResult Result) throws IOException {

		if (Result.getStatus() == ITestResult.SUCCESS) {

			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
		if (Result.getStatus() == ITestResult.FAILURE) {

			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
		if (Result.getStatus() == ITestResult.SKIP) {

			test.skip(MediaEntityBuilder.createScreenCaptureFromPath(Helper.Get_Screenshot(driver)).build());

		}
		extent.flush();

		 Browserfactory.Quit_Browser(driver);



	}

//	 @AfterTest
//	 public void Application_Exit() {
//	 Browserfactory.Quit_Browser(driver);
//	 }

}
