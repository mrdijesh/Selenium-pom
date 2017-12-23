package week3_homework;



import org.testng.annotations.Test;

import methods.Project_Methods;

public class CreateContacts extends Project_Methods {
	@Test(invocationCount=3)
	public void createContacts() throws InterruptedException{
		
		//login();
		click(locateElement("LinkText", "Contacts"));
		click(locateElement("LinkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "world");
		type(locateElement("id", "lastNameField"), "class");
		type(locateElement("id", "createContactForm_firstNameLocal"), "don");
		type(locateElement("id", "createContactForm_lastNameLocal"), "wala");
		type(locateElement("id", "createContactForm_personalTitle"), "mr");
		type(locateElement("id", "createContactForm_generalProfTitle"), "wow");
		type(locateElement("id", "createContactForm_departmentName"), "private");
		Thread.sleep(3);
		selectDropDownUsingIndex(locateElement("id", "createContactForm_preferredCurrencyUomId"),5);
		type(locateElement("id", "createContactForm_description"), "Hello please help me in selenium");
		type(locateElement("id", "createContactForm_importantNote"), "this is very much imp as going forward");
		
		//Contact Information
		
		type(locateElement("id", "createContactForm_primaryPhoneCountryCode"), "2");
		type(locateElement("id", "createContactForm_primaryPhoneAreaCode"), "002");
		type(locateElement("id", "createContactForm_primaryPhoneExtension"), "5567");
		type(locateElement("id", "createContactForm_primaryEmail"), "don@gmail.com");
		type(locateElement("id", "createContactForm_primaryPhoneNumber"), "9962499509");
		type(locateElement("id", "createContactForm_primaryPhoneAskForName"), "debasis");
		
	/*	String firstName = getText(locateElement("id", "firstNameField"));
		System.out.println(firstName);
		String lastName = getText(locateElement("id", "lastNameField"));
		System.out.println(lastName);*/
		//String firstName = getText(locateElement("id", "generalToNameField"));
		//System.out.println(firstName);
		//verifyPartialText(locateElement("id", "generalToNameField"), firstName);
		
		//11993,12004,12118
		// verifyExactAttribute(locateElement("id", "firstNameField"), "value","world");
		 
		 verifyExactAttribute(locateElement("id", "generalToNameField"), "value","world class");
		
		type(locateElement("id", "createContactForm_generalAddress1"), "chennai central");
		type(locateElement("id", "createContactForm_generalCity"), "chennai");
		type(locateElement("id", "createContactForm_generalPostalCode"), "987652");
		type(locateElement("id", "createContactForm_generalPostalCodeExt"), "2");
		type(locateElement("id", "createContactForm_generalAttnName"), "ghtfrdrttt huyt");
		type(locateElement("id", "createContactForm_generalAddress2"), "egmore station");
		
		selectDropDownUsingText(locateElement("id", "createContactForm_generalCountryGeoId"), "United States");
		selectDropDownUsingIndex(locateElement("id", "createContactForm_generalStateProvinceGeoId"),5);
		click(locateElement("class", "smallSubmit"));
		verifyExactText(locateElement("id", "viewContact_firstName_sp"), "world");
		
		//close();
		
		
		
	}
	
	

}
