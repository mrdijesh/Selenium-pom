package week1_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Example {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		Select source = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		source.selectByIndex(2);
		
		Select campiagn  = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		campiagn.selectByVisibleText("Car and Driver");
		
		Select country  = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		country.selectByValue("IND");
		

	}

}
