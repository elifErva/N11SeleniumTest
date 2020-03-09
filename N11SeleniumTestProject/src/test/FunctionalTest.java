package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class FunctionalTest extends BaseClass{

	@BeforeTest
	public void BeforeMethod() {
		super.setUp();
		driver.get("https://www.n11.com/");
	}
	
	@AfterClass
	public void AfterMethod() {
		super.tearDown();
	}
}
