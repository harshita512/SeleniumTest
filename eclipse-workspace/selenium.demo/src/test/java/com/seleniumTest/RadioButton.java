package com.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	
	
	
		private WebDriver driver;
		
		@Test
		public void testFacebookSignUp() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement radioButton= driver.findElement(By.xpath("//label[@for='yesRadio']"));
		radioButton.click();
	boolean status=	radioButton.isSelected();
	System.out.println(status);
		
		
		
		

}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		