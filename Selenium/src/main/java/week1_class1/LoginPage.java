package week1_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
	//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestLeaf");
	driver.findElement(By.className("smallSubmit")).click();
		
	
	

	}

}
