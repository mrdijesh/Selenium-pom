package week3_homework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import methods.Project_Methods;

public class Merge_Contancts extends Project_Methods {
	@Test
	public void mergeContacts() throws InterruptedException{
		
		//12306,12309,12310,12313
		//login();
		click(locateElement("LinkText", "Contacts"));	
		click(locateElement("LinkText", "Merge Contacts"));
		
		
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		switchToWindow(1);
		WebElement fromContact=locateElement("xpath", "(//div[@class='x-form-element']/input)[1]");
		type(fromContact, "12306");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(6000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		
		
        click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		WebElement toContact=locateElement("xpath", "(//div[@class='x-form-element']/input)[1]");
		type(toContact, "12309");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(6000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		
		
		
		click(locateElement("xpath", "//div[@class='subSectionBlock']/form/table/tbody/tr[4]/td[2]/a"));
		acceptAlert();
		click(locateElement("xpath", "//a[contains(text(),'Find Contacts')]"));
		type(locateElement("xpath", "(//div[@class='x-form-element']/input)[13]"), "12306");
		
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(3000);
		
		verifyExactText(locateElement("class", "x-paging-info"), "No records to display");
		
		close();
	}
	
	

}
