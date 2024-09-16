package org.iit.mmp.registration.page;

import java.text.SimpleDateFormat;
import java.util.Date;

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

		public String FirstName(String firstname)
		{

		WebElement fnameTextField = driver.findElement(By.id("firstname"));
		fnameTextField.sendKeys(firstname);
		//hMap.put("firstname", fnameTextField.getAttribute("value"));
		System.out.println("value");
		return firstname;
		}
		
		public String LastName(String lastname)
		{
		WebElement lnameTextField = driver.findElement(By.id("lastname"));
		lnameTextField.sendKeys(lastname);
	   // hMap.put("lastname", lnameTextField.getAttribute("value"));
		return lastname;
		}
		 public String DateOfBirth(String datepicker)
		 {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		//Date d = new Date();
		WebElement dobTextField = driver.findElement(By.id("datepicker"));
		dobTextField.sendKeys(sdf.format(datepicker));
		//hMap.put("datapicker", dobTextField.getAttribute("value"));
		//System.out.println("The date is :" + d);
		 return datepicker;
		 }
		 
		 public String License(String license)
		 {
		WebElement licTextField = driver.findElement(By.id("license"));
		licTextField.sendKeys(license);
		//hMap.put("license", licTextField.getAttribute("value"));
		//System.out.println(licTextField);
		return license;
		 }
		 
		 public String ssn(String ssn)
		 {
			 
		WebElement ssnTextField = driver.findElement(By.id("ssn"));
		ssnTextField.sendKeys(ssn);
		//hMap.put("ssn", ssnTextField.getAttribute("value"));
		return ssn;
		 }
		 
		 public String State(String state)
		 {
		WebElement stateTextField = driver.findElement(By.id("state"));
		stateTextField.sendKeys(state);
		//hMap.put("state", stateTextField.getAttribute("value"));
		return state;
		 }

		 public String City(String city)
		 {
		WebElement cityTextField = driver.findElement(By.id("city"));
		cityTextField.sendKeys(city);
		//hMap.put("city", cityTextField.getAttribute("value"));
		return city;
		 }
		 
		 public String Addess(String address)
		 {
		WebElement addrTextField = driver.findElement(By.id("address"));
		addrTextField.sendKeys(address);
		//hMap.put("address", addrTextField.getAttribute("value"));
		return address;
		 }
		 
		 public String Zipcode(String zipcode)
		 {
		WebElement zipTextField = driver.findElement(By.id("zipcode"));
		zipTextField.sendKeys(zipcode);
		//hMap.put("zipcode", zipTextField.getAttribute("value"));
		return zipcode;
		 }
		 
		 public String Age(String age) 
		 {
		WebElement ageTextField = driver.findElement(By.id("age"));
		ageTextField.sendKeys(age);
		//hMap.put("age", ageTextField.getAttribute("value"));
		//System.out.println(ageTextField);
		return age;
		 }
		 
        public String Height(String height) 
          {
		WebElement heightTextField = driver.findElement(By.id("height"));
		heightTextField.sendKeys(height);
		//hMap.put("height", heightTextField.getAttribute("value"));
		return height;
          }
        
        public String Weight(String weight)
        {
		WebElement weightTextField = driver.findElement(By.id("weight"));
		weightTextField.sendKeys(weight);
		//hMap.put("weight", weightTextField.getAttribute("value"));
		return weight;
        }
        
        public String Pharmacy(String pharmacy)
        {
		WebElement pharmacyTextField = driver.findElement(By.id("pharmacy"));
		pharmacyTextField.sendKeys(pharmacy);
		//hMap.put("pharmacy", pharmacyTextField.getAttribute("value"));
		return pharmacy;
        }
        
        public String PharmaAddress(String pharma_adress)
        {
		WebElement pharmaddrTextField = driver.findElement(By.id("pharma_adress"));
		pharmaddrTextField.sendKeys(pharma_adress);
		//hMap.put("pharma_adress", pharmaddrTextField.getAttribute("value"));
		return pharma_adress;
        }
        
        public String Email(String email)
        {
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys(email);
		//hMap.put("email", emailTextField.getAttribute("value"));
		return email;
        }

        public String Password(String password)
        {
		WebElement passTextField = driver.findElement(By.id("password"));
		passTextField.sendKeys(password);
		//hMap.put("password", passTextField.getAttribute("value"));
		return password;
        }

        public String Username(String username)
        {
		WebElement uNameTextField = driver.findElement(By.id("username"));
		uNameTextField.sendKeys(username);
		//hMap.put("username", uNameTextField.getAttribute("value"));
		return username;
        }

        public String Confirmpassword(String confirmpassword)
        {
		WebElement conPassTextField = driver.findElement(By.id("confirmpassword"));
		conPassTextField.sendKeys(confirmpassword);
		//hMap.put("password", conPassTextField.getAttribute("value"));
		return confirmpassword;
        }

        public void Security()
        {
		WebElement seleSec = driver.findElement(By.id("security"));
		Select sel = new Select(seleSec);
		sel.selectByValue("what is your pet name");
		//return "";
		
        }

        public String Answer(String answer)
        {
		WebElement answerTextField = driver.findElement(By.id("answer"));
		answerTextField.sendKeys(answer);
		//hMap.put("answer", answerTextField.getAttribute("value"));
		return answer;
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


