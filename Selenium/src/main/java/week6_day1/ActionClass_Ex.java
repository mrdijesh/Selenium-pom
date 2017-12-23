package week6_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass_Ex {
	
@Test
public void actionClass(){
	
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//Navigated t the site
	driver.get("https://jqueryui.com/draggable/");
	//maximaized the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	driver.switchTo().frame(0);
	WebElement sourceItem=driver.findElementById("draggable");
	int xLocation = sourceItem.getLocation().getX();
	int yLocation = sourceItem.getLocation().getY();
	System.out.println("old location is"+xLocation+ "and" +yLocation );
	Actions builder =new Actions(driver);
	builder.dragAndDropBy(sourceItem, 12, 12).perform();
	int newXLocation = sourceItem.getLocation().getX();
	int newYLocation = sourceItem.getLocation().getY();
	System.out.println("New location is"+newXLocation+ " and" +newYLocation );
	
	
	

	
	
}


}
