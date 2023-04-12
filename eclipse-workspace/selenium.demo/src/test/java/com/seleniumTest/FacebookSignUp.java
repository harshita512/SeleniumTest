package com.seleniumTest;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	
	private WebDriver driver;
	
	@Test
	public void testFacebookSignUp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement element =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				//element.click();
		//WebElement firstelement =driver.findElement(By.xpath("//input[@name='firstname']"));
		//firstelement.sendKeys("harshita");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("verma");
		
		
		//WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		//Select select =new Select(month);
		//select.selectByVisibleText("Dec");
		
		//Select selectDay =new Select(driver.findElement(By.xpath("//select[@id='day']")));
		//selectDay.selectByIndex(4);
		//
		String title = driver.getTitle();
		System.out.println(title);
		
		//String source =driver.getPageSource();
		// System.out.println(source);
		// driver.navigate().refresh();
		 
		 //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		// String url = driver.getCurrentUrl();
		// System.out.println(url);
		// Assert.assertTrue(url.contains("login/identify"));
		 
		// driver.navigate().back();
		// driver.navigate().forward();
		 
		
		
		WebElement element = driver.findElement(By.xpath("//h2"));
		String text = element.getText();
		System.out.println(text);
		
		
		WebElement input =driver.findElement(By.id("email"));
		String att =input.getAttribute("aria-label");
		System.out.println(att);
		
		WebElement loginButton =driver.findElement(By.name("login"));
		String fontSize =loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
