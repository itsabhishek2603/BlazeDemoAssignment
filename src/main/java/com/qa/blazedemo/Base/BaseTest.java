package com.qa.blazedemo.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.blazedemo.pages.BookTicketPage;
import com.qa.blazedemo.pages.FlightListPage;
import com.qa.blazedemo.pages.HomePage;
import com.qa.blazedemo.pages.PuschaseConfirmation;



public class BaseTest {
	
	public BasePage basePage;
	public Properties prop;
	public WebDriver driver;
	public HomePage homePage;
	public FlightListPage flightListPage;
	public PuschaseConfirmation purchaseConfirmation;
	public BookTicketPage bookTicketPage;
	
	
	
	@BeforeTest
	public void setUp() {
		
		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");
		driver= basePage.init_driver(browser);
		homePage = new HomePage(driver);
		driver.get(prop.getProperty("url"));		
	}
	
	@AfterTest
	public void tearDown(){
	  
		driver.quit();
		
	}
	

}
