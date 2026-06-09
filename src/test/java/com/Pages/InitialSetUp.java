package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InitialSetUp {

	InitialSetUp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
