package org.iit.healthcare.betabatch;

import java.io.IOException;

import org.iit.mmp.lib.RegistrationBase;
import org.iit.mmp.registration.page.RegistrationFramework;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationTest  extends RegistrationBase {
	

	public RegistrationTest() throws IOException {
		super();
		
	}

	@Parameters({"firstname","lastname","datepicker","license","ssn","state","city","address","zipcode","age","height","weight","pharmacy","pharma_adress","email","password","username","confirmpassword","answer"})
	@Test
	public void validateRegister(String firstname, String lastname, String datepicker, String license, String ssn, String state, String city, String address, String zipcode, String age, String height, String weight, String pharmacy, String pharma_adress, String email, String password, String username, String confirmpassword, String answer)
	{	

		RegistrationFramework fm= new RegistrationFramework(driver);
		fm.registerUrl();
		
		fm.FirstName(firstname);
		fm.LastName(lastname);
		fm.DateOfBirth(datepicker);
		fm.License(license);
		fm.ssn(ssn);
		fm.State(state);
		fm.City(city);
		fm.Addess(address);
		fm.Zipcode(zipcode);
		fm.Age(age);
		fm.Height(height);
		fm.Weight(weight);
		fm.Pharmacy(pharmacy);
		fm.PharmaAddress(pharma_adress);
		fm.Email(email);
		
		fm.Password(password);
		fm.Username(username);
		fm.Confirmpassword(confirmpassword);
		fm.Security();
		fm.Answer(answer);
        fm.RegisterSave();	
         
		
	}	
	
}


