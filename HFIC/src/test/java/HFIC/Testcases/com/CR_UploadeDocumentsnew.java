package HFIC.Testcases.com;
import java.awt.AWTException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import HFIC.Pages.com.Baseclass;
import HFIC.Pages.com.ChangeRequest_Uplodedocuments;
public class CR_UploadeDocumentsnew extends Baseclass {
	@Test
	public void CR_UploadeDocument() throws InterruptedException, AWTException {
		test = extent.createTest("Change Request  Upload Document : Audit -> Employer Information Form");
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 0, 0),
		data.getstringdata("CR", 0, 1), data.getstringdata("CR", 0, 2), data.getstringdata("CR", 0, 3));
		test.log(Status.INFO,"Change Request Type selected as->Document Upload and Group search success based on provided data ");
		ChangeRequest_Uplodedocuments.DocumentType_Select(1);
		test.log(Status.INFO, "DocumentType_Selected as - Employer information form");
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 0, 5));
		test.log(Status.INFO, "Notes Added Successfully ");
		ChangeRequest_Uplodedocuments.submit();
		test.pass("Employer information  Document Added Successfully ");
	}

	// Add Second doc type
	@Test
	public void CR_UploadeDocument1() throws InterruptedException, AWTException {
		test = extent.createTest("Change Request  Upload Document : Audit -> Common Ownership Certification");
		ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 1, 0),
		data.getstringdata("CR", 1, 1), data.getstringdata("CR", 1, 2), data.getstringdata("CR", 1, 3));
		test.log(Status.INFO,"Change Request Type selected as->Document Upload and Group search success based on provided data ");
		ChangeRequest_Uplodedocuments.DocumentType_Select(2);
		test.log(Status.INFO, "DocumentType_Selected as - Common Ownership Certification");
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 1, 5));
		test.log(Status.INFO, "Notes Added Successfully ");
		ChangeRequest_Uplodedocuments.submit();
		test.log(Status.INFO, "Notes Added Successfully ");
		test.log(Status.PASS, " Common Ownership Certification form Document Added Successfully ");
		test.pass("Common Ownership Certification form Document Added Successfully");

	}

	 @Test
	 // Add Third doc type
	 public void CR_UploadeDocument2() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Audit -> Supporting Tax Documents");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments =
	 PageFactory.initElements(driver,
	 ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 2, 0),
	 data.getstringdata("CR", 2, 1), data.getstringdata("CR", 2, 2),
	 data.getstringdata("CR", 2, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(3);
	 test.log(Status.INFO, "DocumentType_Selected as - Supporting Tax Documentsn");
	 ChangeRequest_Uplodedocuments.Rober2();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 2, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, " Supporting Tax Documents form Document Added Successfully ");
	
	 }
	
	 @Test
	 // other documents
	 public void CR_UploadeDocument3() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Other -> Group Application");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments =
	 PageFactory.initElements(driver,
	 ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR",3, 0),
	 data.getstringdata("CR", 3, 1), data.getstringdata("CR", 3, 2),
	 data.getstringdata("CR", 3, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.Document_Purpose();
	 test.log(Status.INFO, "Document_Purpose selected as - Other ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(1);
	 test.log(Status.INFO, "DocumentType_Selected as - Group Application");
	 ChangeRequest_Uplodedocuments.Rober2();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 3, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, "Group Application Document uploaded sussfully ");
	
	 }
	
	 @Test
	 //
	 public void CR_UploadeDocument4() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Other -> Eligibility Waivers");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments =PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 4, 0),
	 data.getstringdata("CR", 4, 1), data.getstringdata("CR", 4, 2),data.getstringdata("CR", 4, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.Document_Purpose();
	 test.log(Status.INFO, "Document_Purpose selected as Other ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(2);
	 test.log(Status.INFO, " DocumentType_Selected as Eligibility Waivers ");
	 ChangeRequest_Uplodedocuments.Rober2();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 4, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, "Eligibility Waivers form uploded successfully ");
	
	 }
	
	 @Test
	 //
	 public void CR_UploadeDocument5() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Other -> NYS - 45 Form");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments = PageFactory.initElements(driver, ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 5, 0),
	 data.getstringdata("CR", 5, 1), data.getstringdata("CR", 5, 2),
	 data.getstringdata("CR", 5, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.Document_Purpose();
	 test.log(Status.INFO, "Document_Purpose selected as Other ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(3);
	 test.log(Status.INFO, " DocumentType_Seleced as NYS - 45 Form");
	 ChangeRequest_Uplodedocuments.Rober2();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 5, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, "NYS - 45 Form uploded successfully ");
	
	 }
	
	 @Test
	 //
	 public void CR_UploadeDocument6() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Other -> Other Supporting document");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments =PageFactory.initElements(driver,ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 6, 0), data.getstringdata("CR", 6, 1), data.getstringdata("CR", 6, 2), data.getstringdata("CR", 6, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.Document_Purpose();
	 test.log(Status.INFO, "Document_Purpose selected as Other ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(5);
	 test.log(Status.INFO, " DocumentType_Selected as Other");
	 ChangeRequest_Uplodedocuments.tab();
	 ChangeRequest_Uplodedocuments.Doc_Title(data.getstringdata("CR", 6, 6));
	 ChangeRequest_Uplodedocuments.Rober1();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 6, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, "Other documents Uploded Successfully ");
	
	 }
	
	 @Test
	 // No nys 45
	 public void CR_UploadeDocument7() throws InterruptedException, AWTException {
	 test = extent.createTest("Change Request Upload Document : Other -> No NYS 45");
	 ChangeRequest_Uplodedocuments ChangeRequest_Uplodedocuments =PageFactory.initElements(driver, ChangeRequest_Uplodedocuments.class);
	 ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 7, 0),
	 data.getstringdata("CR", 7, 1), data.getstringdata("CR", 7, 2),
	 data.getstringdata("CR", 7, 3));
	 test.log(Status.INFO, "Change Request Type selected as->Document Upload and Group search success based on provided data ");
	 ChangeRequest_Uplodedocuments.Document_Purpose();
	 test.log(Status.INFO, "Document_Purpose selected as Other ");
	 ChangeRequest_Uplodedocuments.DocumentType_Select(4);
	 test.log(Status.INFO, "Change request Uplode document search completed ");
	 ChangeRequest_Uplodedocuments.Doc_subtype();
	 test.log(Status.INFO, "Change request Uplode document search completed ");
	 ChangeRequest_Uplodedocuments.tab();
	 ChangeRequest_Uplodedocuments.Doc_Title(data.getstringdata("CR", 7, 6));
	 ChangeRequest_Uplodedocuments.Rober1();
	 ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 7, 5));
	 test.log(Status.INFO, "Notes Added Successfully ");
	 ChangeRequest_Uplodedocuments.submit();
	 test.log(Status.PASS, "No NYS 45 documents uploaded successfully ");
	
	 }

}
