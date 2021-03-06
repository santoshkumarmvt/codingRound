package com.cleartrip.pages;

import com.cleartrip.base.WebElementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FlightBookingPage {

    private WebDriver driver;

    private WebDriverWait wait;
    
    public FlightBookingPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }
    
    @FindBy(id = "OneWay")
    private WebElement oneWayRbtn;
    
    @FindBy(id = "FromTag")
    private WebElement fromTxtBx;
    
    @FindBy(id = "ToTag")
    private WebElement toTxtBx;
    
    @FindBy(xpath = "//*[@id='ui-id-1']//li")
    private List<WebElement> fromCityList;
    
    @FindBy(xpath = "//*[@id='ui-id-2']//li")
    private List<WebElement> toCityList;
    
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    private WebElement dtpkr;
    
    @FindBy(id = "SearchBtn")
    private WebElement searchBtn;
    
    private By searchSummary = By.className("searchSummary");

    public void clickOnOneWayRadioBtn() {
    	oneWayRbtn.click();
    }
    
    public void typeInFromTxtBx(String value) {
    	fromTxtBx.clear();
    	fromTxtBx.sendKeys(value);
    	wait.until(ExpectedConditions.visibilityOfAllElements(fromCityList));
    	fromCityList.get(0).click();
    }
    
    public void typeInToTxtBx(String value) {
    	toTxtBx.clear();
    	toTxtBx.sendKeys(value);
        wait.until(ExpectedConditions.visibilityOfAllElements(toCityList));
    	toCityList.get(0).click();
    }
    
    public void selectDate() {
    	dtpkr.click();
    }
    
    public void clickOnSearchBtn() {
    	searchBtn.click();
    	WebElementUtility.waitFor(5000);
    }
    
    public boolean isSearchSummaryPresent() {
    	return WebElementUtility.isElementPresent(driver, searchSummary);
    }
}
