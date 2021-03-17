package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Loginpage;
import com.pages.Welcomepage;

public class LoginpageTest extends BaseClass{

	Welcomepage welcome;
	Loginpage loginpage;
	
	public LoginpageTest() {
		super();
	}
	
	
	@BeforeClass
	public void setup() {
		initialization();
		welcome= new Welcomepage();
		welcome.clickloginbtn();
	}
	
	@Test
	public void Login() {
		loginpage= new Loginpage();
		loginpage.Email(prop.getProperty("email"));
		loginpage.password(prop.getProperty("password"));
		loginpage.click_login();	
		System.out.println("User Logged in");
	}
	
	@Test
	public void validateAccountid() {
		
		Assert.assertEquals(prop.get("email"), loginpage.accountname());
		System.out.println("Validated account id");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
