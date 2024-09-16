package org.iit.healthcare.betabatch;

import org.iit.mmp.lib.AppLibrary;
import org.iit.mmp.lib.BaseClass;
import org.iit.mmp.lib.MMPLibrary;
import org.iit.mmp.patientmodule.pages.EditProfilePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditProfileTests extends BaseClass {
	
	
	
	  public void login() 
	{ 
	  MMPLibrary mmpLib = new MMPLibrary(driver);
	  mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
	  mmpLib.moduleNavigation("Profile");
	  
	}
	 
	@Parameters({"fname"})
	@Test(priority = 1)
	public void validateFirstName(String fname) {
		
		login();
		//MMPLibrary mmpLib = new MMPLibrary(driver);
		//mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
		//mmpLib.moduleNavigation("Profile");
		//EditProfilePage editPage = new EditProfilePage(driver);
		//EditProfilePage ep = new EditProfilePage(driver);
		//ep.editButton();
		String expectedFName = fname + AppLibrary.generateRandomString();
		System.out.println(expectedFName);
		//String output = editPage.editFirstName(expectedFName);
	}

	@Parameters({ "lname" })
	@Test(priority = 2)
	public void validateLastNameFunc(String lname) {
		
		EditProfilePage ep = new EditProfilePage(driver);
		ep.editButton();
		String expectedLname = lname + AppLibrary.generateRandomString();
		System.out.println(expectedLname);
		// EditProfilePage editPage = new EditProfilePage(driver);
		// String output = editPage.editLastName(expectedLname);

	}

	@Parameters({ "licence" })
	@Test(priority = 3)
	public void validateLicenceFunc(String licence) {

		String expectedLicence = licence + AppLibrary.generateRandomString();
		System.out.println(expectedLicence);
		// EditProfilePage editPage = new EditProfilePage(driver);
		// boolean output = editPage.editFirstName(expectedLname);
		// Assert.assertTrue(output);
	}

	@Parameters({ "ssn" })
	@Test(priority = 4)
	public void validateSSNFunc(String ssn) {

		String expectedssn = ssn + AppLibrary.generateRandomString();
		System.out.println(expectedssn);
	}

	@Parameters({ "address" })
	@Test(priority = 5)
	public void validateAddressFunc(String address) {

		String expectedaddress = address + AppLibrary.generateRandomString();
		System.out.println(expectedaddress);

	}

	@Parameters({ "age" })
	@Test(priority = 6)
	public void validateAgeFunc(String age) {
		String expectedage = age + AppLibrary.generateRandomString();
		System.out.println(expectedage);
	}

	@Parameters({ "weight" })
	@Test(priority = 7)
	public void validateWeightFunc(String weight) {
		String expectedweight = weight + AppLibrary.generateRandomString();
		System.out.println(expectedweight);
	}

	@Parameters({ "height" })
	@Test(priority = 8)
	public void validateHeight(String height) {
		String expectedheight = height + AppLibrary.generateRandomString();
		System.out.println(expectedheight);
	}

	@Parameters({ "city" })
	@Test(priority = 9)
	public void validateCity(String city) {
		String expectedcity = city + AppLibrary.generateRandomString();
		System.out.println(expectedcity);
	}

	@Parameters({ "state" })
	@Test(priority = 10)
	public void validateState(String state) {

		String expectedstate = state + AppLibrary.generateRandomString();
		System.out.println(expectedstate);
	}

	@Parameters({ "zip" })
	@Test(priority = 11)
	public void validateZip(String zip) {

		String expectedzip = zip + AppLibrary.generateRandomString();
		System.out.println(expectedzip);
	}

	@Parameters({ "proinfo" })
	@Test(priority = 12)
	public void validateProInfo(String proinfo) {

		String expectedproinfo = proinfo + AppLibrary.generateRandomString();
		System.out.println(expectedproinfo);
	}

	@Parameters({ "Insinfo" })
	@Test(priority = 13)
	public void validateinsinfo(String insinfo) {

		String expectedinsinfo = insinfo + AppLibrary.generateRandomString();
		System.out.println(expectedinsinfo);
	}
	
	
	//@Parameters({"result"})

	//@Test(priority = 14)
	//public void validateSave(String result) throws InterruptedException
	//{

		//MMPLibrary mmpLib = new MMPLibrary(driver);
		//mmpLib.login(prop.getProperty("patient_username"), prop.getProperty("patient_password"));
		//mmpLib.moduleNavigation("Profile");
		//EditProfilePage edPage = new EditProfilePage(driver);
		//String expectedResult = result;
		//to confirm if the message was sent successfully 
		//System.out.println(expectedResult);
		//boolean output = edPage.Save(expectedResult);
		//Assert.assertTrue(output);
					
	//}
				
		
		

	}


/*
 * public void validateEditProfile(String fname, String lname, String licence,
 * String ssn, String address, String age, String weight, String height, String
 * city);
 * 
 * { MMPLibrary mmpLib = new MMPLibrary(driver);
 * mmpLib.login(prop.getProperty("patient_username"),prop.getProperty(
 * "patient_password")); mmpLib.moduleNavigation("Profile"); EditProfilePage
 * editPage = new EditProfilePage(driver); String expectedfname = fname
 * +AppLibrary.generateRandomString(); String expectedlname = lname
 * +AppLibrary.generateRandomString(); } }
 * 
 * 
 * 
 * public class SendMessagesTests extends BaseClass {
 * 
 * @Parameters({"subject", "message", "result"})
 * 
 * @Test public void validateSendMessagesFunc(String subject, String message,
 * String result) throws InterruptedException{ MMPLibrary mmpLib = new
 * MMPLibrary(driver); mmpLib.login(prop.getProperty("patient_username"),
 * prop.getProperty("patient_password")); mmpLib.moduleNavigation("Messages");
 * MessagesPage msgPage = new MessagesPage(driver); String expectedSubject =
 * subject + AppLibrary.generateRandomString(); String expectedMessage = message
 * + AppLibrary.generateRandomString(); String expectedResult = result; //to
 * confirm if the message was sent successfully
 * System.out.println(expectedResult); boolean output =
 * msgPage.sendMessages(expectedSubject, expectedMessage, expectedResult);
 * Assert.assertTrue(output);
 * 
 * }
 * 
 * }
 */
