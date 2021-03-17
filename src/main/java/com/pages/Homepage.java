package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class Homepage extends BaseClass{

	public static String value;
	@FindBy(linkText="Books")
	WebElement books;
	
	@FindBy(linkText="Computing and Internet")
	WebElement selectbook;
	
	@FindBy(xpath="//div[@class='product-price']/span")
	WebElement price;
	
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement quantity;
	
	@FindBy(xpath="//input[contains(@id,'add-to-cart-button')]")
	WebElement addtocart;
	
	@FindBy(xpath="//p[@class='content'][contains(text(),'The product has been added to your ')]")
	WebElement message;
	
	public Homepage() {
		PageFactory.initElements(driver, this);	}
	
	
	
	public void clickOnBooks() {
		books.click();
	}
	
	public void selectbook() {
		selectbook.click();
	}
	
	public String printprice() {
		
	value= price.getText();
		return value;
	}
	
	public void enterquantity() {
		quantity.clear();
		quantity.sendKeys(prop.getProperty("quantity"));
		
	}
	
	public void addcart() {
		addtocart.click();
		
	}
	
	public String validatemessage() {
		return message.getText();
	}
}
