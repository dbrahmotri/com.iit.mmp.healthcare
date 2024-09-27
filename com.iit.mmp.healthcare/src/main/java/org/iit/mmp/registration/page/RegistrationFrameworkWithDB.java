package org.iit.mmp.registration.page;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
 


public class RegistrationFrameworkWithDB  {

	WebDriver driver;
	
	
	public RegistrationFrameworkWithDB(WebDriver driver) throws ClassNotFoundException, SQLException{
		this.driver = driver;

	}

	public void registerUrl() {
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}
	

	public void FirstName(String First_Name) {

		WebElement fnameTextField = driver.findElement(By.id("firstname"));
		fnameTextField.sendKeys(First_Name);
		System.out.println(First_Name);

	}

	public void LastName(String Last_Name) {
		WebElement lnameTextField = driver.findElement(By.id("lastname"));
		lnameTextField.sendKeys(Last_Name);

	}

	/*
	 * public void DateOfBirth(String DOB) {
	 * 
	 * SimpleDateFormat sdf = new SimpleDateFormat("MM/D/YYYY"); Date d = new
	 * Date(); WebElement dobTextField = driver.findElement(By.id("datepicker"));
	 * dobTextField.sendKeys(sdf.format(d)); System.out.println("The date is :" +
	 * d);
	 * 
	 * 
	 * }
	 */
	public void DateOfBirth(String DOB) {

		WebElement dobTextField = driver.findElement(By.id("datepicker"));
		dobTextField.sendKeys(DOB);
		System.out.println("The date is :" + DOB);

	}

	public void License(String License) {
		WebElement licTextField = driver.findElement(By.id("license"));
		licTextField.sendKeys(License);
		// hMap.put("license", licTextField.getAttribute("value"));
		System.out.println(License);

	}

	public void ssn(String SSN) {

		WebElement ssnTextField = driver.findElement(By.id("ssn"));
		ssnTextField.sendKeys(SSN);

	}

	public void State(String State) {
		WebElement stateTextField = driver.findElement(By.id("state"));
		stateTextField.sendKeys(State);// + AppLibrary.generateRandomString());
		// hMap.put("state", stateTextField.getAttribute("value"));

	}

	public void City(String City) {
		WebElement cityTextField = driver.findElement(By.id("city"));
		cityTextField.sendKeys(City);

	}

	public void Address(String Address) {
		WebElement addrTextField = driver.findElement(By.id("address"));
		addrTextField.sendKeys(Address);

	}

	public void Zipcode(String Zipcode) {
		WebElement zipTextField = driver.findElement(By.id("zipcode"));
		zipTextField.sendKeys(Zipcode);

	}

	public void Age(String Age) {
		WebElement ageTextField = driver.findElement(By.id("age"));
		ageTextField.sendKeys(Age);
	}

	public void Height(String Height) {
		WebElement heightTextField = driver.findElement(By.id("height"));
		heightTextField.sendKeys(Height);
	}

	public void Weight(String Weight) {
		WebElement weightTextField = driver.findElement(By.id("weight"));
		weightTextField.sendKeys(Weight);
	}

	public void Pharmacy(String Pharmacy) {
		WebElement pharmacyTextField = driver.findElement(By.id("pharmacy"));
		pharmacyTextField.sendKeys(Pharmacy);
	}

	public void PharmaAddress(String PharmacyAddress) {
		WebElement pharmaddrTextField = driver.findElement(By.id("pharma_adress"));
		pharmaddrTextField.sendKeys(PharmacyAddress);
	}

	public void Email(String Email) {
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(Email);

	}

	public void Password(String Password) {
		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys(Password);

	}

	public void Username(String Username) {
		WebElement uNameTextField = driver.findElement(By.id("username"));
		uNameTextField.sendKeys(Username);
	}

	public void Confirmpassword(String Confirmpassword) {
		WebElement conPassTextField = driver.findElement(By.id("confirmpassword"));
		conPassTextField.sendKeys(Confirmpassword);
	}

	public void Security(String security) {
		WebElement seleSec = driver.findElement(By.id("security"));
		Select sel = new Select(seleSec);
		//sel.selectByValue("what is your pet name");
		sel.selectByValue(security);
	}

	public void Answer(String Ans) {
		WebElement answerTextField = driver.findElement(By.id("answer"));
		answerTextField.sendKeys(Ans);
	}

	public String RegisterSave(WebDriver driver)

	{
		this.driver = driver;
		//WebElement submitTextField = driver.findElement(By.name("save"));
		WebElement submitTextField = driver.findElement(By.xpath("//input[@value='Save']"));
		submitTextField.click();
		return "";
	}

}
