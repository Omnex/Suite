package com.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	//Constructor--> To initialize the files from com.Properties  
	public Base() throws Exception{
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("G:\\Selenium tools\\EWQIMSProductBDD\\src\\main\\java\\Properties\\config.properties");
		
		prop.load(fis);
		
	}
	
	//open the browser using this method
	public static void start(){
		
		String s = prop.getProperty("browser");
		
		if(s.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omnex\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
			
			driver = new ChromeDriver();
			
		} else if(s.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\jar file\\geckodriver-v0.24.0-win64\\geckodriver.exe");	
			
			driver = new FirefoxDriver();
			
			
		} else if(s.equals("ie")){
			
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\jar files\\IEDriverServer_x64_3.14.0 (1)\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
