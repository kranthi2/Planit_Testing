package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class Paymentpage extends BaseClass{

	@FindBy(xpath="//select[@id='billing-address-select']")
	WebElement address_dropdown;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	WebElement Company;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	WebElement country_drpdwn;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_StateProvinceId']")
	WebElement state_drpdwn;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement Address1;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
	WebElement Address2;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
	WebElement faxnumber;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']/input[@title='Continue']")
	WebElement billingAddress_continue;
	
	@FindBy(xpath="//select[@id='shipping-address-select']/option[last()-1]")
	WebElement Shipping_dropdwn;
	
	@FindBy(xpath="//input[@value='Continue'][@onclick='Shipping.save()']")
	WebElement shippingAddress_continue;
	
	@FindBy(xpath="//input[@id='shippingoption_1']")
	WebElement nextdayair_rdbtn;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	WebElement shippingmtd_continue;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	WebElement cod_btn;

	@FindBy(xpath="//input[@id='paymentmethod_0']")
	WebElement paymentmtd_continue;
	
	@FindBy(xpath="//p[text()='You will pay by COD']")
	WebElement cod_message;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	WebElement paymentinfo_continue;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	WebElement confirm_btn;	
	
	@FindBy(xpath="//div[@class='title']/strong")
	WebElement success_message;
	
	@FindBy(xpath="//div[@class='section order-completed']/ul/li[1]")
	WebElement orderid;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continue_btn;
	
	@FindBy(linkText="Log out")
	WebElement logout_btn;
	
	
	public Paymentpage() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public void addressdropdow() {
		Select select = new Select(address_dropdown);
		select.selectByVisibleText("New Address");	
	}
	
	public void companyname(String com) {
		Company.sendKeys(com);
	}
	
	public void country(String country) {
		Select select = new Select(country_drpdwn);
		select.selectByVisibleText(country);
	}
	
	public void state(String state) {
		Select select = new Select(state_drpdwn);
		select.selectByVisibleText(state);
	}
	
	public void city(String cityname) {
		city.sendKeys(cityname);
	}
	public void address1(String address1) {
		Address1.sendKeys(address1);
	}
	
	public void address2(String address2) {
		Address2.sendKeys(address2);
	}
	
	public void zipcode(String zip) {
		zipcode.sendKeys(zip);
	}
	
	public void phonenumber(String phone) {
		phonenumber.sendKeys(phone);
	}
	public void faxnumber(String fax) {
		faxnumber.sendKeys(fax);
	}
	
	public void billingAddressContinue() {
		billingAddress_continue.click();
	}
	public void shippingAddressdrpdwn() {
		shippingAddress_continue.click();
	}
	
	public void shippingAddressContinue() {
		shippingAddress_continue.click();
	}
	
	public void nextDayAir() {
		nextdayair_rdbtn.click();
	}
	
	public void shippingmtdContinue() {
		shippingmtd_continue.click();
	}
	
	public void cod() {
		cod_btn.click();
	}
	
	public void paymentmtdContinue() {
		paymentmtd_continue.click();
	}
	
	public String paymentinfomsg() {
		return cod_message.getText();
	}
	
	public void paymentinfoContinue() {
		paymentinfo_continue.click();
	}
	
	public void confirmOrder() {
		confirm_btn.click();
	}
	
	public String successmsg() {
		return success_message.getText();
	}
	
	public String orderid() {
		return orderid.getText();
	}
	public void clickContinue() {
		continue_btn.click();
	}
	
	public void logout() {
		logout_btn.click();
	}
}
