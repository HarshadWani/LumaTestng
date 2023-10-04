package com.luma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.qa.TestBase.TestBase;

public class NewAccountCreate extends TestBase {
	
	@FindBy( linkText = "Create an Account")
	WebElement signIN ;
	
	@FindBy( id = "firstname")
	WebElement firstname ;
	
	@FindBy( id = "lastname")
	WebElement lastname ;
	
	@FindBy( id = "email_address")
	WebElement email_address ;
	
	 
	@FindBy( id = "password")
	WebElement password ;
	
	@FindBy( id = "password-confirmation")
	WebElement passwordConfirmation   ;
	
	@FindBy( css = "button.submit")
	WebElement submitbutton   ;
	
	public NewAccountCreate() {
		PageFactory.initElements(driver, this);
	}
	
	public  void signup( ) {
		
		signIN.click(); 
		firstname.sendKeys("Namrata");
		lastname.sendKeys("Darekar");
		email_address.sendKeys("namrata@gmail.com");
		password.sendKeys("namrata#123");
		passwordConfirmation.sendKeys("namrata#123");
		submitbutton.click();
		
	}
	
}






