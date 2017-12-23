package week4_day2;


import org.testng.annotations.Test;

import methods.OverridingLoginForCreateLead;

public class CreateLead_1 extends OverridingLoginForCreateLead {


	@Test(dataProvider="fetchData",dataProviderClass=week4_day2.Learn_DataProvider.class,groups="Smoke")
	public void createLead(String cName,String fName,String lName,int source,String mCampaign) {

		//login();

		try {
			click(locateElement("LinkText", "Create Lead"));
			type(locateElement("id", "createLeadForm_companyName"), cName);
			type(locateElement("id", "createLeadForm_firstName"), fName);
			type(locateElement("id", "createLeadForm_lastName"), lName);
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_dataSourceId"), source);
			selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), mCampaign);
			type(locateElement("id", "createLeadForm_firstNameLocal"), "Adifour");
			type(locateElement("id", "createLeadForm_lastNameLocal"), "Kantfour");
			type(locateElement("id", "createLeadForm_personalTitle"), "sir");
			type(locateElement("id", "createLeadForm_generalProfTitle"), "Mr");
			type(locateElement("id", "createLeadForm_departmentName"), "CS");
			type(locateElement("id", "createLeadForm_annualRevenue"), "1000000");
			selectDropDownUsingText(locateElement("id", "createLeadForm_currencyUomId"), "DZD - Algerian Dinar");
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
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), 4);
			selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), "United States");
			click(locateElement("name", "submitButton"));
			//close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}		
}


