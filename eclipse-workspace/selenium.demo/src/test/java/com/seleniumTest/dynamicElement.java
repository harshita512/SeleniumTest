package com.seleniumTest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicElement {
private WebDriver driver;
	

@Test
public void test()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
//enter user name "test"

WebElement element1= 
driver.findElement(By.xpath("//input[@name='userName']"));
element1.sendKeys("test");
//enter password "test"
WebElement element2  = 
driver.findElement(By.xpath("//input[@name='password']"));
element2.sendKeys("test");
// click on submit button
WebElement element3 = 
driver.findElement(By.xpath("//input[@name='submit']"));
element3.click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Validate "Login Successfully" text
// WebElement element4 = 
driver.findElement(By.xpath("//h3[text()='Login Successfully']")); 

//Click on Flight,enter all the fields
driver.findElement(By.xpath("//a[text()='Flights']")).click(); 
//to click on continue button

driver.findElement(By.xpath("//input[@name='findFlights']")).click();
//Validate text "After flight finder - No Seats Available "
//WebElement element4 = 
//driver.findElement(By.xpath("//font[text()='After flight finder - No Seats 
//Available ']")); 
}
}  









