package com.qa.blazedemo.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	public WebDriver driver;
	public Properties prop;
	
	// This method is used to initialize the browser on the basis of given browser.
	// This returns WebDriver driver.
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser is :" + browser);
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		
		else {
			System.out.println("Please pass the correct browser value :" + browser);
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		
		return driver;
		
		
		
		
	}
	
	// it returns Properties Prop reference.
	// This method is used to load the properties from config.properties file.
	
	public Properties init_prop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\arind\\eclipse-workspace\\BlazeDemo\\BlazeDemoAssignment\\src\\main\\java\\com\\qa\\blazedemo\\Config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	
	
	

}