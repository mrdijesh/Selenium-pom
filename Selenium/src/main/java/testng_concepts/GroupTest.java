package testng_concepts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeClass(groups={"sanity","regression","database"})
	public void setUp(){
		System.out.println("setUp()");
	}
	@Test(groups={"sanity","regression"})
	public void test1(){
		System.out.println("sanity,regression}");
	}
	
	@Test(groups={"sanity"})
	public void test2(){
		System.out.println("sanity");
	}

	@Test(groups={"database"})
	public void test3(){
		System.out.println("database");
	}

	@Test(groups={"regression"})
	public void test4(){
		System.out.println("regression");
	}


}
