package com.base;
import com.Medical_Ecommerceb.Utility1;
import com.pageObjectModel.POM;
public class Base_class extends Utility1{
	public static void main(String[] args) throws Throwable {
		browser("chrome");
		launch_Url(File_readm.getinstancef().getinstancec().geturl());
		driver.manage().window().maximize();
		POM call = new POM(driver);	
		isleep(10);
		click(call.getlp().getLogin());
		isleep(10);
		send(call.getlp().getMail(),File_readm.getinstancef().getinstancec().username());
		send(call.getlp().getPwd(),File_readm.getinstancef().getinstancec().getpass());
		click(call.getlp().getSignin());

		click(call.getaddcart().getCont());
		click(call.getaddcart().getView());
		isleep(10);
		click(call.getaddcart().getAddc());		
		click(call.getaddcart().getCptc());
		click(call.getaddcart().getView1());
		isleep(10);
		click(call.getaddcart().getAdd2());
		isleep(10);
		click(call.getaddcart().getPtc());		

		isleep(10);
		click(call.getship().getBussiness());
		click(call.getship().getD1());
		click(call.getship().getD2());
		click(call.getship().getPayoption());
		send(call.getship().getComment(),"kindly deliver fast");
		click(call.getship().getCont1());
		click(call.getship().getCheckout());
		isleep(10);
		click(call.getship().getComplete());
	}
}

