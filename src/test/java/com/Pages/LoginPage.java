package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends InitialSetUp{

	@FindBy(id="login-username") WebElement txtEmail;
	@FindBy(id="login-password") WebElement txtPassword;
	@FindBy(id="login-remember") WebElement checkRemember;
	@FindBy(xpath="submit") WebElement btnLogin;
	@FindBy(xpath="//small[text()='Please enter a valid email address.']") WebElement loginError;
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void enterEmail(String email) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickRememberMe() {
        if (!checkRemember.isSelected()) {
            checkRemember.click();
        }
    }

    public void clickLoginButton() {
        btnLogin.click();
    }
    public String errormassage()
    {
    	return loginError.getText();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        checkRemember.click();
        btnLogin.click();
       
    }
}
