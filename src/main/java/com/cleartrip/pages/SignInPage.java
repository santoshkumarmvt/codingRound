package com.cleartrip.pages;

import com.cleartrip.base.WebElementUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

	private WebDriver driver;
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Your trips")
    private WebElement yourTripsLinkTxt;
	
	@FindBy(id = "SignIn")
    private WebElement signInBtn;
	
	@FindBy(id = "signInButton")
    private WebElement frameSignInButtonBtn;
	
	@FindBy(id = "errors1")
    private WebElement errors1Txt;
	
	public void clickOnyourTripsLink() {
		yourTripsLinkTxt.click();
	}
	
	public void clickOnSignInBtn() {
		signInBtn.click();
	}
	
	public void switchToModalWindow() {
		driver.switchTo().frame("modal_window");
		WebElementUtility.waitFor(3000);
	}
	
	public void clickOnSignInBtnOnFrame() {
		frameSignInButtonBtn.click();
	}
	
	public String getTextFromErrorMsg() {
		return errors1Txt.getText();
	}
}
