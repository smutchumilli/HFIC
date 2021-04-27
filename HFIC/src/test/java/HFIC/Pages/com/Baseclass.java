package HFIC.Pages.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.com.Browserfactory;
import Utilities.com.Configuration;
import Utilities.com.Helper;
import Utilities.com.TestDataProvider;
//
public class Baseclass {
	public static WebDriver driver;
	public Configuration config;
	public TestDataProvider data;
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void Start_up() {
		//Start method 1
		config = new Configuration();
		data = new TestDataProvider();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/PEGA_"+Helper.Get_CurrentTime()+".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		Reporter.log("Project set up done", true);

	}	

	@BeforeClass
	
	public void Application_Start() {
		
		driver = Browserfactory.Start_Application(driver, config.getPEGAURL(), config.getBrowser());
//		driver = Browserfactory.Start_Application(driver, config.getHFICURL(), config.getBrowser());
//		driver = Browserfactory.Start_Application(driver, config.getPEGADURL(), config.getBrowser());
		Reporter.log("Application up and running as expected", true);

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

	}
	

	 @AfterClass
	 public void Application_Exit() {

		 Browserfactory.Quit_Browser(driver);


	 }

}
