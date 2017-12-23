package methods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class OverridingLoginForCreateLead extends Project_Methods {
	@Parameters({"browser","url","uName","pwd"})
	@BeforeMethod(groups="common")
	public void login(String brows , String url, String uName,String pwd  )
	{
		
		startApp(brows, url);
		
		//Enter Username
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uName);
		
		//Enter password
		type(locateElement("id", "password"), pwd);
		
		//Click login
		click(locateElement("class", "decorativeSubmit"));
		
		//driver.findElementByLinkText("CRM/SFA").click();
		
		click(locateElement("LinkText", "CRM/SFA"));
		click(locateElement("linkText", "Create Lead"));
		//click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
		
	}
}
