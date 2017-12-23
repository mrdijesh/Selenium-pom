package week2_class1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_ContactUsWinowsHandle {

	public static void main(String[] args) {

		//Chrome Driver Instance created
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Navigated t the site
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//maximaized the window
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElementByLinkText("Contact Us").click();

		Set<String> allWindows=driver.getWindowHandles();

		int countWindow =allWindows.size();
		System.out.println(countWindow);

		for (String child : allWindows) {

			if(!parentWindow.equalsIgnoreCase(child)){

				driver.switchTo().window(child);
				String titleOfChildWindow=driver.getTitle();
				System.out.println(titleOfChildWindow);

			}
		}
		driver.switchTo().window(parentWindow);
		String titleOfParent=driver.getTitle();
		System.out.println(titleOfParent);
	}

}
