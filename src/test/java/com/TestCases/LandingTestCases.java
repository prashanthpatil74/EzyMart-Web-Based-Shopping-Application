package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LandingPage;

public class LandingTestCases extends BaseClass {
	LandingPage lp;
	@BeforeMethod
	public void setUp()
	{
		 lp= new LandingPage(driver);
	}

	@Test
	void testLinkLoginDisplay() {
		Assert.assertTrue(lp.loginLink().isDisplayed());
	}
	@Test
	void testLinkLoginEnabled() {
		lp.loginLink().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://javabykiran.in/other/CC/login");
	}

}
