package week3_class2;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class EditLead_1 extends Project_Methods {
	//@Test(dependsOnMethods="week3_class2.CreateLead_1.createLead")
	@Test
	public void edidMethod() throws InterruptedException
	{
		//login to leaftaps using projectmethods
		//login();
		//Click create lead button/link
		click(locateElement("LinkText", "Leads"));
		//click on find leads
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		//Enter first name
		//10050
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Adikandaeight");
		//Click Find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		//waiting for the search result
		Thread.sleep(4000);
		//Click on first resulting lead
		click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
		//Verify title of the page
		verifyTitle("View Lead | opentaps CRM");
		//Click Edit
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		//Change the company name
		type(locateElement("id", "updateLeadForm_companyName"), "HCL");
		//Click Update
		click(locateElement("name", "submitButton"));
		//Confirm the changed name appears
		String changedCompanyName=getText(locateElement("id", "viewLead_companyName_sp"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), changedCompanyName);
		close();


	}

}

