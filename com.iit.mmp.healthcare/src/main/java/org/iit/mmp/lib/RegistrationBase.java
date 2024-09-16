package org.iit.mmp.lib;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationBase{
	

	protected WebDriver driver;// null
	ProjectConfiguration projConfig;
	protected Properties prop;
	String environment, browserType;
	
public RegistrationBase() throws IOException {
readPropertyFile();
}
	
	public void readPropertyFile() throws IOException {
		projConfig = new ProjectConfiguration();
		prop = projConfig.loadProperties("config/mmp.properties");
		environment = prop.getProperty("environment");
		browserType = prop.getProperty("browserType");
		
		
		
		if (environment.equals("qa") && browserType.equals("chrome")) 
		{
			
			//WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			prop = projConfig.loadProperties("config/mmp_registration.properties");
			//System.out.println("Reading the registration_url" +prop.entrySet());
			driver.get(prop.getProperty("patient_url"));
			driver.manage().window().maximize();

		}
		
	}
	
}



