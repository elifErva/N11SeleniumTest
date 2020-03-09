package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public static void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
	}
	
	public static void tearDown() {
		driver.quit();
	}

}
