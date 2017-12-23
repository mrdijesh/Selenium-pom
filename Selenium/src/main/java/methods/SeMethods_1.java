package methods;


	
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Sleeper;

	public class SeMethods_1 implements WdMethods_1{

		RemoteWebDriver driver = null ;
		WebElement ele = null;
		Select dropDown= null;
		//String elementText;
		String title=null;
		//boolean condition;
		Alert alert=null;
		int i=1;

		public void startApp(String browser, String url) {

			try
			{
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
			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}
			catch(Exception e)
			{
				System.err.println("Some other error occured inside startApp");
			}

			finally {

				takeSnap();

			}


		}

		public void startApp(String browser) {


		}

		public WebElement locateElement(String locator, String locValue) {

			try
			{
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
				case "LinkText":
					ele=driver.findElementByLinkText(locValue);
					break;
				case "name":
					ele=driver.findElementByName(locValue);
				}	
			}

			catch(NoSuchElementException e)
			{
				System.err.println("Element: " +ele+ " not available");

				throw new RuntimeException();
			}
			catch(WebDriverException e)
			{
				System.err.println("Driver :" +locValue+ "not available");

				throw new RuntimeException();
			}

			catch (Exception e) {

				System.err.println("Some other error occured inside locate element");
			}

			finally {

				takeSnap();

			}

			return ele;
		}

		public WebElement locateElement(String locValue) {
			// TODO Auto-generated method stub
			return null;
		}

		public void type(WebElement ele, String data) {

			try
			{
				ele.clear();
				ele.sendKeys(data);
				System.out.println("Given Value :"+data+" Is Entered Successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver (Type) not available");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside type method");
			}

			finally {

				takeSnap();
			}
		}

		public void click(WebElement ele) {

			try
			{
				ele.click();
				System.out.println("Element is Clicked Successfully");

			}

			catch (WebDriverException e) 
			{
				System.err.println("Driver in (Type) not available");
			}

			catch (Exception e) {

				System.err.println("Some other error occured inside click");
			}

			finally {

				takeSnap();
			}


		}

		public String getText(WebElement ele) {
			// TODO Auto-generated method stub
			String text = null;
			try
			{
				text=ele.getText();

				System.out.println(text +" is captured successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside getText method");
			}

			finally {

				takeSnap();

			}

			return text;
		}

		public void selectDropDownUsingText(WebElement ele, String value) {
			// TODO Auto-generated method stub

			try{
				dropDown= new Select(ele);

				dropDown.selectByVisibleText(value);
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside selectDropDownUsingText method");
			}

			finally {
				takeSnap();
			}
		}

		public void selectDropDownUsingIndex(WebElement ele, int index) {
			// TODO Auto-generated method stub
			try
			{
				dropDown = new Select(ele);

				dropDown.selectByIndex(index);
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside selectDropDownUsingIndex method");
			}

			finally {
				takeSnap();
			}

		}

		public void verifyTitle(String expectedTitle) {
			// TODO Auto-generated method stub
			try
			{
				title=driver.getTitle();
				if(title.equals(expectedTitle))
				{

					System.out.println("Title of page " +title+ " verified successfully  "+expectedTitle);
				}else{
					
					System.out.println("Title of page not matching");
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyTitle method");
			}

			finally {
				takeSnap();
			}


		}

		public void verifyExactText(WebElement ele, String expectedText) {
			// TODO Auto-generated method stub
			String textvalue=null;
			try
			{
				textvalue=ele.getText();


				if(textvalue.equals(expectedText))
				{
					System.out.println(textvalue + ":expected text matched successfully with actual text:" + expectedText);
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyExactText method");
			}

			finally {
				takeSnap();
			}

		}

		public void verifyPartialText(WebElement ele, String expectedText) {

			String textPrtial=null;
			try
			{
				textPrtial=ele.getText();
				if(textPrtial.contains(expectedText))
				{
					System.out.println(textPrtial + ":expected text matched successfully partially with text:" + expectedText);
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyPartialText method");
			}

			finally {
				takeSnap();
			}

		}

		public void verifyExactAttribute(WebElement ele, String attribute, String value) {
			String exactAttribute=null;

			try
			{
				exactAttribute=ele.getAttribute(attribute);
				if(exactAttribute.equals(value))
				{
					System.out.println(exactAttribute + ":expected attribute matched successfully with actual attribute:" + value);
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyExactAttribute method");
			}

			finally {
				takeSnap();
			}

		}

		public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
			// TODO Auto-generated method stub

			String partialAttribute=null;

			try
			{
				partialAttribute=ele.getAttribute(attribute);

				if(partialAttribute.contains(value))
				{
					System.out.println(partialAttribute + ":expected attribute matched partially with actual attribute:" + value);
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyPartialAttribute method");
			}

			finally {
				takeSnap();
			}


		}

		public void verifySelected(WebElement ele) {
			// TODO Auto-generated method stub

			try
			{

				if(ele.isSelected())
				{

					System.out.println("Element" +ele+" is selected");
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifySelected method");
			}

			finally {
				takeSnap();
			}


		}

		public void verifyDisplayed(WebElement ele) {
			// TODO Auto-generated method stub
			try
			{

				if(ele.isDisplayed())
				{

					System.out.println("Element" +ele+" is displayed in the DOM");
				}
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside verifyDisplayed method");
			}

			finally {
				takeSnap();
			}

		}

		public void switchToWindow(int index) {
			// TODO Auto-generated method stub

			try
			{
				Set<String> allWindowHandles = driver.getWindowHandles();

				List<String> allHandles = new ArrayList<>();

				allHandles.addAll(allWindowHandles);

				driver.switchTo().window(allHandles.get(index));

				System.out.println("switched to window no: " +index+ "successfully");

			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside switchToWindow method");
			}

			finally {
				takeSnap();
			}

		}

		public void switchToFrame(WebElement ele) {
			// TODO Auto-generated method stub

			try
			{

				driver.switchTo().frame(ele);

				System.out.println("Switched to frame successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside switchToFrame method");
			}

			finally {
				takeSnap();
			}

		}

		public void acceptAlert() {
			// TODO Auto-generated method stub

			try
			{
				alert=driver.switchTo().alert();

				alert.accept();

				System.out.println("Accepted the alert");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside acceptAlert method");
			}

			finally {
				takeSnap();
			}

		}

		public void dismissAlert() {
			// TODO Auto-generated method stub

			try
			{
				alert=driver.switchTo().alert();

				alert.dismiss();

				System.out.println("Cancelled the alert");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside dismissAlert method");
			}

			finally {
				takeSnap();
			}

		}

		public String getAlertText() {
			// TODO Auto-generated method stub

			String alertText=null;
			try
			{
				alert=driver.switchTo().alert();

				alertText=alert.getText();

				System.out.println("Captured alert text successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver" +driver+ " not available to work on");
			}

			catch(Exception e)
			{
				System.err.println("Some other error occured inside getAlertText method");
			}

			finally {
				takeSnap();
			}

			return alertText;
		}

		public void takeSnap() {
			// TODO Auto-generated method stub


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
				//throw new RuntimeException();
			}


			catch(Exception e)
			{
				System.err.println("Some other error occured inside takeSnap method");
			}


			i++;
		}

		public void closeBrowser() {
			// TODO Auto-generated method stub

			try
			{
				driver.close();

				System.out.println("Current browser closed successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver (closeBrowser) not available");
				throw new RuntimeException();
			}


			catch(Exception e)
			{
				System.err.println("Some other error occured inside closeBrowser method");
			}

		}

		public void closeAllBrowsers() {
			// TODO Auto-generated method stub

			try
			{
				driver.quit();
				System.out.println("All the browsers closed successfully");
			}

			catch(WebDriverException e)
			{
				System.err.println("Driver (closeAllBrowsers) not available");
				throw new RuntimeException();
			}


			catch(Exception e)
			{
				System.err.println("Some other error occured inside closeAllBrowsers method");
			}

		}
}
