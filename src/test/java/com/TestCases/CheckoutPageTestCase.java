package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.CheckoutPage;

public class CheckoutPageTestCase extends BaseClass{

    CheckoutPage checkout;

    @BeforeMethod
    public void setUp() {
        checkout = new CheckoutPage(driver);
    }

    @Test(priority = 1)
    public void verifyCheckoutPageLoaded() {

        Assert.assertTrue(
            checkout.isPlaceOrderButtonDisplayed(),"Checkout page is not loaded properly"
        );
    }
    @Test(priority = 2)
    public void verifyCheckoutWithoutBillingDetails() {

        checkout.clickPlaceOrder();

        Assert.assertTrue(
            checkout.isBillingErrorDisplayed(),"Billing validation error message is not displayed"
        );
    }
}
