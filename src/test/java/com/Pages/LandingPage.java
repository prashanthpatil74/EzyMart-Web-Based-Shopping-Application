package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LandingPage extends InitialSetUp{

	@FindBy(linkText = "Login") WebElement linkLogin;
	@FindBy(linkText = "Register") WebElement linkRegister;
	@FindBy(name = "search[keywords]") WebElement txtSearch;
	@FindBy(xpath = "//button[@type='submit' and @class='button postfix nomarg nopad']") WebElement btnSearch;
	@FindBy(partialLinkText= "Advanced S") WebElement linkAdvanceSearch;

	
	public LandingPage(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement loginLink()
	{
		return linkLogin;
	}
	public void registerLink()
	{
		linkRegister.click();
	}
}
