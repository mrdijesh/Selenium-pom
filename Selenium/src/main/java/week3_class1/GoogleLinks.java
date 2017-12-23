package week3_class1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) {
		//Declare the driver
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Instantiate chrome driver
		
		ChromeDriver driver=new ChromeDriver();
		
		//Launch URL
		
		driver.get("https://google.com");
		
		//maximize chrome browser
		
		driver.manage().window().maximize();
		
		//modi searching 
		
		WebElement searchTextbox=driver.findElementByTagName("");
		
		searchTextbox.sendKeys("modi");
		
		searchTextbox.sendKeys(Keys.ENTER);
		
		
		//find search results containing modi
		
		List<WebElement> modiLinks=driver.findElementsByPartialLinkText("Jaya");
		
		//get the no of links
		
		int linkSize=modiLinks.size();
		
		System.out.println(linkSize);
		
		
		//print each link
		
		
		for (WebElement eachLink : modiLinks) {
			
			System.out.println("link name :" +eachLink);
			
		}
		
		//click on the first modi link
		
		modiLinks.get(0).click();
		
		//click on the last link
		
		//jayaLinks.get(linkSize-1).click();

	}

}
