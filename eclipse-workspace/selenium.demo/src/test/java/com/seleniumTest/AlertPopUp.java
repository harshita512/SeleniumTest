package com.seleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {
private WebDriver driver;
	
	@Test
	public void test() {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.id("alertButton")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	//driver.findElement(By.id("timerAlertButton")).click();
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.alertIsPresent());
	
	driver.findElement(By.id("confirmButton")).click();
	Alert alert2 = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert2.dismiss();
	
	
	driver.findElement(By.id("promtButton")).click();
	Alert alert3 = driver.switchTo().alert();
	alert3.sendKeys("Testing");
	alert3.accept();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
