package com.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	private WebDriver driver;
	
	@Test
	public void testFacebookSignUp() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.navigate().to("https://demoqa.com/checkbox");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	boolean status =driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
   System.out.println(status);
	driver.findElement(By.xpath("//span[text()='Home']")).click();
  status =driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
  System.out.println(status);

}
}







