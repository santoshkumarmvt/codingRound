package com.cleartrip.tests;

import com.cleartrip.base.BaseClass;
import com.cleartrip.pages.HotelBookingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelBookingPageTest extends BaseClass {

	@Test(description="To verify hotel search operation")
	public void shouldBeAbleToSearchForHotels() {
		HotelBookingPage hotelBookingPage = new HotelBookingPage(driver);
		
		hotelBookingPage.clickOnHotelLink();
		hotelBookingPage.typeInLocalityTextBox("Indiranagar, Bangalore");
		hotelBookingPage.selectInTravellers("1 room, 2 adults");
		hotelBookingPage.clickOnSearchButton();
		
		Assert.assertTrue(hotelBookingPage.isSearchSummaryPresent(), "Hotel search operation didn't work properly");
	}
}
