package org.iit.mmp.registration.page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.iit.mmp.lib.AppLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFramework {
	
	WebDriver driver;
	public RegistrationFramework(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void registerUrl()
	{
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
	}
	
		
	
	//HashMap<String, String> hMap = new HashMap<String, String>();

		public void FirstName(String firstname)
		{

		WebElement fnameTextField = driver.findElement(By.id("firstname"));
		fnameTextField.sendKeys(firstname);
		//hMap.put("firstname", fnameTextField.getAttribute("value"));
		System.out.println("value");
		}
		
		public void LastName(String lastname)
		{
		WebElement lnameTextField = driver.findElement(By.id("lastname"));
		lnameTextField.sendKeys(lastname);
	   // hMap.put("lastname", lnameTextField.getAttribute("value"));
		}
		
		 public void DateOfBirth(String datepicker)
		 {
			 SimpleDateFormat sdf = new SimpleDateFormat("MM/D/YYYY"); 
			  Date d = new Date(); 
			  WebElement dobTextField = driver.findElement(By.id("datepicker"));
			  dobTextField.sendKeys(sdf.format(d)); 
			  System.out.println("The date is :" +  d);
		 }
		 
		 public void License(String license)
		 {
		WebElement licTextField = driver.findElement(By.id("license"));
		licTextField.sendKeys(license+AppLibrary.generateRandomLicenceNumber());
		//hMap.put("license", licTextField.getAttribute("value"));
		//System.out.println(licTextField);
		 }
		 
		 public void ssn(String ssn)
		 {
			 
		WebElement ssnTextField = driver.findElement(By.id("ssn"));
		ssnTextField.sendKeys(ssn+AppLibrary.generateRandomssn());
		//hMap.put("ssn", ssnTextField.getAttribute("value"));
		 }
		 
		 public void State(String state)
		 {
		WebElement stateTextField = driver.findElement(By.id("state"));
		stateTextField.sendKeys(state);
		//hMap.put("state", stateTextField.getAttribute("value"));
		 }

		 public void City(String city)
		 {
		WebElement cityTextField = driver.findElement(By.id("city"));
		cityTextField.sendKeys(city);
		//hMap.put("city", cityTextField.getAttribute("value"));
		 }
		 
		 public void Addess(String address)
		 {
		WebElement addrTextField = driver.findElement(By.id("address"));
		addrTextField.sendKeys(address);
		//hMap.put("address", addrTextField.getAttribute("value"));
		 }
		 
		 public void Zipcode(String zipcode)
		 {
		WebElement zipTextField = driver.findElement(By.id("zipcode"));
		zipTextField.sendKeys(zipcode+AppLibrary.generateRandomZip());
		//hMap.put("zipcode", zipTextField.getAttribute("value"));
		 }
		 
		 public void Age(String age) 
		 {
		WebElement ageTextField = driver.findElement(By.id("age"));
		ageTextField.sendKeys(age+AppLibrary.generateRandomAge());
		//hMap.put("age", ageTextField.getAttribute("value"));
		//System.out.println(ageTextField);
		 }
		 
        public void Height(String height) 
          {
		WebElement heightTextField = driver.findElement(By.id("height"));
		heightTextField.sendKeys(height+AppLibrary.generateRandomHeight());
		//hMap.put("height", heightTextField.getAttribute("value"));
          }
        
        public void Weight(String weight)
        {
		WebElement weightTextField = driver.findElement(By.id("weight"));
		weightTextField.sendKeys(weight+AppLibrary.generateRandomWeight());
		//hMap.put("weight", weightTextField.getAttribute("value"));
        }
        
        public void Pharmacy(String pharmacy)
        {
		WebElement pharmacyTextField = driver.findElement(By.id("pharmacy"));
		pharmacyTextField.sendKeys(pharmacy);
		//hMap.put("pharmacy", pharmacyTextField.getAttribute("value"));
        }
        
        public void PharmaAddress(String pharma_adress)
        {
		WebElement pharmaddrTextField = driver.findElement(By.id("pharma_adress"));
		pharmaddrTextField.sendKeys(pharma_adress);
		//hMap.put("pharma_adress", pharmaddrTextField.getAttribute("value"));
        }
        
        public void Email(String email)
        {
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(email);
		//hMap.put("email", emailTextField.getAttribute("value"));
        }

        public void Password(String password)
        {
		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys(password);
		//hMap.put("password", passTextField.getAttribute("value"));
        }

        public void Username(String username)
        {
		WebElement uNameTextField = driver.findElement(By.id("username"));
		uNameTextField.sendKeys(username);
		//hMap.put("username", uNameTextField.getAttribute("value"));
        }

        public void Confirmpassword(String confirmpassword)
        {
		WebElement conPassTextField = driver.findElement(By.id("confirmpassword"));
		conPassTextField.sendKeys(confirmpassword);
		//hMap.put("password", conPassTextField.getAttribute("value"));
        }

        public void Security()
        {
		WebElement seleSec = driver.findElement(By.id("security"));
		Select sel = new Select(seleSec);
		sel.selectByValue("what is your pet name");
		//return "";
		
        }

        public void Answer(String answer)
        {
		WebElement answerTextField = driver.findElement(By.id("answer"));
		answerTextField.sendKeys(answer);
		//hMap.put("answer", answerTextField.getAttribute("value"));
        }

        public String RegisterSave()
   	 
        {
   		WebElement submitTextField = driver.findElement(By.name("register"));
   		submitTextField.click();
   		return "";
        }
        
 public void driverClose() {
	 driver.quit();
 }

}


