package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Collapse_Expanded {
	
	@Test
	public void collapseExpanded() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://www.hdfcbank.com/htdocs/nri_banking/payments/Billpay/Billpay.htm");
		//maximaized the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String style = driver.findElementByXPath("//div[@id='nre_savings_acc']/ul/li[2]/h3").getCssValue("background-image");
	    System.out.println("Before Clicking "+style);
	    
	    if(style.contains("bg_collapsed_panel")){
	    	Assert.assertTrue(true, style);
	    }
	    else{
	    	Assert.assertTrue(false, style);
	    }
	    	
	    driver.findElementByXPath("//div[@id='nre_savings_acc']/ul/li[2]/h3").click();
	    Thread.sleep(3000);
	    style=driver.findElementByXPath("//div[@id='nre_savings_acc']/ul/li[2]/h3").getCssValue("background-image");
	    System.out.println("After Clicking "+style);
	    if(style.contains("bg_expanded_panel")){
	    	Assert.assertTrue(true, style);
	    }
	    else{
	    	Assert.assertTrue(false, style);
	    }
		driver.close();
	}

}
