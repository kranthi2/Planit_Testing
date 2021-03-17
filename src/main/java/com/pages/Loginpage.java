package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Loginpage extends BaseClass {

	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_btn;
	
	@FindBy(xpath="//a[contains(text(),'.com')]")
	WebElement accountname;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	
	}
	
	public void Email(String un) {
		email.sendKeys(un);
		
	}
	
	public void password(String pwd) {
		password.sendKeys(pwd);
		
	}
	
	public void click_login() {
		login_btn.click();
		
	}
	
	public String accountname() {
		
		return accountname.getText();
	}
}
