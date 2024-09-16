package org.iit.mmp.patientmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class EditProfilePage {
	WebDriver driver;
	public EditProfilePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public String editFirstName()
	{
		return "";
	}
	public String getFirstName()
	{
		return driver.findElement(By.id("fname")).getAttribute("value");
	}
	public void editButton() 
	{
		
		
	}

}
/*
Test Steps :
1. Login to Patient module 
2. Navigate to Profile tab.
3. Click on Edit button.
4. Clear the FirstName textbox and provide the updated value.
		editFirstName();
5. Click on save.
6. Validate the value entered in point#4 is displayed.


Test Steps :
1. Login to Patient module 
2. Navigate to Profile tab.
3. Click on Edit button.
4. Clear the textboxes and edit  for multiple fields:
	Fname- editFirstName1()
	LastName
	
5. Click on save.
6. Validate the value entered in point#4 is displayed. 
*/