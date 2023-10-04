package com.luma.qa.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.qa.TestBase.TestBase;
import com.luma.qa.pages.NewAccountCreate;
 
public class NewAccountCreateTest extends TestBase {
	
	NewAccountCreate newAC;
	
	
	public NewAccountCreateTest() {
		super();
	}
	
	@BeforeClass
	public void Setup() {
		initialization();
		newAC = new NewAccountCreate();

	}
	@Test
	public void signUpTest() {
		newAC.signup();
 		
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		//driver.close();
	}
}
