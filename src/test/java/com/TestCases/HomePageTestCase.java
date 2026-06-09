package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.HomePage;

public class HomePageTestCase extends BaseClass {

	public HomePage hp;

	@BeforeMethod
	public void setUp() {
		hp = new HomePage(driver);
	}

	@Test(priority = 1, description = "Verify Your Account page is displayed after successful login")
	public void verifyAccountPageDisplayed() {

		hp.isYourAccountPageDisplayed();
		Assert.assertTrue(hp.isYourAccountPageDisplayed(), "Your Account page is NOT displayed after login");
	}

	@Test(priority = 2, description = "Verify navigation to Order History page")
	public void verifyOrderHistoryNavigation() {

		hp.clickOrderHistory();

		String expectedTitle = "Order History";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle), "❌ User is NOT navigated to Order History page");
	}

	@Test(priority = 3, description = "Verify navigation to Address Book page")
	public void verifyAddressBookNavigation() {

		hp.clickAddressBook();
		Assert.assertTrue(driver.getPageSource().contains("Address Book"), "Address Book page is NOT displayed");
	}

	@Test(priority = 4, description = "Verify logout functionality")
	public void verifyLogoutFunctionality() {

		hp.clickLogout();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "User is NOT logged out successfully");

	}
}
