package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends InitialSetUp{

	@FindBy(xpath="//h2[text()='Your Account']") WebElement textyourAccount;
	@FindBy(xpath="//a[@title='Profile' and @class='button secondary expand nomarg']") WebElement linkProfile;
	@FindBy(xpath="//a[@title='Order History' and @class='button secondary expand nomarg']") WebElement linkOrderHistory;
	@FindBy(xpath="//a[@title='Address Book' and @class='button secondary expand nomarg']") WebElement linkAdressBook;
	@FindBy(xpath="//a[@title='Digital Downloads' and @class='button secondary expand nomarg']") WebElement linkDigitalDownloads;
	@FindBy(xpath="//a[@title='Newsletter Subscriptions' and @class='button secondary expand nomarg']") WebElement linkNewsSletter;
	@FindBy(xpath="//a[@title='Log Out' and @class='button secondary expand nomarg']") WebElement linkLogout;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public String textWelcome()
	{
		return textyourAccount.getText();
	}
	public boolean isYourAccountPageDisplayed() {
        return textyourAccount.isDisplayed();
    }
	public void clickProfile() {
        linkProfile.click();
    }

    public void clickOrderHistory() {
        linkOrderHistory.click();
    }

    public void clickAddressBook() {
    	linkAdressBook.click();
    }

    public void clickDigitalDownloads() {
        linkDigitalDownloads.click();
    }

    public void clickNewsletter() {
    	linkNewsSletter.click();
    }

    public void clickLogout() {
        linkLogout.click();
    }

}
