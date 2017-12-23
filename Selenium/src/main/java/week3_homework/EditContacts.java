package week3_homework;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class EditContacts  extends Project_Methods {
	@Test
	public void editContacts() throws InterruptedException{
		
		//login();
		click(locateElement("LinkText", "Contacts"));
		click(locateElement("LinkText", "Find Contacts"));
		type(locateElement("xpath", "(//div[@class='x-form-element']/input)[14]"), "world");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("View Contact | opentaps CRM");
		Thread.sleep(3000);
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		Thread.sleep(3000);
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "wor");
		click(locateElement("class", "smallSubmit"));
		
		Thread.sleep(3000);
		
		verifyExactText(locateElement("id", "viewContact_firstName_sp"), "wor");
		//button[contains(text(),'Find Contacts')]
		//button[text()='Find Contacts']
		
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		//div[@class='frameSectionExtra']/a
		//(//input[@name='firstName'])[3]
		close();
		
	}

}
