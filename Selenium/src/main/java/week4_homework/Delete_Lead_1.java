package week4_homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import methods.Project_Methods;

public class Delete_Lead_1 extends Project_Methods {
	
	@Test(dataProvider="deleteLead",dataProviderClass=week4_homework.Delete_Lead_1.class,groups={"sanity"},dependsOnGroups={"smoke"})
	public void delete(String phoneCountryCode,String phoneAreaCode,String phoneNumber ) throws InterruptedException
	{
		try {
			String firstLeadId;
			//login to leaftaps using projectmethods
			//login();
			//Click create lead button/link
			click(locateElement("LinkText", "Leads"));
			click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
			click(locateElement("xpath", "//span[text()='Phone']"));
			type(locateElement("xpath", "//input[@name='phoneCountryCode']"), phoneCountryCode);
			type(locateElement("xpath", "//input[@name='phoneAreaCode']"), phoneAreaCode);
			type(locateElement("xpath", "//input[@name='phoneNumber']"), phoneNumber);
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			Thread.sleep(4000);
			//Capture lead ID of First Resulting lead
			firstLeadId=getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			//Click on first resulting lead
			click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			//Click delete
			click(locateElement("xpath", "//a[contains(text(),'Delete')]"));
			//click on find leads
			click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
			//Enter captured lead ID
			type(locateElement("xpath", "//input[@name='id']"), firstLeadId);
			//Click Find leads button
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			//Verify error msg
			verifyExactText(locateElement("class", "x-paging-info"), "No records to display");
			//close all browsers using prjectMethod
			//close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@DataProvider(name="deleteLead")	
	public static Object[][] getData(){
		
		Object[][] data= new Object[1][3];
		data[0][0]="3";
		data[0][1]="600119";
		data[0][2]="9962499509";
		
		return data;
}
	}

