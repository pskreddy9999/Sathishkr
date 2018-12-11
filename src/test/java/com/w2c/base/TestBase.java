package com.w2c.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import com.w2c.rough.TestProperties;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;

	@BeforeSuite
	public void setUp() throws IOException {

		if (driver == null) {

			// FileInputStream fis;
			try {
				fis = new FileInputStream(
						"D:\\workspace\\DataDriveFile\\src\\test\\resources\\properties\\config.properties");
				config.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("Webdriver.chrome.driver",
						"Webdriver.chrome.driver\", \"E:\\eclipse\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("Webdriver.gecko.driver", "E:\\eclipse\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(config.getProperty("browser").equals("IEbrowser")) {
				System.setProperty("Webdriver.iexplorer.driver", "E:\\eclipse\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
//			driver.get(config.getProperty("url"));

		}

	}

	@AfterSuite
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}

	}

}
