package com.login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//this is the gettrs and setters
public class Login {

	public static WebDriver driver;
	
	
	@FindBy(css="#tab_login")
	private WebElement login;
	
	
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;
	
	
	
	@FindBy(name="password")
	private   WebElement pwd;
	
	
	@FindBy(xpath="//div[@style='text-align: left; padding-top:19px;']/a/img")
	private WebElement signin;
	
	
	public  Login(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
//	WebElement mail = driver.findElement(By.));
	
	public WebElement getLogin() {
		return login;
	}


	public WebElement getMail() {
		return mail;
	}


	public WebElement getPwd() {
		return pwd;
	}


	public WebElement getSignin() {
		return signin;
	}	
}
