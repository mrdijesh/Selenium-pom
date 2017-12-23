package week4_homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import methods.Project_Methods;

public class DuplicateLead_1 extends Project_Methods {


	@Test(dataProvider="duplicateLead",dataProviderClass=week4_homework.DuplicateLead_1.class,groups={"Sanity","Regression"})

	public void duplicateLead(String emailAddress) throws InterruptedException

	{
		//login();

		try {
			click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
			click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
			click(locateElement("xpath", "//span[text()='Email']"));
			type(locateElement("name", "emailAddress"), emailAddress);
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			Thread.sleep(4000);
			String expectedFirstDuplicateName=getText(locateElement("xpath", "(//a[text()='Adikandaeight'])[1]"));
			Thread.sleep(2000);	
			click(locateElement("xpath", "(//a[text()='Adikandaeight'])[1]"));
			click(locateElement("xpath", "//a[contains(text(),'Duplicate Lead')]"));
			verifyTitle("Duplicate");
			click(locateElement("class", "smallSubmit"));
			verifyExactText(locateElement("id", "viewLead_firstName_sp"), expectedFirstDuplicateName);
			//close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@DataProvider(name="duplicateLead")	
	public static Object[][] getData(){
		
		Object[][] data= new Object[1][1];
		data[0][0]="adikandaswain88@gmail.com";
		return data;
}

}

