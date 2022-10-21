package com.qa.TestLayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;

public class LoginPageTest extends TestBase{

	public static String expected_login="https://qaadmin.onzway.com/dashboards";
	public static String expected_forgot="https://qaadmin.onzway.com/#reminder";
	
	@Test(priority=3)
	public void VerifyEmailAcceptingInput()
	{
		String text="aksjRdtt444@###nnfnn";
		login.GiveInputToEmail(text);
		
		
		WebElement em=driver.findElement(By.xpath("//input[@id='email']"));
		 
		String val = em.getAttribute("value");
	
		Assert.assertNotEquals(val, text);
	}
	
	@Test(priority=4)
	public void VerifyPasswordAcceptingInput()
	{
		login.GiveInputToPassword("554aggf#$5@aAf");
	}
	
	@Test(priority=1)
	
	public void VerifyLoginWithValidCredential() throws InterruptedException
	{
		Thread.sleep(2000);
		login.GiveInputToEmail("restaurant@onzway.com");
		login.GiveInputToPassword("123456");
		login.ClickOnLoginButton();
		Assert.assertEquals(driver.getCurrentUrl(), expected_login);
		login.ClickOnDropDown();
		login.ClickOnLogot();
	
	}
	
	@Test(priority=2)
	public void VerifyLoginWithInvalidCredential() throws InterruptedException
	{
		Thread.sleep(2000);
		login.GiveInputToEmail("restaurant@on.com");
		login.GiveInputToPassword("1234567");
		login.ClickOnLoginButton();
		Assert.assertNotEquals(driver.getCurrentUrl(), expected_login);
		
	}
	
	@Test(priority=5)
	public void VerifyForgotPasswordLink()
	{
		login.ClickOnForgotPasswordLink();
		Assert.assertEquals(driver.getCurrentUrl(), expected_forgot);
	}
	
}
