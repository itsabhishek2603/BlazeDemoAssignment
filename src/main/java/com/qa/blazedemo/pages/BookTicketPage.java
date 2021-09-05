package com.qa.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.blazedemo.Base.BasePage;
import com.qa.blazedemo.Utils.Constants;

public class BookTicketPage extends BasePage {
	
	
	private WebDriver driver;
	private By bookPageTitle = By.xpath("//title");
	private By Name = By.id("inputName");
	private By Address = By.id("address");
	private By City = By.id("city");
	private By State = By.id("state");
	private By ZipCode = By.id("zipCode");
	private By CardType =By.id("cardType");
	private By CardNumber = By.id("creditCardNumber");
	private By CreditCardMonth =  By.id("creditCardMonth");
	private By CreditCardYear = By.id("creditCardYear");
	private By NameOnCard =By.id("nameOnCard");
	private By RememberMe = By.id("rememberMe");
	private By PurchaseFlightButton = By.xpath("//input[@type='submit']");
	
	
			
	public BookTicketPage(WebDriver driver) {
		this.driver = driver;
		
	}
	// Instead of using driver.findElement an utility can be created and called here with class name or object name. Utility should be created
	// for Explicit wait , Implicit wait and JavascriptExecutor , FindElement, FindElements , Select the value from dropdown etc.
	public String getBookPageTitle() {
		
		return driver.getTitle();
	}
	
	public PuschaseConfirmation enterDetailsAndBookFlight() {
		driver.findElement(Name).sendKeys(Constants.NAME);
		driver.findElement(Address).sendKeys(Constants.ADDRESS);
		driver.findElement(City).sendKeys(Constants.CITY);
		driver.findElement(State).sendKeys(Constants.STATE);
		driver.findElement(ZipCode).sendKeys(Constants.ZIPCODE);
		Select Card = new Select(driver.findElement(CardType));
		Card.selectByVisibleText(Constants.creditCardType);
		driver.findElement(CardNumber).sendKeys(Constants.creditCardNumber);
		driver.findElement(CreditCardMonth).sendKeys(Constants.creditCardMonth);
		driver.findElement(CreditCardYear).sendKeys(Constants.creditCardYear);
		driver.findElement(NameOnCard).sendKeys(Constants.nameOnCard);
		driver.findElement(RememberMe).click();
		driver.findElement(PurchaseFlightButton).click();
		
		return new PuschaseConfirmation(driver);
	}

}
