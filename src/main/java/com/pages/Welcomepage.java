package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Welcomepage extends BaseClass{

	@FindBy(linkText="Log in")
	WebElement login_btn;
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement welcome_txt;

	
	public Welcomepage() {		
		PageFactory.initElements(driver, this);
	}
	
	public void clickloginbtn() {
		
		login_btn.click();
		
	}
	
	public String validateWelcomeText() {
		return welcome_txt.getText();
		
	}
	
	
	
}
