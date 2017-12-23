package week3_homework;

import org.testng.annotations.Test;

import methods.Project_Methods;

public class Contacts_Deactivaed extends Project_Methods {
	@Test
public void contactsDeativated() throws InterruptedException{
	
	
	//login();
	click(locateElement("LinkText", "Contacts"));
	click(locateElement("LinkText", "Find Contacts"));
	type(locateElement("xpath", "(//div[@class='x-form-element']/input)[14]"), "world");
	click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
	click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	verifyTitle("View Contact | opentaps CRM");
	Thread.sleep(3000);
	click(locateElement("xpath", "//a[contains(text(),'Deactivate Contact')]"));
	Thread.sleep(3000);
	acceptAlert();
	verifyPartialText(locateElement("xpath", "//span[contains(text(),'This contact was deactivated as of ')]"), "This contact was deactivated as of");
	//span[contains(text(),'This contact was deactivated as of 11/30/17 14:10:44')]
	click(locateElement("LinkText", "Find Contacts"));
	//type(locateElement("xpath", "(//div[@class='x-form-element']/input)[13]"), "12255");
	type(locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[24]"), "12255");
	//input[@class=' x-form-text x-form-field ']
	
	click(locateElement("xpath", "//button[text()='Find Contacts']"));
	//(//button[@class='x-btn-text'])[7]
	verifyExactText(locateElement("class", "x-paging-info"), "No records to display");
	close();
	
	
}

}
