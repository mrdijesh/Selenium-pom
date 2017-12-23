package week4_day2;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class Delete_Lead_1 extends Project_Methods {
	
	@Test(groups="Sanity")
	public void delete() throws InterruptedException
	{
		String firstLeadId;
		//login to leaftaps using projectmethods
		//login();
		//Click create lead button/link
		click(locateElement("LinkText", "Leads"));
		//click on find leads
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		//Click on Phone
		click(locateElement("xpath", "//span[text()='Phone']"));
		//Enter country code
		type(locateElement("xpath", "//input[@name='phoneCountryCode']"), "3");
		//Enter local code
		type(locateElement("xpath", "//input[@name='phoneAreaCode']"), "603210");
		//enter phone number
		type(locateElement("xpath", "//input[@name='phoneNumber']"), "9884930378");
		//Click Find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		//waiting for the search result
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
		close();

	}

}

