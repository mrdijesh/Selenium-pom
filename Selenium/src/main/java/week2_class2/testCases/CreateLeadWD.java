package week2_class2.testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import methods.SeMethods;

public class CreateLeadWD extends SeMethods{

	@Test
	public void createLead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username1");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Create Lead"));



		type(locateElement("id", "createLeadForm_companyName"),"Conference");
		type(locateElement("id", "createLeadForm_firstName"),"Tiger");
		selectDropDownUsingIndex(locateElement("id","createLeadForm_dataSourceId"),2);
		type(locateElement("id", "createLeadForm_lastName"),"mishra");
		type(locateElement("id","createLeadForm_firstNameLocal"),"Testing");
		type(locateElement("id", "createLeadForm_personalTitle"),"Mr");
		type(locateElement("id", "createLeadForm_generalProfTitle"),"leaf");
		type(locateElement("id", "createLeadForm_annualRevenue"),"800000");

		//click(locateElement("className", "smallSubmit"));

		selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"),1);
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Partnership");
		type(locateElement("id", "createLeadForm_sicCode"),"800000");
		type(locateElement("id", "createLeadForm_description"),"This is to test the code");
		type(locateElement("id", "createLeadForm_importantNote"),"this is very inp to testing");
		//type(locateElement("id", "createLeadForm_description"),"800000");
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "Catalog Generating Marketing Campaigns");
		type(locateElement("id", "createLeadForm_lastNameLocal"),"sudooooo");
		type(locateElement("id", "createLeadForm_departmentName"),"Head of Dept");
		//selectDropDownUsingText(locateElement("id", "createLeadForm_currencyUomId"), "DZD");
		selectDropDownUsingText(locateElement("id", "createLeadForm_currencyUomId"), "DZD - Algerian Dinar");
		type(locateElement("id", "createLeadForm_numberEmployees"), "200");
		type(locateElement("id", "createLeadForm_tickerSymbol"), "Blue");

		//Contact Information

		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "4");
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "22");
		type(locateElement("id", "createLeadForm_primaryEmail"), "www.fjfj@gmail.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9964545454");
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "gello gghh");
		type(locateElement("id", "createLeadForm_primaryWebUrl"), "www.mouse.com");


		//Primary Address...

		type(locateElement("id", "createLeadForm_generalToName"), "finessss");
		type(locateElement("id", "createLeadForm_generalAddress1"), "gewyhhh");
		type(locateElement("id", "createLeadForm_generalCity"), "fin");
		type(locateElement("id", "createLeadForm_generalPostalCode"), "7623444");
		//type(locateElement("id", "createLeadForm_generalPostalCode"), "200");
		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), "200");
		type(locateElement("id", "createLeadForm_generalAttnName"), "dfdfdf");
		type(locateElement("id", "createLeadForm_generalAddress2"), "jani per eee");


		selectDropDownUsingIndex(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), 3);
		selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), "United States");

		click(locateElement("class", "smallSubmit"));

		String firstName = getText(locateElement("xpath", "//span[@id='viewLead_firstName_sp']"));
		
		System.out.println(firstName);

		if(firstName.contains("Tiger")){

			System.out.println("pass");
		}else{
			System.out.println("fail");
		}




	}

}
