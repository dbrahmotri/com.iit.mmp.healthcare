package org.iit.healthcare.betabatch;

import java.util.HashMap;

import org.iit.mmp.adminmodule.pages.AdminMessagesPage;
import org.iit.mmp.lib.AppLibrary;
import org.iit.mmp.lib.BaseClass;
import org.iit.mmp.lib.MMPLibrary;
import org.iit.mmp.patientmodule.pages.EditProfilePage;
import org.iit.mmp.patientmodule.pages.MessagesPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SendMessagesE2ETests extends BaseClass{
	

	@Parameters({"reason","subject","result"})
	@Test
	public void validateSendMessagesFunc(String reason,String subject,String result)
	{	
	 
		MMPLibrary mmpLib = new MMPLibrary(driver);
		//1. login to Patient Portal using ria1/Ria12345
		mmpLib.login(prop.getProperty("patient_username"),prop.getProperty("patient_password"));
		//2. Click on Messages module.
		mmpLib.moduleNavigation("Messages");
		MessagesPage msgPage = new MessagesPage(driver);
		String expectedReason= reason+AppLibrary.generateRandomString();
		String expectedSubject = subject+AppLibrary.generateRandomString();
		String expectedResult= result;
		/*
		 * 3. Enter the contact reason "Contact the doctor Charlie for regular checkup"
		   4. Enter the subject "Plesae arrange"
           5. Click on send button.
           6. Validate the alert shown
		 */
		boolean output = msgPage.sendMessages(expectedReason,expectedSubject,expectedResult);
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(output);
		
		//Building the Expected HashMap
		EditProfilePage editProfile = new EditProfilePage(driver);
		mmpLib.moduleNavigation("Profile");
		String patientName = editProfile.getFirstName();
		
		String date = AppLibrary.getFutureDate(0, "d-MMMM-YYYY");
		HashMap<String,String> expectedHMap = new HashMap<String,String>();
		expectedHMap.put("patientName", patientName);
		expectedHMap.put("date", date);
		expectedHMap.put("reason", expectedReason);
		expectedHMap.put("subject", expectedSubject);
		System.out.println(expectedHMap);
		
		mmpLib.launchBrowser(prop.getProperty("admin_url"));
		mmpLib.login(prop.getProperty("admin_username"),prop.getProperty("admin_password"));
		mmpLib.moduleNavigation("Messages");
		
		AdminMessagesPage adminMessagePage = new AdminMessagesPage(driver);
		HashMap<String,String> actualHMap = adminMessagePage.fetchMessageDetails();
		System.out.println(actualHMap);
		
		sa.assertEquals(actualHMap, expectedHMap);
		sa.assertAll();
		
	}

}























