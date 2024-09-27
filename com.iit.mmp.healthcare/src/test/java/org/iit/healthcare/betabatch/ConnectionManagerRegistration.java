package org.iit.healthcare.betabatch;

import java.io.IOException;
import java.sql.SQLException;

import org.iit.mmp.lib.AppLibrary;
import org.iit.mmp.lib.RegistrationBase;
import org.iit.mmp.registration.page.RegistrationFrameworkWithDB;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ConnectionManagerRegistration extends RegistrationBase {
	
	//WebDriver driver;
	
	public ConnectionManagerRegistration() throws IOException {
		super();
	}

	/*
	 * Load the Driver Instance->class.forName("pass the driver class")
		Create a connection- username,password,hostip,database
		Create a statement
		Execute Queries: select * from mmp.patient_data=> result set
		Fetch the data store in Array
		Pass the Array to the DP
		Use the DP for executing the testcases
		https://www.w3schools.com/sql/sql_where.asp
		https://total-qa.com/mysql-database-testing-using-selenium-webdriver-step-step-guide/
	 */
	@Test(dataProvider="DP")
	public void validateRegistration(String First_Name, String Last_Name, String DOB, String License, String SSN, 
			String State, String City, String Address, String Zipcode, String Age, String Height, String Weight, 
			String Pharmacy, String PharmacyAddress, String Email, String Password, String Username, String Confirmpassword, String Ans 
			) throws Exception
	{
	
		RegistrationFrameworkWithDB rf = new RegistrationFrameworkWithDB(driver);
		rf.registerUrl();
		
		rf.FirstName(First_Name);
		rf.LastName(Last_Name);
		rf.DateOfBirth(DOB);
		//License = "12345678";
		rf.License(License);
		//System.out.println(SSN);
		//SSN = SSN+"9";
		//System.out.println(SSN);
		rf.ssn(SSN);
		rf.State(State);
		rf.City(City);
		rf.Address(Address);
		//Zipcode = "68131";
		rf.Zipcode(Zipcode);
		rf.Age(Age);
		rf.Height(Height);
		rf.Weight(Weight);
		rf.Pharmacy(Pharmacy);
		rf.PharmaAddress(PharmacyAddress);
		rf.Email(Email);
		
		rf.Username(Username);
		//Password = "liZa123!";
		rf.Password(Password);
		//System.out.println(Password);
		//Confirmpassword = "liZa123!";
		rf.Confirmpassword(Confirmpassword);
		String security = "what is your pet name";
		rf.Security(security);
		//Ans = "some answer";
		rf.Answer(Ans);
		
        rf.RegisterSave(driver);	
	}	
	
	@DataProvider(name="DP")
	public String[][] feedDP() throws ClassNotFoundException, SQLException
	{
		String data[][] = AppLibrary.getDBValues("root","devi@0207","registration_profile", "patient_registration_detail", "localhost");
		
//		for (String[] x : data) {
//		   for (String y : x){
//			   int indexOfelement = ArrayUtils.indexOf(x, y);
//		       System.out.println(y + " at >> "+ indexOfelement );
//		   }
//		   System.out.println("=====================");
//		}
		
		return data;
	}
	 
}


