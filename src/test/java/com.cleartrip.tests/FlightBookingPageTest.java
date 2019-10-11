package com.cleartrip.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cleartrip.base.BaseClass;
import com.cleartrip.pages.FlightBookingPage;

public class FlightBookingPageTest extends BaseClass{

	@Test(description="Verify that results appear for one way journey")
	public void testThatResultsAppearForAOneWayJourney1() {
		FlightBookingPage flightBookingPage = new FlightBookingPage(driver);
		
		flightBookingPage.clickOnOneWayRadioBtn();
		flightBookingPage.typeInFromTxtBx("Bangalore");
		flightBookingPage.typeInToTxtBx("Delhi");
		flightBookingPage.selectDate();
		flightBookingPage.clickOnSerchBtn();
		
		Assert.assertTrue(flightBookingPage.isSearchSummaryPresent(), "Search summary is not present");
	}
}
