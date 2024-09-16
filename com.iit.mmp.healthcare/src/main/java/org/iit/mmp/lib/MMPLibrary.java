package org.iit.mmp.lib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MMPLibrary {
	WebDriver driver;
	public MMPLibrary(WebDriver driver)
	{
		this.driver = driver;
	}
	public void moduleNavigation(String moduleName)
	{

		driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();
	}
	 
	public String login(String username,String password)
	{

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		return driver.findElement(By.className("panel-title")).getText().trim();

	}
	public void launchBrowser(String url)
	{
		driver.get(url);
	}
	 

	public boolean sendMessage(String subject,String message,String result)
	{
		return true;
	}
	public boolean editProfile(String firstName)
	{
		
		return true;
	}
	public String handleAlerts()
	{
		Alert alrt = driver.switchTo().alert();
		String alrtText = alrt.getText();
		alrt.accept();
		return alrtText;
	}
	
	
	
}
