package com.seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	
	
	@Test
	
	public void testselenium() {
		//System.setProperty("webdriver.chrome.driver", "/Users/harshita/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.facebook.com/");
		//System.setProperty("webdriver.gecko.driver", "/Users/harshita/Downloads/geckodriver");
		
		WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();
		
		//EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
	}
	
		

	

}
