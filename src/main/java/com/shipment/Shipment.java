package com.shipment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipment {

	public Shipment(WebDriver driver2) {
		this.driver = driver2;
	PageFactory.initElements(driver2, this);	
		
		
	}



	public WebDriver driver;
	
	
	
//	WebElement bussiness = driver.findElement(By.id("bussiness_type2"));
	
	@FindBy(id="bussiness_type2")
	private WebElement bussiness;
	
	
//	WebElement d1 = driver.findElement(By.xpath("//input[@id='fedEx.4191:22650.cnt1.imp17291']"));
//	
	@FindBy(xpath="//input[@id='fedEx.4191:22650.cnt1.imp17291']")
	private WebElement d1;
	
	
//	WebElement d2 = driver.findElement(By.xpath("//input[@id='fedEx.4191:22650.cnt2.imp17291']"));
	
	@FindBy(xpath="//input[@id='fedEx.4191:22650.cnt2.imp17291']")
	private WebElement d2;
	
	
//	WebElement payoption = driver.findElement(By.id("pay_approval_artwork"));
	
	@FindBy(id="pay_approval_artwork")
	private WebElement payoption;
	
	
//	WebElement comment = driver.findElement(By.xpath("//textarea[@name='comment']"));
	@FindBy(xpath="//textarea[@name='comment']")
	private 	WebElement comment;
	
//	WebElement cont1 = driver.findElement(By.xpath("//td[@style='padding-top:10px;']//a//img"));
	@FindBy(xpath="//td[@style='padding-top:10px;']//a//img")
	private WebElement cont1;
	
	
//	WebElement checkout = driver.findElement(By.cssSelector("#checkout"));
	
	@FindBy(css="#checkout")
	private WebElement checkout;
	
	
	
//	WebElement complete = driver.findElement(By.xpath("//a[contains(text(), 'Complete Order')]"));
	@FindBy(xpath="//a[contains(text(), 'Complete Order')]")
	private WebElement complete;



	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getBussiness() {
		return bussiness;
	}



	public WebElement getD1() {
		return d1;
	}



	public WebElement getD2() {
		return d2;
	}



	public WebElement getPayoption() {
		return payoption;
	}



	public WebElement getComment() {
		return comment;
	}



	public WebElement getCont1() {
		return cont1;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getComplete() {
		return complete;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
