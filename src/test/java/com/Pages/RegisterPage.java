package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends InitialSetUp{

	@FindBy(name = "title") WebElement txtTitle;
	@FindBy(name = "first_name") WebElement txtFirst_Name;
	@FindBy(name = "last_name") WebElement txtLast_Name;
	@FindBy(name = "email") WebElement txtEmail;
	@FindBy(name = "phone") WebElement txtPhone;
	@FindBy(name = "mobile") WebElement txtMobile;
	@FindBy(name = "password") WebElement txtPassword;
	@FindBy(name = "passconf") WebElement txtConfirmPassword;
	@FindBy(name = "terms_agree") WebElement checkIAgree;
	@FindBy(xpath="//input[@id='register_submit']") WebElement btnRegister;
	@FindBy(xpath="//li[text()='Your email address has been added to our mailing list.']") WebElement successMassage;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void registerPage(String title,String first_Name,String last_Name, String email, String phone,String mobile,String password,String confirmPassword)
	{
		txtTitle.sendKeys(title);
		txtFirst_Name.sendKeys(first_Name);
		txtLast_Name.sendKeys(last_Name);
		txtEmail.sendKeys(email);
		txtPhone.sendKeys(phone);
		txtMobile.sendKeys(mobile);
		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(confirmPassword);
		checkIAgree.click();
		btnRegister.click();
	}
	
	public String successMassage()
	{
		return successMassage.getText();
	}
    public void enterTitle(String title) {
        txtTitle.clear();
        txtTitle.sendKeys(title);
    }

    public void enterFirstName(String firstName) {
    	txtFirst_Name.clear();
    	txtFirst_Name.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
    	txtLast_Name.clear();
    	txtLast_Name.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void enterPhone(String phone) {
        txtPhone.clear();
        txtPhone.sendKeys(phone);
    }

    public void enterMobile(String mobile) {
        txtMobile.clear();
        txtMobile.sendKeys(mobile);
    }

    public void enterPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        txtConfirmPassword.clear();
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickIAgreeCheckbox() {
        if (!checkIAgree.isSelected()) {
            checkIAgree.click();
        }
    }

    public void clickRegisterButton() {
        btnRegister.click();
    }

    public boolean isRegistrationSuccessful() {
        return successMassage.isDisplayed();
    }
	
}
