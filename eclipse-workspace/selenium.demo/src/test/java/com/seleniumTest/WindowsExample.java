package com.seleniumTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsExample {
private WebDriver driver;
	
	@Test
	public void test() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.id("tabButton")).click();
	String parent=driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	for(String window : windows) {
		driver.switchTo().window(window);
	}
	
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(text);
	driver.switchTo().window(parent);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
