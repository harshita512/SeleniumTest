package com.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample {
	
	
	private WebDriver driver;
	
	@Test
	public void testFacebookSignUp() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.navigate().to("https://demoqa.com/buttons");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	Actions action =new Actions(driver);
	WebElement button1=driver.findElement(By.id("doubleClickBtn"));
	action.doubleClick(button1).build().perform();
	
	String message1=driver.findElement(By.id("doubleClickMessage")).getText();
	Assert .assertEquals(message1,"You have done a double click");
	
	WebElement button2=driver.findElement(By.id("rightClickBtn"));
	action.contextClick(button2).build().perform();
	String message2=driver.findElement(By.id("rightClickMessage")).getText();
	Assert.assertEquals(message2, "You have done a right click");
	
	WebElement button3= driver.findElement(By.xpath("//button[text()='Click Me']"));
	action.click(button3).build().perform();
	String message3=driver.findElement(By.id("dynamicClickMessage")).getText();
	Assert.assertEquals(message3, "You have done a dynamic click");
	
	
	

}
}