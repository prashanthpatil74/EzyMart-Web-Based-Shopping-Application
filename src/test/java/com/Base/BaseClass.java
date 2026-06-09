package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.RegisterPage;
import com.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public  HomePage hp;
	@BeforeMethod
	public void setUp() throws Exception
	{
		String brName=ReadConfig.readConfigData("browser");
		
		if(brName.equalsIgnoreCase("chrome"))
		{
			 driver= new ChromeDriver();
		}else if(brName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}else if(brName.equalsIgnoreCase("ie"))
		{
			driver= new InternetExplorerDriver();
		}else
		{
			System.out.println("invalid browser!!!");
		}
		String url=ReadConfig.readConfigData("url");
		driver.get(url);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
