package week2_class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school_Prompt {

	public static void main(String[] args) {
		//Chrome Driver Instance created
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//maximaized the window
		driver.manage().window().maximize();
		//Sswitiching to frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		
		//Capture the String
		String captureText=driver.switchTo().alert().getText();
		System.out.println(captureText);
		driver.switchTo().alert().sendKeys("Dijesh");
		//accept the String
		driver.switchTo().alert().accept();
		
		String text=driver.findElementById("demo").getText();
		System.out.println(text);
		if(text.contains("Hello Dijesh! How are you today?")){
			System.out.println("Test Case Passed");
		}
		else{
			System.out.println("Test Case Failed");
		}
driver.close();
	}

}
