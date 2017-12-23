package week6_day1;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable_Sort {
	
@Test
	
	public void webTable_Sort(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://erail.in/");
		//maximaized the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int size=rows.size();
		
		List<String> columnList1 = new ArrayList<String>();
		
		for (int i = 0; i < size-1; i++) {
			
			columnList1.add(rows.get(i).findElements(By.tagName("td")).get(1).getText());
			
		}
		
		for (String firstList : columnList1) {
			
			System.out.println(firstList);
			
		}
		
		

}
}
