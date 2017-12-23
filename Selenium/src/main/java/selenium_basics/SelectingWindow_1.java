package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingWindow_1 {

	@Test
public void slectWindows() throws InterruptedException{
		//Chrome Driver Instance created
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		//maximaized the window
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[contains(text(),'Know more')]").click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		
		driver.findElementByXPath("//input[@id='netbanking']").click();
		
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parentWindow);
		
		boolean result = driver.findElementByXPath("//img[@alt='Continue']").isDisplayed();
		System.out.println(result);
	}
}
