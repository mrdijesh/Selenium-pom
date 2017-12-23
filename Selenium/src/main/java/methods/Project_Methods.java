package methods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Project_Methods extends SeMethods_1 {
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
		
	}
	@AfterMethod(groups="common")
	public void close()
	{
		closeAllBrowsers();
	}


}
