package com.luma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.luma.qa.TestBase.TestBase;

public class SignPage extends TestBase{
	
	@FindBy(linkText="Sign In")
	WebElement signInLink ;
	
	@FindBy(id="email")
	WebElement emailField  ;
	
	@FindBy(id="pass")
	WebElement passwordField   ;
	
	@FindBy(id="send2")
	WebElement loginBtn    ;
	
	@FindBy(xpath="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, Namrata Darekar!']")
	WebElement userName     ;
	
	@FindBy(css="div[class='panel header'] button[type='button'")
	WebElement logOutLink    ;
	
}
	