package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LandingPage;
import com.Pages.RegisterPage;
import com.TestData.RegisterTestData;

public class RegisterTestCases extends BaseClass {
	public RegisterPage rp;
	public LandingPage lp;
	
	@BeforeMethod
	public void setUp()
	{
		 lp= new LandingPage(driver);
		 rp=new RegisterPage(driver);

	}

	@Test(dataProvider = "RegisterData")
	void testRegistervalid(String title,String firstname,String lastname,String emailaddress,String phoneNo,String MobileNo,String pass,String cpass,String isStatus) {
		lp.registerLink();
		rp.registerPage(title,firstname,lastname,emailaddress,phoneNo,MobileNo,pass,cpass);
		Assert.assertEquals(hp.textWelcome(), "Welcome to My Store");
		
		if(isStatus.equalsIgnoreCase("True"))
		{
			Assert.assertTrue(rp.successMassage().contains("email address has been added"));
		}else if(isStatus.equalsIgnoreCase("False"))
		{
			
		}
	}

	@DataProvider(name="RegisterData")
	public String[][] resisterData() throws Exception {
		
		return RegisterTestData.readExcelData();
	}
}
