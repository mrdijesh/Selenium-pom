package week4_day2;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class DuplicateLead_1 extends Project_Methods {


	@Test(groups={"Sanity","Regression"})

	public void duplicateLead() throws InterruptedException

	{
		//login();

		click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"), "adikandaswain83@gmail.com");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(4000);
		String expectedFirstDuplicateName=getText(locateElement("xpath", "(//a[text()='Adikandathree'])[1]"));
		Thread.sleep(2000);	
		click(locateElement("xpath", "(//a[text()='Adikandathree'])[1]"));
		click(locateElement("xpath", "//a[contains(text(),'Duplicate Lead')]"));
		verifyTitle("Duplicate");
		click(locateElement("class", "smallSubmit"));
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), expectedFirstDuplicateName);
		close();

	}

}

