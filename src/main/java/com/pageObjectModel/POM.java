package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.addtocart.AddToCart;
import com.login.Login;
import com.shipment.Shipment;

public class POM {

	public static WebDriver driver;
	
	private Login lp;
	private AddToCart addcart;
	private Shipment  ship;
	
	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	public Login getlp() {
		
		
		lp = new Login(driver);
		return lp;
	}
	
	public AddToCart getaddcart() {
		addcart = new AddToCart(driver);
		return addcart;
	}
	
	
	public Shipment getship() {
		
		ship = new Shipment(driver);
		return ship;
			
	}		
}
