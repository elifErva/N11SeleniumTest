package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.*;

public class TestCases extends FunctionalTest {
	
	@Test(priority = 1)
	public void SiteTest() {
		HomePage anasayfa = new HomePage(driver);
		anasayfa.BtnSignIn().click();
	}
	
	@Test(priority = 2)
	public void LoginTest() {
		LoginPage login = new LoginPage(driver);
		login.Email().sendKeys("xxxxxx@xmail.com");
		login.Password().sendKeys("xxxxxx");
		login.LoginButton().click();
		
	}
	
	@Test(priority = 3)
	public void SearchTest() {
		try {
		SearchBox sb = new SearchBox(driver);
		Basket basket = new Basket(driver);
		SecondPage sp = new SecondPage(driver);
		ProductDetailPage dp = new ProductDetailPage(driver);
		
		//searching "bilgisayar" word
		sb.SearchingBox().sendKeys("bilgisayar");
		sb.SearchButton().click();
		Thread.sleep (6000L);
		
		//opening 2nd page via button
		sb.SecondButton().click();
		Thread.sleep (3000L);
		
		//get the price from list
		String listPrice = sp.ListPrice();
		
		//selecting item
		sp.SecondColumn().click();
		Thread.sleep (3000L);
		
		//adding to basket
		dp.BtnAddBasket().click();
		Thread.sleep (3000L);
		
		driver.get("https://www.n11.com/sepetim");
		
		//get the price from basket
		String basketPrice = basket.TestBasketPrice();
		
		//comparing
		try {
			Assert.assertEquals(basketPrice, listPrice);
			System.out.println("Prices are equal.");
			
		}catch(Exception e) {
			Assert.fail("Prices are not equal!");
		}
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("TEST FAILURE");
			
		}
	}
	
	@Test(priority = 4)
	public void BasketTest() {
		Basket basket = new Basket(driver);
		
		//plus button test
		basket.Plus().click();
		
		//value of quantity
		String q = basket.Quantity().getText();
		try {
			Assert.assertEquals(q, 2);
			
		}catch(Exception e) {
			Assert.fail("Quantity Error!");
		}
		
		
		//remove product from basket
		basket.Remove().click();	
	}
}
