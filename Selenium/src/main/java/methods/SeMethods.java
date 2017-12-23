package methods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver = null ;
	WebElement ele = null;
	Select sel=null;
	int i=1;
	public void startApp(String browser, String url) {
		try{
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser "+browser+" Launched successfully");
		}
		catch(WebDriverException e){
			System.err.println("Driver not available to work on");
		}
		catch(Exception e){
			System.err.println("Some other error occured");
		}
		finally{
			takeSnap();
		}
	}

	public void startApp(String browser) {


	}

	public WebElement locateElement(String locator, String locValue) {
		try{
			switch (locator) {
			case "id": 
				ele = driver.findElementById(locValue);
				break;
			case "xpath": 
				ele = driver.findElementByXPath(locValue);
				break;	
			case "class": 
				ele = driver.findElementByClassName(locValue);
				break;

			case "linkText": 
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name": 
				ele = driver.findElementByLinkText(locValue);
				break;

			}	
		}
		catch(WebDriverException e){
			System.err.println("Driver :" +locValue+ "not available");
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {

		return null;
	}

	public void type(WebElement ele, String data) {
		try{
		ele.clear();
		ele.sendKeys(data);
		System.out.println("Given Value :"+data+" Is Entered Successfully");
	
	}
	catch(NoSuchElementException e)
	{
		System.err.println("Element "+ele+ "Not found");
	}

	catch(WebDriverException e)
	{
		System.err.println("Driver (Type) not available");
	}
	}
	

	public void click(WebElement ele) {
		
		try{
			ele.click();
			System.out.println("Element is Clicked Successfully");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Element "+ele+ "Not found");
		}

		catch (WebDriverException e) {
			System.err.println("Driver (Type) not available");
		}

		catch (Exception e) {
			System.err.println("other error occured inside click");
		}


	}

	public String getText(WebElement ele) {
		String str1 = ele.getText();
		return str1;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		sel =new Select(ele);
		sel.selectByVisibleText(value);
		// sel.selectByValue(value);
		System.out.println("selected by value");

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		sel = new Select(ele);
		sel.selectByIndex(index);
		System.out.println("selected by index");
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String str=driver.getTitle();
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> allWindowHandles = driver.getWindowHandles();

		List<String> allHandles = new ArrayList<>();

		allHandles.addAll(allWindowHandles);

		driver.switchTo().window(allHandles.get(index));

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("Clicked on accept button");
	}

	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		String str =driver.switchTo().alert().getText();
		System.out.println("");
		return str;
	}

	public void takeSnap() {
		try {
			
			File source=driver.getScreenshotAs(OutputType.FILE);

			File destination=new File("./Snaps/snap"+i+".jpg");

			FileUtils.copyFile(source, destination);
			

		} catch (IOException e) {

			System.err.println("File not found");
		}

		catch(WebDriverException e)
		{
			System.err.println("Driver (takesnap) not available");
			throw new RuntimeException();
		}

		i++;
	}
		
	

	public void closeBrowser() {
		driver.close();
		System.out.println("closed the current Browser");
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("closed all the browser");
	}

}
