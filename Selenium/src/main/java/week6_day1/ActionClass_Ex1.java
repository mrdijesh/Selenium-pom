package week6_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass_Ex1 {
	
	@Test
	public void actionClassTwo(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://jqueryui.com/sortable/");
		//maximaized the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.switchTo().frame(0);
		WebElement item1=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
		WebElement item4=driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[4]");
		int targetX=item4.getLocation().getX();
		int targetY=item4.getLocation().getY();
		Actions builder =new Actions(driver);
		builder.clickAndHold(item1).moveByOffset(targetX, targetY).build().perform();
	}
}
