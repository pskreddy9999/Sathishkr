package com.w2c.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String[] args) throws IOException {
		 
		Properties config = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\DataDriveFile\\src\\test\\resources\\properties\\config.properties");
		
		config.load(fis);
       
//       System.out.println(prop.getProperty("URL"));
       String url = config.getProperty("URL");
       System.out.println(url);
       
//       System.out.println(prop.getProperty("browser"));
       String browName = config.getProperty("browser");
       System.out.println(browName);
       
       
       
       
	}

}
