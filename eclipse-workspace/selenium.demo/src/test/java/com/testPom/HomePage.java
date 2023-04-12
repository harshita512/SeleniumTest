package com.testPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;





public class HomePage {
	
	WebDriver driver;
	
	WebElement username =driver.findElement(By.xpath(" //input[@name='userName']"));
	
	
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	
	WebElement submit =driver.findElement(By.xpath("//input[@name='submit']"));
	
	
	public void HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
	}
	public WebElement username() {
		username.sendKeys("Test");
		return username;
	}
	
	public WebElement password() {
		password.sendKeys("Test");
		return password;
	}
	
	public WebElement submit() {
		submit.click();
		return submit;
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	


	
	
	


