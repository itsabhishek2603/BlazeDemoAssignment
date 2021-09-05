package com.qa.blazedemo.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.blazedemo.Base.BaseTest;
import com.qa.blazedemo.Utils.Constants;

public class PurchaseConformationTest extends BaseTest{
	
	
	@BeforeClass
	public void setup_PurchaseConfirmPage() {
		homePage.bookingTicketSelection("Paris", "Rome");
		bookTicketPage = flightListPage.bookTicketBasedAirline("United Airlines");
		purchaseConfirmation=bookTicketPage.enterDetailsAndBookFlight();
	}
	
	
	@Test
	public void verifyPurchaseConfirmationtilte() {
		String verifyPurchaseConfirmationtilte = purchaseConfirmation.getPurchaseConfirmationPageTitle();
		Assert.assertEquals(verifyPurchaseConfirmationtilte, Constants.ConfirmationPageTitle);
	}

	@Test
	public void verifyConfirmText() {
		 String ConfirmText= purchaseConfirmation.getConfirmation();
		 Assert.assertEquals(ConfirmText, Constants.ConfirmationText);
		
	}
	
	
}
