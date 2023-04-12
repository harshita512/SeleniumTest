package com.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DragClass {
private WebDriver driver;
	
	@Test
	public void test() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.navigate().to("https://demoqa.com/droppable");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).build().perform();
	
	WebElement dropmsg= driver.findElement(By.xpath("//div[@id='droppable']/p"));
	String msg= dropmsg.getText();
	Assert.assertEquals(msg, "Dropped!");
	}
	
	
	@Test
	public void dragbyObject() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.navigate().to("https://demoqa.com/dragabble");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement source = driver.findElement(By.id("dragBox"));
	Actions action = new Actions(driver);
	action.dragAndDropBy(source, 200, 200).perform();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



