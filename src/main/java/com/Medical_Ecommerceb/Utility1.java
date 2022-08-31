package com.Medical_Ecommerceb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility1 {

public static WebDriver driver;//null driver
	
	
	
	
	public static WebDriver browser(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium Workspace\\Medical_Ecommerce\\driver\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			
		}
		return driver;
		
		
		
	}
	
	
	public static void close() {
		driver.close();
	}
	
	public static void click(WebElement click) {
		
		click.click();	
	}
	
	public static void send(WebElement send,String value) {
		
		send.sendKeys(value);
		
		
	}
	
//	public static void get(String url) {
//		
//		driver.get(url);
//		
//	}
	
	
	public static void launch_Url(String url) {

		driver.get(url);
	}
	
	public static void quit() {
		
		driver.quit();
		
		
	}
	public static void isleep(int t) {
		
		driver.manage().timeouts().implicitlyWait(t,TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
}
