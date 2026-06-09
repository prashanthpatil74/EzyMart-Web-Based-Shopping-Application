package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LoginPage;
import com.TestData.LoginTestData;

public class LoginPageTestCase extends BaseClass {

	public LoginPage lp;

	@BeforeMethod
	public void setUp() {
		lp = new LoginPage(driver);
	}

	@Test(dataProvider = "LoginData")
	void testvalidUser(String email, String pass,String isStatus) {
		lp.enterEmail(email);
		lp.enterPassword(pass);
		lp.clickRememberMe();
		lp.clickLoginButton();
		
		if(isStatus.equalsIgnoreCase("TRUE")) {
		  Assert.assertTrue(driver.getCurrentUrl().contains("account"),"Login failed: 'Your Account' page is not displayed");
		}else if(isStatus.equalsIgnoreCase("FALSE"))
		{
			Assert.assertEquals(lp.errormassage(), "Please enter a valid email address.");
		}
	}

	@DataProvider(name = "LoginData")
	public String[][] loginTestData() throws Exception {
		return LoginTestData.readExcelData();
	}
}
