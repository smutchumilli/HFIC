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
		// Add Second doc type
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 1, 0),
				data.getstringdata("CR", 1, 1), data.getstringdata("CR", 1, 2), data.getstringdata("CR", 1, 3));
		ChangeRequest_Uplodedocuments.DocumentType_Select(2);
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 1, 5));
		// Add Third doc type
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 2, 0),
		data.getstringdata("CR", 2, 1), data.getstringdata("CR", 2, 2), data.getstringdata("CR", 2, 3));
		ChangeRequest_Uplodedocuments.DocumentType_Select(3);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 2, 5));
		// other documents
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 3, 0),
		data.getstringdata("CR", 3, 1), data.getstringdata("CR", 3, 2), data.getstringdata("CR", 3, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(1);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 3, 5));
		//
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 4, 0),
		data.getstringdata("CR", 4, 1), data.getstringdata("CR", 4, 2), data.getstringdata("CR", 4, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(2);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 4, 5));
		//
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 5, 0),
		data.getstringdata("CR", 5, 1), data.getstringdata("CR", 5, 2), data.getstringdata("CR", 5, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(3);
		ChangeRequest_Uplodedocuments.Rober2();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 5, 5));
		//
		ChangeRequest_Uplodedocuments.CR_Uplodedocument_Search(data.getstringdata("CR", 6, 0),
		data.getstringdata("CR", 6, 1), data.getstringdata("CR", 6, 2), data.getstringdata("CR", 6, 3));
		ChangeRequest_Uplodedocuments.Document_Purpose();
		ChangeRequest_Uplodedocuments.DocumentType_Select(5);
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Doc_Title(data.getstringdata("CR", 6, 6));
		ChangeRequest_Uplodedocuments.Rober1();
		ChangeRequest_Uplodedocuments.Notes(data.getstringdata("CR", 6, 5));

	}

}
