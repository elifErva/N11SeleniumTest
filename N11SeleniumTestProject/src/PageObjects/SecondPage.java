package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	WebDriver driver;
	
	//constructor
	public SecondPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	//an item of product list
		By productColumn = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[2]/ul/li[2]/div/div[1]/a/img");
		public WebElement SecondColumn() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver.findElement(productColumn);
		}
		
		//the price element
		By productColumnPrice = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[2]/ul/li[2]/div/div[2]/a[2]");
		public WebElement SecondColumnPrice() {
			return driver.findElement(productColumnPrice);
		}	
		
		public String ListPrice() {
		String lPrice = SecondColumnPrice().getText();
		System.out.println("Liste fiyati: " + lPrice);
		return lPrice;
		}
}
