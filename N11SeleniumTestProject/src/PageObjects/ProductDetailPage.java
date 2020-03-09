package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
	WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	//add to basket button element
		By btnAddBasket = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div[3]/div[3]/a[2]");
		public WebElement BtnAddBasket() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return driver.findElement(btnAddBasket);
		}

}
