package week4_homework;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import methods.OverridingLoginForCreateLead;

public class CreateLead_1 extends OverridingLoginForCreateLead {


	@Test(dataProvider="createLead",dataProviderClass=week4_homework.CreateLead_1.class,groups={"smoke"},priority=1,invocationCount=2)
	
	public void createLead(String cName,String fName,String lName,int source,String mCampaign,String firstNameLocal, String lastNameLocal,
			String personalTitle, String generalProfTitle, String departmentName,String annualRevenue, String currencyUomId,int industryEnumId,
			String numberEmployees,String ownershipEnumId,String sicCode,String tickerSymbol,String description,String primaryPhoneCountryCode,
			String primaryPhoneAreaCode, String primaryPhoneNumber,String primaryPhoneExtension,String primaryPhoneAskForName,String primaryEmail,
            String primaryWebUrl,String generalToName,String generalAttnName,String generalAddress1,String generalAddress2,String generalCity,
            String generalPostalCode,String generalPostalCodeExt,int generalStateProvinceGeoId,String generalCountryGeoId ) {

		    //login();

		try {
			click(locateElement("LinkText", "Create Lead"));
			type(locateElement("id", "createLeadForm_companyName"), cName);
			type(locateElement("id", "createLeadForm_firstName"), fName);
			type(locateElement("id", "createLeadForm_lastName"), lName);
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_dataSourceId"), source);
			selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), mCampaign);
			type(locateElement("id", "createLeadForm_firstNameLocal"), firstNameLocal);
			type(locateElement("id", "createLeadForm_lastNameLocal"), lastNameLocal);
			type(locateElement("id", "createLeadForm_personalTitle"), personalTitle);
			type(locateElement("id", "createLeadForm_generalProfTitle"), generalProfTitle);
			type(locateElement("id", "createLeadForm_departmentName"), departmentName);
			type(locateElement("id", "createLeadForm_annualRevenue"), annualRevenue);
			selectDropDownUsingText(locateElement("id", "createLeadForm_currencyUomId"), currencyUomId);
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), industryEnumId);
			type(locateElement("id", "createLeadForm_numberEmployees"), numberEmployees);
			selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), ownershipEnumId);
			type(locateElement("id", "createLeadForm_sicCode"), sicCode);
			type(locateElement("id", "createLeadForm_tickerSymbol"), tickerSymbol);
			type(locateElement("xpath", "//textarea[@id='createLeadForm_description']"), description);
			type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), primaryPhoneCountryCode);
			type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), primaryPhoneAreaCode);
			type(locateElement("id", "createLeadForm_primaryPhoneNumber"), primaryPhoneNumber);
			type(locateElement("id", "createLeadForm_primaryPhoneExtension"), primaryPhoneExtension);
			type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), primaryPhoneAskForName);
			type(locateElement("id", "createLeadForm_primaryEmail"), primaryEmail);
			type(locateElement("id", "createLeadForm_primaryWebUrl"), primaryWebUrl);
			type(locateElement("id", "createLeadForm_generalToName"), generalToName);
			type(locateElement("id", "createLeadForm_generalAttnName"), generalAttnName);
			type(locateElement("id", "createLeadForm_generalAddress1"), generalAddress1);
			type(locateElement("id", "createLeadForm_generalAddress2"), generalAddress2);
			type(locateElement("id", "createLeadForm_generalCity"), generalCity);
			type(locateElement("id", "createLeadForm_generalPostalCode"), generalPostalCode);
			type(locateElement("id", "createLeadForm_generalPostalCodeExt"), generalPostalCodeExt);
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), generalStateProvinceGeoId);
			selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), generalCountryGeoId);
			click(locateElement("name", "submitButton"));
			//close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}	
	@DataProvider(name="createLead")	
	public static Object[][] getData(){
		
		Object[][] data= new Object[1][34];
		data[0][0]="Varsun";
		data[0][1]="pavan";
		data[0][2]="katkam";
		data[0][3]=2;
		data[0][4]="Catalog Generating Marketing Campaigns";
		data[0][5]="Adifour";
		data[0][6]="Kantfour";
		data[0][7]="sir";
		data[0][8]="mr";
		data[0][9]="cs";
		data[0][10]="1000000";
		data[0][11]="DZD - Algerian Dinar";
		data[0][12]=2;
		data[0][13]="100";
		data[0][14]="Sole Proprietorship";
		data[0][15]="SIC12";
		data[0][16]="Ticker12";
		data[0][17]="My four lead";
		data[0][18]="3";
		data[0][19]="600119";
		data[0][20]="9962499509";
		data[0][21]="432";
		data[0][22]="Dijeshsour";
		data[0][23]="adikandaswain88@gmail.com";
		data[0][24]="https://google.com";
		data[0][25]="Adifour";
		data[0][26]="Adifour";
		data[0][27]="Thiruvalluvar cross street";
		data[0][28]="Urappakkam";
		data[0][29]="Chennai";
		data[0][30]="600119";
		data[0][31]="123";
		data[0][32]=4;
		data[0][33]="United States";
		
		/*data[1][0]="HCL";
		data[1][1]="DJ";
		data[1][2]="Mishra";
		data[1][3]=3;
		data[1][4]="Catalog Generating Marketing Campaigns";*/
		return data;
	}


}


