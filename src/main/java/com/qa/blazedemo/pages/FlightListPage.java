package com.qa.blazedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.blazedemo.Base.BasePage;

public class FlightListPage extends BasePage {

	WebDriver driver;
	private By FlightListTitle = By.xpath("//title");
	private By ChooseFlightButton = By.xpath("//input[@type='submit']");

	public FlightListPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

// In this method I have hardcoded the value...It can be done by fetching the value from excel by using Apache POI.
	public BookTicketPage bookTicketBasedAirline(String Airlines) {
        
		List<WebElement> Elements = driver.findElements(ChooseFlightButton);

		if (Airlines == "United Airlines") {
			Elements.get(4).click();
		}
		
		return new BookTicketPage(driver);

	}

}
