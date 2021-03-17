package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class Shoppingcart extends BaseClass{
	
	@FindBy(xpath="//span[normalize-space()='Shopping cart']")
	WebElement shoppingcart_btn;
	
	@FindBy(xpath="//span[@class='product-price']")
	WebElement subtotal;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement agreement_chkbox;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout_btn;
	

	
	public Shoppingcart() {
		PageFactory.initElements(driver, this);	}
	
	public void clickOnShoppingCart() {
		shoppingcart_btn.click();
		
	}
	
	public double subtotal() {
		return Double.parseDouble(subtotal.getText());
		
	}
	
	public void checkout() {
		agreement_chkbox.click();
		checkout_btn.click();
	}
	
	
	
}
