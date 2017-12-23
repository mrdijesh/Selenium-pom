package week1_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching Irctc Signup page
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("jjkkee");
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("leaf@1234");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("leaf@1234");
		
		//selected by visibile text
		WebElement securityQuestion = driver.findElement(By.id("userRegistrationForm:securityQ"));
		Select securityQs = new Select(securityQuestion);
		securityQs.selectByVisibleText("What is your fathers middle name?");
		
		driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("kumar");
		//Selected by index
		WebElement preferedLangauge = driver.findElement(By.id("userRegistrationForm:prelan"));
		Select preLang = new Select(preferedLangauge);
		preLang.selectByIndex(0);
		
		
		driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("DKM");
		driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys("Kumar");
		driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("Mishra");
		
		
		driver.findElement(By.id("userRegistrationForm:gender:0")).click();
		driver.findElement(By.id("userRegistrationForm:maritalStatus:0")).click();
		
		WebElement dates =driver.findElement(By.id("userRegistrationForm:dobDay"));
		Select dat = new Select(dates);
		dat.selectByIndex(14);
		
		WebElement months =driver.findElement(By.id("userRegistrationForm:dobMonth"));
		Select mon = new Select(months);
		mon.selectByValue("05");
		
		WebElement years =driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
		Select yer = new Select(years);
		yer.selectByVisibleText("1983");
		
		WebElement occupation =driver.findElement(By.id("userRegistrationForm:occupation"));
		Select ocu = new Select(occupation);
		ocu.selectByVisibleText("Private");
		
		driver.findElement(By.id("userRegistrationForm:uidno")).sendKeys("123412341234");
		driver.findElement(By.xpath("//input[@id='userRegistrationForm:idno']")).sendKeys("asupm115d1");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='userRegistrationForm:countries']"));
		Select coun = new Select(country);
		coun.selectByVisibleText("India");
		
		
		driver.findElement(By.id("userRegistrationForm:email")).sendKeys("d@gmail.com");
		//driver.findElement(By.id("userRegistrationForm:isdCode")).sendKeys("91");
		driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("9111111111");
		
		WebElement nationalityy=driver.findElement(By.id("userRegistrationForm:nationalityId"));
		Select nat = new Select(nationalityy);
		nat.selectByVisibleText("India");
		
		
		
		driver.findElement(By.id("userRegistrationForm:address")).sendKeys("redreee");
		driver.findElement(By.id("userRegistrationForm:street")).sendKeys("12345");
		driver.findElement(By.id("userRegistrationForm:area")).sendKeys("hygtfr");
		driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("600119",Keys.TAB);
		Thread.sleep(7000);
		
		WebElement city=driver.findElement(By.id("userRegistrationForm:cityName"));
		Select cit = new Select(city);
		cit.selectByVisibleText("Kanchipuram");
		
		Thread.sleep(6000);
		
		WebElement postOffice=driver.findElement(By.id("userRegistrationForm:postofficeName"));
		Select post = new Select(postOffice);
		post.selectByVisibleText("Sholinganallur S.O");
		
		driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("9876543210");
		
		driver.findElement(By.id("userRegistrationForm:resAndOff:0")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Select select(WebElement country) {
		// TODO Auto-generated method stub
		return null;
	}

}
