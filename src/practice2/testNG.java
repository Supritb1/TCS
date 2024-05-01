package practice2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite only");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test only");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class only");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method only");
	}
	
	@Test
	public void testMethod() {
		System.out.println("test method only");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite only");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test only");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class only");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method only");
	}

}
