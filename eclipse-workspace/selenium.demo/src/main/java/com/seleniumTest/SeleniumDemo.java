package com.seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] str){
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
	}

}
