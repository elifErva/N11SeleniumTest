package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	By email = By.xpath("//*[@id=\"email\"]");
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	By password = By.xpath("//*[@id=\"password\"]");
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	By loginButton = By.xpath("//*[@id=\"loginButton\"]");
	public WebElement LoginButton() {
		return driver.findElement(loginButton);
	}
}
