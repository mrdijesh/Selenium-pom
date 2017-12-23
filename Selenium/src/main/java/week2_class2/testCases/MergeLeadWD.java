package week2_class2.testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import methods.SeMethods;

public class MergeLeadWD extends SeMethods{
	
	@Test
	public void mergeLead() throws InterruptedException{
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		
		
		click(locateElement("linkText", "Leads"));
		click(locateElement("xpath", "//a[contains(text(),'Merge Leads')]"));
		
		
		
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		switchToWindow(1);
		
		//click(locateElement("xpath", "(//div[@class='x-form-element']/input)[1]"));
		
		WebElement fromLead=locateElement("xpath", "(//div[@class='x-form-element']/input)[1]");
		type(fromLead, "12789");
		//type(locateElement(locator, locValue), data);
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(6000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		
		switchToWindow(1);
		
		WebElement toLead=locateElement("xpath", "(//div[@class='x-form-element']/input)[1]");
		type(toLead, "12790");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(6000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		
		//click(locateElement("class", "buttonDangerous"));
		//acceptAlert();
		click(locateElement("xpath", "//div[@class='subSectionBlock']/form/table/tbody/tr[4]/td[2]/a"));
		acceptAlert();
		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
		type(locateElement("xpath", "(//div[@class='x-form-element']/input)[13]"), "12789");
		
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		
		String errorMessage=getText(locateElement("xpath", "//div[contains(text(),'No records to display')]"));
		if(errorMessage.contains("No records to display")){
			System.out.println("Validation done" +errorMessage);
		}else{
			
			System.out.println("test case failed");
		}
		
		closeBrowser();
	}

}
