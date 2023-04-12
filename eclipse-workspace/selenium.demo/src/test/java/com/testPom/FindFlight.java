package com.testPom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FindFlight {
	
	WebDriver driver;
	
	WebElement login=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	
	WebElement flights = driver.findElement(By.xpath("//a[text()='Flights']"));
	
	WebElement type = driver.findElement(By.xpath("//input[@value='oneway']"));
	
	WebElement passengers = driver.findElement(By.xpath("//select[@name='passCount']"));
	
	//WebElement departing =driver.findElement(By.xpath(null))
	public FindFlight(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	  public WebElement loginSuccessFun() {
	        Assert.assertEquals("Login Successfully", login);
	        return login;
	  }
	  
	  public WebElement flightsFun(){
	        flights.click();
	        return flights;
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
