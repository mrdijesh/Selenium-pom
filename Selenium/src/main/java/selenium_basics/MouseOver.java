package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
@Test
public void mouseOver(){
	
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//Navigated t the site
	driver.get("https://www.flipkart.com/");
	//maximaized the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement electonic = driver.findElementByXPath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span");
	
	Actions action=new Actions(driver);
	
	action.moveToElement(electonic).build().perform();
}

}
