
package com.qa.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.blazedemo.Base.BasePage;



public class HomePage extends BasePage {


	private WebDriver driver;
	private By HomePageText = By.xpath("//div/h1");
	private By vacationLink = By.xpath("//a[@href=\"vacation.html\"]");
	private By fromDropdown = By.xpath("//select[@name='fromPort']");
	private By toDropdown =   By.xpath("//select[@name='toPort']");
	private By findFlightsButton= By.xpath("//input[@type='submit']");
	private By vacationImage =By.xpath("//div[@class='container']/img");
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public String gethomePageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean isVacationLinkExist() {
		return driver.findElement(vacationLink).isDisplayed();
		
	}
	
	public FlightListPage bookingTicketSelection(String from, String to) {
		
	
		Select dropDownItemFrom = new Select(driver.findElement(fromDropdown));
		Select dropDownItemTo = new Select(driver.findElement(toDropdown));
		dropDownItemFrom.selectByVisibleText(from);
		dropDownItemTo.selectByVisibleText(to);
		driver.findElement(findFlightsButton).click();
		
		
		return new FlightListPage(driver);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
