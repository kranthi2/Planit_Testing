package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Homepage;
import com.pages.Shoppingcart;
import com.pages.Welcomepage;


public class ShoppingcartTest extends BaseClass {

	Welcomepage welcome;
	LoginpageTest Loginpagetest;
	Shoppingcart shoppingcart;
	Homepage homepage;
	public ShoppingcartTest() {
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
	
	@Test(priority=3)
	public void proccessing() {
		shoppingcart = new Shoppingcart();
		shoppingcart.clickOnShoppingCart();
		System.out.println("Test 10");

	}
	
	@Test(priority=4)
	public void validatesubtotal(){
		System.out.println("dashdjaskjd");
		homepage= new Homepage();
		int quantity= Integer.parseInt(prop.getProperty("quantity"));
		Double price=Double.parseDouble(homepage.value);
		System.out.println(price);
		Double actual_subtotal=	(price*quantity);
		System.out.println("Actual Subtotal is "+actual_subtotal);
		Assert.assertEquals(actual_subtotal, shoppingcart.subtotal());
		shoppingcart.checkout();
	}
	
	}
