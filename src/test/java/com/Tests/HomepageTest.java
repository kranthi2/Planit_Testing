package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Homepage;
import com.pages.Welcomepage;

public class HomepageTest extends BaseClass{
	Homepage homepage;
	Welcomepage welcome;
	LoginpageTest Loginpagetest;
	
	public HomepageTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		welcome= new Welcomepage();
		welcome.clickloginbtn();
		Loginpagetest= new LoginpageTest();
		Loginpagetest.Login();

	}
	@Test(priority=1)
	public void selectbook(){
		 homepage= new Homepage();
		 
		 homepage.clickOnBooks();
		 homepage.selectbook();		
	}
	
	@Test(priority=2)
	public void AddtoCart() {
		System.out.println("Book price is "+homepage.printprice());
		 double pricevalue=Double.parseDouble(homepage.printprice());
		 homepage.enterquantity();
		 homepage.addcart();
		 Assert.assertEquals(homepage.validatemessage(), "The product has been added to your shopping cart");

	}
	@AfterClass
	public void teardown() {
			System.out.println("Home page closed");
		driver.quit();
	}
}
