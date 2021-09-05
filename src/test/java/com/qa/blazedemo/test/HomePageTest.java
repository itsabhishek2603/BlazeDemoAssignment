package com.qa.blazedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.blazedemo.Base.BaseTest;
import com.qa.blazedemo.Utils.Constants;

public class HomePageTest extends BaseTest {

	@Test(priority =1)
	public void verifyHomePageTitleTest() {

		String title = homePage.gethomePageTitle();
		System.out.println("Login page title is : " + title);
		Assert.assertEquals(title, Constants.Home_Page_Title);

	}

	@Test(priority = 2)
	public void isVacationLinkPresent() {

		boolean Vacationlink = homePage.isVacationLinkExist();
		Assert.assertEquals(Vacationlink, Constants.IS_Vacation_Link);

	}
	
	@Test(priority =3)
	public void SearchforFlight() {
		// Here I have hardcoded the to and from values..it can be fetched from excel using Apache POI.
		flightListPage=homePage.bookingTicketSelection("Paris","Rome");
		
	}

}
