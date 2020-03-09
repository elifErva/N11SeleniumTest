package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {

WebDriver driver;
	
    //constructor
	public SearchBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	//search box element
	By searchingBox = By.xpath("//*[@id=\"searchData\"]");
	public WebElement SearchingBox() {
		return driver.findElement(searchingBox);
	}
	
	//search button element
	By searchBtn = By.xpath("/html/body/div[1]/header/div/div/div[2]/div[1]/a");
	public WebElement SearchButton() {
		return driver.findElement(searchBtn);
	}
	
	//second page button element
	By secondPageBtn = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]");
	public WebElement SecondButton() {
		return driver.findElement(secondPageBtn);
	}
	
	
}
