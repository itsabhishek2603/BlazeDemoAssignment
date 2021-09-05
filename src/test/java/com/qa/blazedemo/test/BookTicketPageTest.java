package com.qa.blazedemo.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.blazedemo.Base.BaseTest;
import com.qa.blazedemo.Utils.Constants;

public class BookTicketPageTest extends BaseTest {

	@BeforeClass
	public void BookPage_setUp() {
		 homePage.bookingTicketSelection("Paris", "Rome");
		 bookTicketPage = flightListPage.bookTicketBasedAirline("United Airlines");

	}

	@Test
	public void getBookTicketPageTitle() {

		String bookticketPageTitle = bookTicketPage.getBookPageTitle();
		Assert.assertEquals(bookticketPageTitle, Constants.Book_Page_Title);
	}

	@Test
	public void getTicketBooked() {
		bookTicketPage.enterDetailsAndBookFlight();
	}

}
