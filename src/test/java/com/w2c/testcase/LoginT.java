package com.w2c.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2c.base.TestBase;

//import com.w2c.base.TestBase;

public class LoginT extends TestBase{
	@Test
	public void Login() throws InterruptedException {
		
//		driver.get(config.getProperty("browser"));
		
		driver.get(config.getProperty("URL"));
		
		driver.findElement(By.xpath("btn_Xpath")).click();
		
		Thread.sleep(3000);
	}

}
