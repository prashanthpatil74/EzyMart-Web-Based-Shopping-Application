package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends InitialSetUp{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

	 @FindBy(id = "billing_first_name")
	    WebElement txtFirstName;

	    @FindBy(id = "billing_last_name")
	    WebElement txtLastName;

	    @FindBy(id = "billing_address_1")
	    WebElement txtAddress;

	    @FindBy(id = "billing_city")
	    WebElement txtCity;

	    @FindBy(id = "billing_postcode")
	    WebElement txtPostCode;

	    @FindBy(id = "billing_phone")
	    WebElement txtPhone;

	    @FindBy(id = "billing_email")
	    WebElement txtEmail;

	    @FindBy(id = "place_order")
	    WebElement btnPlaceOrder;

	    @FindBy(xpath = "//input[@id='payment_method_cod']")
	    WebElement radioCashOnDelivery;

	    @FindBy(xpath = "//p[contains(text(),'Thank you')]")
	    WebElement txtOrderConfirmation;


	    @FindBy(xpath = "//ul[@class='woocommerce-error']")
	    WebElement billingErrorMessage;

	    public void enterFirstName(String fname) {
	        txtFirstName.clear();
	        txtFirstName.sendKeys(fname);
	    }

	    public void enterLastName(String lname) {
	        txtLastName.clear();
	        txtLastName.sendKeys(lname);
	    }

	    public void enterAddress(String address) {
	        txtAddress.clear();
	        txtAddress.sendKeys(address);
	    }

	    public void enterCity(String city) {
	        txtCity.clear();
	        txtCity.sendKeys(city);
	    }

	    public void enterPostCode(String postcode) {
	        txtPostCode.clear();
	        txtPostCode.sendKeys(postcode);
	    }

	    public void enterPhone(String phone) {
	        txtPhone.clear();
	        txtPhone.sendKeys(phone);
	    }

	    public void enterEmail(String email) {
	        txtEmail.clear();
	        txtEmail.sendKeys(email);
	    }

	    public void selectCashOnDelivery() {
	        if (!radioCashOnDelivery.isSelected()) {
	            radioCashOnDelivery.click();
	        }
	    }

	    public void clickPlaceOrder() {
	        btnPlaceOrder.click();
	    }
	    
	    public boolean isPlaceOrderButtonDisplayed() {
	        return btnPlaceOrder.isDisplayed();
	    }

	    public boolean isBillingErrorDisplayed() {
	        return billingErrorMessage.isDisplayed();
	    }
}
