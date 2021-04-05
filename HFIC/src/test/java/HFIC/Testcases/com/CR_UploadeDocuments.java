package HFIC.Testcases.com;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_Uplodedocuments;

public class CR_UploadeDocuments extends Baseclass {
	@Test
	public void CR_UploadeDocument() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 0, 0),
				data.getstringdata("CR", 0, 1), data.getstringdata("CR", 0, 2), data.getstringdata("CR", 0, 3));
		ChangeRequest_Uplodedocuments.DocumentType_Select(1);
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 0, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document");

	}

	// Add Second doc type
	@Test
	public void CR_UploadeDocument1() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 1, 0),
				data.getstringdata("CR", 1, 1), data.getstringdata("CR", 1, 2), data.getstringdata("CR", 1, 3));
		ChangeRequest_Uplodedocuments.DocumentType_Select(2);
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 1, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document1");

	}
	@Test
	// Add Third doc type
	public void CR_UploadeDocument2() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 2, 0),
				data.getstringdata("CR", 2, 1), data.getstringdata("CR", 2, 2), data.getstringdata("CR", 2, 3));
		ChangeRequest_Uplodedocuments.DocumentType_Select(3);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 2, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document2");

	}
	@Test
	// other documents
	public void CR_UploadeDocument3() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 3, 0),
				data.getstringdata("CR", 3, 1), data.getstringdata("CR", 3, 2), data.getstringdata("CR", 3, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(1);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 3, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document3");

	}
	@Test
	//
	public void CR_UploadeDocument4() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 4, 0),
				data.getstringdata("CR", 4, 1), data.getstringdata("CR", 4, 2), data.getstringdata("CR", 4, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(2);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 4, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document4");

	}
	@Test
	//
	public void CR_UploadeDocument5() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 5, 0),
				data.getstringdata("CR", 5, 1), data.getstringdata("CR", 5, 2), data.getstringdata("CR", 5, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(3);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 5, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document5");

	}
	@Test
	//
	public void CR_UploadeDocument6() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 6, 0),
				data.getstringdata("CR", 6, 1), data.getstringdata("CR", 6, 2), data.getstringdata("CR", 6, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(5);
		ChangeRequest_Uplodedocuments.tab();
		ChangeRequest_Uplodedocuments.Doc_Title(data.getstringdata("CR", 6, 6));
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 6, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document6");

	}
	@Test
	// No nys 45
	public void CR_UploadeDocument7() throws InterruptedException, AWTException {

		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,
				ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 7, 0),
				data.getstringdata("CR", 7, 1), data.getstringdata("CR", 7, 2), data.getstringdata("CR", 7, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(4);
		ChangeRequest_Uplodedocuments.Doc_subtype();
		ChangeRequest_Uplodedocuments.tab();
		ChangeRequest_Uplodedocuments.Doc_Title(data.getstringdata("CR", 7, 6));
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 7, 5));
		ChangeRequest_Uplodedocuments.submit();
		test = extent.createTest("Change Request Upload Document7");


	}

}
