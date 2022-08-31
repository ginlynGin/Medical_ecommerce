package com.addtocart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//using pojo concept we can write getters and setters
public class AddToCart {

	public static WebDriver driver;


	@FindBy(className="button")
	private WebElement cont;



	@FindBy(css="#moredetailshd191 > img")
	private  WebElement view;



	@FindBy(id="add_to_cart")
	private WebElement addc;



	@FindBy(xpath="//a[@class='button']//img")
	private WebElement cptc;

	
	
	@FindBy(css="#imagehd191")
	private WebElement view1;

	//WebElement add2 = driver.findElement(By.cssSelector("#add_to_cart"));

	@FindBy(css="#add_to_cart")
	private WebElement add2;


	//WebElement ptc = driver.findElement(By.xpath("//a[@class='button'][2]//img"));

	@FindBy(xpath="//a[@class='button'][2]//img")
	private WebElement ptc;

	
	
	

	public AddToCart(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getCont() {
		return cont;
	}


	public WebElement getView() {
		return view;
	}


	public WebElement getAddc() {
		return addc;
	}


	public WebElement getCptc() {
		return cptc;
	}


	public WebElement getView1() {
		return view1;
	}


	public WebElement getAdd2() {
		return add2;
	}


	public WebElement getPtc() {
		return ptc;
	}


	



}
