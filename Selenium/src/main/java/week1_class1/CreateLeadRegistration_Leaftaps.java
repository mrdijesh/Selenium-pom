package week1_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadRegistration_Leaftaps {

	public static void main(String[] args) {
		//Chrome Driver Instance created
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximaized the window
		driver.manage().window().maximize();
		//Entered the login credentials by using locators
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//create Lead
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kkkk");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("123");
		
		String attribu = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println(attribu);
		
		
		//selected by visible text
		Select drp = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		drp.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		
		//selected based on index
		Select industry = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		industry.selectByIndex(2);
		Select ownership = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		ownership.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is to test the code");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is Important note");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Note");
		
		
		
		//Selected by value
		Select marketCampagin = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		marketCampagin.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Noteeee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Head");
		
		Select preferedCurrency = new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
		preferedCurrency.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("White");
		
		//Contact Information
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2222");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("four@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2222333444");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Hello fro");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.house.com");
		
		
		//Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("finessss");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("gewyhhh");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("fin");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("7623444");
		//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("33");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("762");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("dddddd");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("2323ddddddvvvv");
		
		
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByIndex(3);
		
		Select country = new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		country.selectByVisibleText("United States");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String str2=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(str2);
		
		if(str2.contains("123")){
			
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		
	}

}
