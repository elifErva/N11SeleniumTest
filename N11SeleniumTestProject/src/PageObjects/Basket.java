package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Basket {

WebDriver driver;
	
	//constructor
	public Basket(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	//price of the product
	By price = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[2]/div");
	public WebElement Price() {
		return driver.findElement(price);
	}
	
	public String TestBasketPrice() {
		String bPrice = Price().getText();
		System.out.println("Sepet fiyati: " + bPrice);
		return bPrice;
	}
	
	//count up element
	By plus = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]");
	public WebElement Plus() {
		return driver.findElement(plus);
	}
	
	//number of product
	By quantity = By.xpath("//*[@id=\"quantity_126775270199\"]");
	public WebElement Quantity() {
		return driver.findElement(quantity);
	}
	
	//remove product
	By remove = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]");
	public WebElement Remove() {
		return driver.findElement(remove);
	}
	
}
