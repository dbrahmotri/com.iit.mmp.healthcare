package org.iit.mmp.adminmodule.pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminMessagesPage {

	WebDriver driver;
	public AdminMessagesPage(WebDriver driver)
	{
		this.driver = driver;

	}
	public HashMap<String,String> fetchMessageDetails()
	{

		//{date=01-05-2024, patientName=ria, reason=Monthly VisitAutoTesterVm33, subject=Having Cold and CoughAutoTesterXs79}

		String patientName= driver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td[1]")).getText();
		String reason=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td[2]")).getText();
		String date=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td[3]")).getText();
		String subject=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[3]/td[2]")).getText();
		HashMap<String,String> actualHMap = new HashMap<String,String>();
		actualHMap.put("patientName", patientName);
		actualHMap.put("date", date);
		actualHMap.put("reason", reason);
		actualHMap.put("subject", subject);
		return actualHMap;
		
	}

}
