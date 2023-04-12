package com.testPom;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicLocator {
	
private WebDriver driver;
	
	@Test
	public void satisficelocator() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.navigate().to("https://www.satisfice.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List<WebElement> element = driver.findElements(By.xpath("//ul[@id='menu-main-navigation']/li/a/span"));
	System.out.println("Number of elements:" +element.size());
	
	for(int i=1;i<element.size();i++) {
		
	String locator=	"//ul[@id='menu-main-navigation']/li["+i+"]/a/span";
	
	System.out.println(driver.findElement(By.xpath(locator)).getText());
		
	}
	
	WebElement classes=driver.findElement
			(By.xpath(	"//ul[@id='menu-main-navigation']/li/a/span"));
	
	Actions action=new Actions(driver);
	action.moveToElement(classes).build().perform();
	List<WebElement> submenu =driver.findElements(By.xpath(("//ul[@class='sub-menu']/li")));
	System.out.println("submenu size is :" +submenu.size());
	for(int i=2;i<submenu.size();i++) {
		System.out.println("iteration:" + i + "\n" + submenu.get(i).findElement(By.xpath("//a/span")).getText());
	}
	
   
   
   
   
   
	
	
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
