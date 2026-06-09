package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends InitialSetUp{

	public SearchProductPage(WebDriver driver) {
        super(driver);
    }
	 @FindBy(id = "woocommerce-product-search-field-0")
	    WebElement txtSearchBox;

	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement btnSearch;

	    @FindBy(xpath = "//ul[contains(@class,'products')]/li")
	    List<WebElement> searchResultProducts;

	    @FindBy(xpath = "//p[contains(text(),'No products were found')]")
	    WebElement noProductMessage;

	    @FindBy(xpath = "//h1[contains(text(),'Search results')]")
	    WebElement searchResultHeading;

	    public void enterProductName(String productName) {
	        txtSearchBox.clear();
	        txtSearchBox.sendKeys(productName);
	    }

	    public void clickSearchButton() {
	        btnSearch.click();
	    }

	    public void searchProduct(String productName) {
	        enterProductName(productName);
	        clickSearchButton();
	    }


	    public boolean isSearchResultPageDisplayed() {
	        return searchResultHeading.isDisplayed();
	    }

	    public boolean isProductDisplayed() {
	        return searchResultProducts.size() > 0;
	    }

	    public boolean isNoProductMessageDisplayed() {
	        return noProductMessage.isDisplayed();
	    }
}
