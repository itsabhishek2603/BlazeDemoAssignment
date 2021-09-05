package com.qa.blazedemo.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.blazedemo.Base.BaseTest;
import com.qa.blazedemo.Utils.Constants;

public class FlightListPageTest extends BaseTest{
	
	
	@BeforeClass
	public void flightPageSetup() {
		flightListPage=homePage.bookingTicketSelection("Paris", "Rome");
		
	}
	
	@Test
	public void getFlightPageTitle() {
		 String FlightPageTitle = flightListPage.getHomePageTitle();
		 Assert.assertEquals(FlightPageTitle, Constants.Flight_Page_Title);
	}
	
	@Test
	public void selectFlightBasedOnAirlines() {
		
		bookTicketPage=flightListPage.bookTicketBasedAirline("United Airlines");
		
		
		
		
	}
	
	
	
	
	

	
	
}
