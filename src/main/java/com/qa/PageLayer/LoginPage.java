package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	public void GiveInputToEmail(String email_id)
	{
		email.sendKeys(email_id);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void GiveInputToPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//body/div[@id='login-container']/div[2]/form[1]/div[4]/div[2]/button[1]")
	private WebElement login_button;
	
	public void ClickOnLoginButton()
	{
		login_button.click();
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement dropdown;
	
	public void ClickOnDropDown()
	{
		dropdown.click();
	}
	
	@FindBy(xpath="//header/ul[2]/li[1]/ul[1]/li[3]/a[3]")
	private WebElement logout;
	
	public void ClickOnLogot()
	{
		logout.click();
	}
	
	@FindBy(xpath="//small[contains(text(),'Forgot password?')]")
	private WebElement forgot_password;
	
	public void ClickOnForgotPasswordLink()
	{
		forgot_password.click();
	}
}
