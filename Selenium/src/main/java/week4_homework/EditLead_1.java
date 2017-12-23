package week4_homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import methods.Project_Methods;

public class EditLead_1 extends Project_Methods {
	
	@Test(dataProvider="editLead",dataProviderClass=week4_homework.EditLead_1.class,groups={"smoke"},priority=2)
	public void edidMethod(String firstName,String companyName ) throws InterruptedException
	{
		try {
			//login to leaftaps using projectmethods
			//login();
			click(locateElement("LinkText", "Leads"));
			click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
			type(locateElement("xpath", "(//input[@name='firstName'])[3]"), firstName);
			click(locateElement("xpath", "//button[text()='Find Leads']"));
			Thread.sleep(4000);
			click(locateElement("xpath", "(//a[@class='linktext'])[4]"));
			verifyTitle("View Lead | opentaps CRM");
			click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
			type(locateElement("id", "updateLeadForm_companyName"), companyName);
			click(locateElement("name", "submitButton"));
			String changedCompanyName=getText(locateElement("id", "viewLead_companyName_sp"));
			verifyPartialText(locateElement("id", "viewLead_companyName_sp"), changedCompanyName);
			//close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	@DataProvider(name="editLead")	
	public static Object[][] getData(){
		
		Object[][] data= new Object[1][2];
		data[0][0]="Adikandaeight";
		data[0][1]="HCL";
		return data;
	}
}

