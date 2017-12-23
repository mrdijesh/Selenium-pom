package week6_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverWait_Ex {
	
	@Test
	
	public void webDriverWaitEx(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://www.flipkart.com/");
		//maximaized the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement electonic = driver.findElementByXPath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span");
		
		
		WebElement apple = driver.findElementByXPath("//span[text()='Apple']");
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(electonic).perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(apple));
		
		apple.click();
		
		driver.close();
	}

}
