package com.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.Paymentpage;

public class PaymentTest extends BaseClass{

	Paymentpage paymentpage;
	public PaymentTest() {
		super();
	}
	
	@Test(priority=5)
	public void billingAddress() {
		paymentpage= new Paymentpage();
		paymentpage.addressdropdow();
		paymentpage.companyname(prop.getProperty("Company"));
		paymentpage.country(prop.getProperty("Country"));
		paymentpage.state(prop.getProperty("State"));
		paymentpage.city(prop.getProperty("City"));
		paymentpage.address1(prop.getProperty("Address1"));
		paymentpage.address2(prop.getProperty("Address2"));
		paymentpage.zipcode(prop.getProperty("zip"));
		paymentpage.phonenumber(prop.getProperty("phone"));
		paymentpage.faxnumber(prop.getProperty("Fax"));
		paymentpage.billingAddressContinue();
	}
	@Test(priority=6)
	public void shippingAddress() {
		paymentpage.shippingAddressdrpdwn();
		paymentpage.shippingAddressContinue();
		
	}
	
	@Test(priority=7)
	public void shippingmethod() {
		paymentpage.nextDayAir();
		paymentpage.shippingmtdContinue();	
	}
	
	@Test(priority=8)
	public void paymentmethod() {
		paymentpage.cod();
		paymentpage.paymentmtdContinue();	
	}
	
	@Test(priority=9)
	public void paymentinfo() {
	Assert.assertEquals(paymentpage.paymentinfomsg(), "You will pay by COD");
	paymentpage.paymentinfoContinue();	
	}
	
	@Test(priority=10)
	public void confirm() {
		paymentpage.confirmOrder();	
	}
	
	@Test(priority=11)
	public void orderdetails() {
	Assert.assertEquals(paymentpage.successmsg(), "Your order has been successfully processed!");
	System.out.println("order palced successfully");
	System.out.println(paymentpage.orderid());
	paymentpage.clickContinue();
	}
	
	@Test(priority=10)
	public void logoutMethod() throws InterruptedException {
		paymentpage.logout();	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		System.out.println("Shoppig cart closed");
	}

}
