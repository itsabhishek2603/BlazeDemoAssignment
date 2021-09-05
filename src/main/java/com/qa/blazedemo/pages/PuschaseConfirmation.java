package com.qa.blazedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.blazedemo.Base.BasePage;
import com.qa.blazedemo.Utils.Constants;

public class PuschaseConfirmation extends BasePage {

	private WebDriver driver;
	private By ConfirmTest = By.xpath("//h1");

	public PuschaseConfirmation(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public String getPurchaseConfirmationPageTitle() {
		
		return driver.getTitle();
		
	}
	
	
	public void getConfirmation() {
		String ConfirmationMessage= driver.findElement(ConfirmTest).getText();
		if (ConfirmationMessage.equalsIgnoreCase(Constants.ConfirmationText)){
			System.out.println("Booking Sucessfull");
		}
	}

}
