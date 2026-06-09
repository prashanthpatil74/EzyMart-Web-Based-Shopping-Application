package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.SearchProductPage;

public class SerachProductTestCase extends BaseClass {

	SearchProductPage search;

	@BeforeMethod
	public void setUp() {
		search = new SearchProductPage(driver);
	}

	@Test(priority = 1)
	public void verifySearchWithValidProduct() {

		search.searchProduct("Mobile");

		Assert.assertTrue(search.isSearchResultPageDisplayed(), "Search result page is not displayed");
		Assert.assertTrue(search.isProductDisplayed(), "Products are not displayed for valid search");
	}

	@Test(priority = 2)
	public void verifySearchWithInvalidProduct() {

		search.searchProduct("InvalidProduct123");
		Assert.assertTrue(search.isNoProductMessageDisplayed(), "No product found message is not displayed");
	}

	@Test(priority = 3)
	public void verifySearchWithPartialKeyword() {

		search.searchProduct("Mob");

		Assert.assertTrue(search.isProductDisplayed(), "Products are not displayed for partial keyword search");
	}

	@Test(priority = 4)
	public void verifySearchWithDifferentCase() {

		search.searchProduct("mObIlE");
		Assert.assertTrue(search.isProductDisplayed(), "Search is case-sensitive, products not displayed");
	}

	@Test(priority = 5)
	public void verifySearchWithBlankInput() {

		search.searchProduct("");

		Assert.assertTrue(search.isNoProductMessageDisplayed(), "No product message is not displayed for blank search");
	}
}
