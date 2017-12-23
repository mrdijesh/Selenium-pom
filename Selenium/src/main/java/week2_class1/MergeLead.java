package week2_class1;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		//Chrome Driver Instance created
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximaized the window
		driver.manage().window().maximize();
		//Entered the login credentials by using locators

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();


		//Merge lead click

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent window is"+parent);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//img[@alt='Lookup']").click();

		//driver.switchTo().window("org.opentaps.gwt.crmsfa.crmsfa");
		//driver.switchTo().defaultContent();
		Set<String> allWindows= driver.getWindowHandles();

		int count  =allWindows.size();
		System.out.println("Windows count"+count);



		for (String child : allWindows) {

			if(!parent.equalsIgnoreCase(child)){

				driver.switchTo().window(child);
				//driver.findElementByXPath("//img[@alt='Lookup']").click();
				driver.findElementByXPath("(//div[@class='x-form-element']/input)[1]").sendKeys("12044");
				driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
				System.out.println(driver.getTitle());
				Thread.sleep(6000);
				driver.findElementByXPath(" //div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
				
				
			}

		}
		
		//For second To lead fill up
		driver.switchTo().window(parent);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows1= driver.getWindowHandles();
		Thread.sleep(3000);
		for (String child : allWindows1) {

			if(!parent.equalsIgnoreCase(child)){

		//System.out.println(driver.getTitle());
		

		driver.switchTo().window(child);
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[1]").sendKeys("12045");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(parent);


			}
		}
		
		driver.findElementByClassName("buttonDangerous").click();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().accept();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("11982");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		
		String errorMessage=driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		if(errorMessage.contains("No records to display")){
			System.out.println("Validation done");
		}else{
			
			System.out.println("test case failed");
		}
		
	}

}
