package week1_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		//driver.findElement(By.xpath("//li[@class=' x-tab-strip-active ']")).click();
		//driver.findElement(By.partialLinkText("Email")).click();

		//text based xpath
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//attribute based xpath
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("four@gmail.com");

		//text based xpath
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);

		String textFirstName=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println(textFirstName);

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.xpath("  //a[contains(text(),'Duplicate Lead')]")).click();

		String title=driver.findElement(By.xpath(" //div[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println(title);

		if(title.contains("Duplicate Lead")){
			System.out.println("matches"+title);
		}else{
			System.out.println("not Matching  "+title);
		}


		driver.findElement(By.linkText("Create Lead")).click();



	}

}
