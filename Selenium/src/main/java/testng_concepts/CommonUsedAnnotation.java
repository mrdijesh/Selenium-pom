package testng_concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonUsedAnnotation {
	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass()");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("afterClass()");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest()");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest()");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("afterSuite()");
	}
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("beforeSuite()");
	}
	@Test
	public void test1(){
		System.out.println("test1()");
	}
	@Test
	public void Test2(){
		System.out.println("Test2()");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod()");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod()");
	}
}
