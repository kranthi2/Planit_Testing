package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Welcomepage;

public class WelcomePageTest extends BaseClass{

	Welcomepage welcome;
	public WelcomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setup() {
		initialization();
		welcome = new Welcomepage();
	}
	
	@Test
	public void welcomepageValidation() {
		welcome.clickloginbtn();
		Assert.assertEquals("Welcome, Please Sign In!", welcome.validateWelcomeText());	
		System.out.println("Validated Welcome, Please Sign In! message");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
