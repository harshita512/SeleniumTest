package com.testPom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	 HomePage login; // 1. Login Page
	    FindFlight demoFlights; //2. Flights page
	   
	    
	    @BeforeTest
	    public void setup() 
	    {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.navigate().to("https://demo.guru99.com/test/newtours/index.php"); 
	    }
	    @Test//(dataProvider = "Test")
	    public void demoGuru() {//Am getting this exception at run time org.TestNG.testngException 
	    	
	      
	        
	        login = new HomePage();
	       login.username();
	        login.password();
	        login.submit();
	        
	        demoFlights = new FindFlight(driver);
	        demoFlights.loginSuccessFun();
	        demoFlights.flightsFun();
	        //demoFlights.findFlightsFun();
	        
	        //demoAfterFlights = new DemoAfterFlights(driver);
	       // demoAfterFlights.flightFinderFun();
	        
	    }
	    
	    @DataProvider(name = "Test")
	    public Object[][] dataMethod(){
	        return new Object[][] {{"Param1"},{"Param2"}};
	    }
	    @AfterClass
	    public void closeBrowser()
	    {
	        driver.quit();
	    }
	}


	
	
	
	
	
	
	
	
	
	

