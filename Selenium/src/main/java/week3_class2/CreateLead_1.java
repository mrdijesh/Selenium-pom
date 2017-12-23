package week3_class2;


import org.testng.annotations.Test;

import methods.OverridingLoginForCreateLead;
import methods.Project_Methods;

public class CreateLead_1 extends OverridingLoginForCreateLead {
	

	@Test(invocationCount=2)
	public void createLead() {
		
		//login();
		click(locateElement("LinkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "Cognizant");
		type(locateElement("id", "createLeadForm_firstName"), "Adikandaeight");
		type(locateElement("id", "createLeadForm_lastName"), "swaineight");
		selectDropDownUsingIndex(locateElement("id","createLeadForm_dataSourceId"),2);
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "Catalog Generating Marketing Campaigns");
		type(locateElement("id", "createLeadForm_firstNameLocal"), "Adifour");
		type(locateElement("id", "createLeadForm_lastNameLocal"), "Kantfour");
		type(locateElement("id", "createLeadForm_personalTitle"), "sir");
		type(locateElement("id", "createLeadForm_generalProfTitle"), "Mr");
		type(locateElement("id", "createLeadForm_departmentName"), "CS");
		type(locateElement("id", "createLeadForm_annualRevenue"), "1000000");
		click(locateElement("xpath", "//select[@id='createLeadForm_currencyUomId']/option[text()='INR - Indian Rupee']"));	
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), 4);
		type(locateElement("id", "createLeadForm_numberEmployees"), "100");
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Sole Proprietorship");
		type(locateElement("id", "createLeadForm_sicCode"), "SIC12");
		type(locateElement("id", "createLeadForm_tickerSymbol"), "Ticker12");
		type(locateElement("xpath", "//textarea[@id='createLeadForm_description']"), "My four lead");
		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "3");
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "603210");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9884930378");
		type(locateElement("id", "createLeadForm_primaryPhoneExtension"), "432");
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "Adifour");
		type(locateElement("id", "createLeadForm_primaryEmail"), "adikandaswain88@gmail.com");
		type(locateElement("id", "createLeadForm_primaryWebUrl"), "https://google.com");
		type(locateElement("id", "createLeadForm_generalToName"), "Adifour");
		type(locateElement("id", "createLeadForm_generalAttnName"), "Adifour");
		type(locateElement("id", "createLeadForm_generalAddress1"), "Thiruvalluvar cross street");
		type(locateElement("id", "createLeadForm_generalAddress2"), "Urappakkam");
		type(locateElement("id", "createLeadForm_generalCity"), "Chennai");
		type(locateElement("id", "createLeadForm_generalPostalCode"), "603210");
		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), "123");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), 3);
		selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), "United States");
		click(locateElement("name", "submitButton"));
		close();
	
		
		
	}		
}


