package com.cleartrip.tests;

import com.cleartrip.base.BaseClass;
import com.cleartrip.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass {

	@Test(description="To verify that it should throw an error if sign in details are missing")
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		SignInPage signInPage = new SignInPage(driver);
		signInPage.clickOnyourTripsLink();
		signInPage.clickOnSignInBtn();
		signInPage.switchToModalWindow();
		signInPage.clickOnSignInBtnOnFrame();

		String errorMsg = signInPage.getTextFromErrorMsg();
		Assert.assertTrue(errorMsg.contains("There were errors in your submission"));
	}
}
