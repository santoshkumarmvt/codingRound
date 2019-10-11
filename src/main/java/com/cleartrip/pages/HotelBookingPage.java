package com.cleartrip.pages;

import com.cleartrip.base.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HotelBookingPage {

	private WebDriver driver;

	public HotelBookingPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }

	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTxtBx;
	
	@FindBy(xpath = "//*[@id='ui-id-1']//li[@class='list']/a")
    private List<WebElement> locationList;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchBtn;

	@FindBy(id = "travellersOnhome")
	private WebElement travellersDrpDwn;
	
	private By searchSummary = By.className("searchSummary");
	
	public void clickOnHotelLink() {
		hotelLink.click();
	}
	
	public void typeInLocalityTextBox(String value) {
		localityTxtBx.clear();
		localityTxtBx.sendKeys(value);
		WebElementUtility.waitFor(5000);
		locationList.get(0).click();
	}
	
	public void selectInTravellers(String visibleText) {
		new Select(travellersDrpDwn).selectByVisibleText(visibleText);
	}
	
	public void clickOnSearchButton() {
		searchBtn.click();
	}
	
	 public boolean isSearchSummaryPresent() {
	    	return WebElementUtility.isElementPresent(driver, searchSummary);
	    }
}
