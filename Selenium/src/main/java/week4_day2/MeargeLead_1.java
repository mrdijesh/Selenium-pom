package week4_day2;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class MeargeLead_1 extends Project_Methods {

	@Test(groups="Regression")
	public void mergeLead() throws InterruptedException

	{
		try {
			//login();
			click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
			click(locateElement("xpath", "//a[text()='Merge Leads']"));
			click(locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]"));
			switchToWindow(1);
			type(locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[1]"), "11759");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(5000);
			click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			switchToWindow(0);
			click(locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]"));
			switchToWindow(1);
			type(locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[1]"), "11760");
			click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
			Thread.sleep(5000);
			click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			switchToWindow(0);
			click(locateElement("xpath", "(//a[contains(text(),'Merge')])[2]"));
			Thread.sleep(4000);
			acceptAlert();
			click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
			//Enter original/from Lead Id
			type(locateElement("xpath", "(//div[@class='x-form-element']/input)[13]"), "11759");
			//click Find Leads button
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
			close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
