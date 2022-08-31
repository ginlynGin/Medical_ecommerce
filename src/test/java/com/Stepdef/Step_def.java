package com.Stepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_class;
import com.helper_File.File_readm;
import com.pageObjectModel.POM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def extends Base_class {
	public WebDriver driver;
	POM call = new POM(driver);	
	
	
	@Given("enter valid url")
	public void enter_valid_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "D:/selenium Workspace/Selenium/driver/chromedriver.exe");
//		 driver = new ChromeDriver();
//		driver.get("https://www.custompedometer.com/");
//		driver.manage().window().maximize();
//		WebElement login = driver.findElement(By.id("tab_login"));
//		login.click();
		
		
		
		browser("chrome");
		
		isleep(10);
		launch_Url(File_readm.getinstancef().getinstancec().geturl());
		driver.manage().window().maximize();
		
		
	
		isleep(10);
		click(call.getlp().getLogin());
		isleep(10);
		
		
		click(call.getlp().getSignin());

		
		
		
		
		
		
	}

	@And("enter the email id")
	public void enter_the_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		send(call.getlp().getMail(),File_readm.getinstancef().getinstancec().username());

			
		
	}


	@When("enter the password for further process")
	public void enter_the_password_for_further_process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		send(call.getlp().getPwd(),File_readm.getinstancef().getinstancec().getpass());
		
	
		
	}
	
	@Then("click signin button")
	public void click_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		click(call.getlp().getSignin());
		

	}

	
	
	
}
