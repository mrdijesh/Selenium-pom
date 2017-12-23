package week2_class2.testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import methods.SeMethods;

public class DuplicateLeadWD extends SeMethods {
	
@Test
public void duplicateLead() throws InterruptedException{
	
	startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");		
	type(locateElement("id", "password"), "crmsfa");
	click(locateElement("class", "decorativeSubmit"));
	click(locateElement("linkText", "CRM/SFA"));
	
	
	click(locateElement("linkText", "Leads"));
	click(locateElement("linkText", "Find Leads"));
	
	click(locateElement("xpath", "//span[text()='Email']"));
	type(locateElement("xpath", "//input[@name='emailAddress']"), "four@gmail.com");
	
	click(locateElement("xpath", "//button[text()='Find Leads']"));
	Thread.sleep(4000);
	
	String textName = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
	System.out.println(textName);
	
	click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
	click(locateElement("xpath", "//a[contains(text(),'Duplicate Lead')]"));
	
	String title = getText(locateElement("xpath", "//div[@class='x-panel-header sectionHeaderTitle']"));
	System.out.println(title);
	
	if(title.contains("Duplicate Lead")){
		System.out.println("matches"+title);
	}else{
		System.out.println("not Matching  "+title);
	}

	closeBrowser();
	
}


}
