package week4_day2;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class EditLead_1 extends Project_Methods {
	
	@Test(groups="Sanity")
	public void edidMethod() throws InterruptedException
	{
		//login to leaftaps using projectmethods
		//login();
		click(locateElement("LinkText", "Leads"));
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Adikandaeight");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(4000);
		click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		type(locateElement("id", "updateLeadForm_companyName"), "HCL");
		click(locateElement("name", "submitButton"));
		String changedCompanyName=getText(locateElement("id", "viewLead_companyName_sp"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), changedCompanyName);
		close();


	}

}

