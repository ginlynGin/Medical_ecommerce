package com.helper_File;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Config_Reader {

	public static Properties p; 
	
	public  Config_Reader() throws Throwable  {
		
		File f = new File("D:\\selenium Workspace\\Medical_Ecommerce\\src\\test\\java\\com\\helper_File\\Property.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
		
	}
	
	
	public String geturl() {
		
		String url = p.getProperty("url");
		return url;
	}
	
	public String username() {
		
		String username = p.getProperty("username");
		return username;
	}
	public String getpass() {
		String pass = p.getProperty("password");
		return pass;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
